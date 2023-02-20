package adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CihazDAO;
import dao.CihazDAOImpl;
import model.Cihaz;



@WebServlet("/cihazController")
public class CihazController extends HttpServlet {
	
	
	private static String INSERT ="/admin/cihazInsert.jsp";
	private static String LIST ="/admin/cihazIndex.jsp";
	private static String UPDATE ="/admin/cihazUpdate.jsp";
	

	private CihazDAO cihazDAO;

	public CihazController() {
		super();
		cihazDAO = new CihazDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String forward = "";
		String action = req.getParameter("action");

		if (action == null) {
			
		List<Cihaz> cihazList = cihazDAO.getCihazs();

		req.setAttribute("allCihazs", cihazList);
		forward = LIST;
		}
		else if (action.equals("insert")) {
			forward = INSERT;
		}
		else if(action.equals("delete")) {
			int id=Integer.parseInt(req.getParameter("cihazId"));
			cihazDAO.removeCihaz(id);
			forward=LIST;
			req.setAttribute("allCihazs",cihazDAO.getCihazs());
		}
		else if(action.equals("update")) {
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("cihazId"));
			Cihaz chz=new Cihaz();
			chz=cihazDAO.getCihaz(id);
			req.setAttribute("Cihaz",chz);
			
		}
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forwardPost;
      
       
		req.setCharacterEncoding("UTF-8"); 
		String cihazId = req.getParameter("id");
		String cihazAd =req.getParameter("cihazAd");
		int labId = Integer.parseInt(req.getParameter("labId"));
		
		if (cihazId  == null) {
			if (cihazAd !=null) {
				cihazDAO.insertCihaz(cihazAd,labId);
				forwardPost = LIST;
				List<Cihaz> cihazList = cihazDAO.getCihazs();
				req.setAttribute("allCihazs", cihazList);
			     } 
			else {
				String errMsg = "Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost = INSERT;
			}
		 } 
		 else{
			 if(cihazAd != null) {
				int id = Integer.parseInt(cihazId);
				cihazDAO.updateCihaz(id, cihazAd,labId);
				forwardPost = LIST;
				List<Cihaz> cihazList = cihazDAO.getCihazs();
				req.setAttribute("allCihazs", cihazList);
			    }
		     else{
				String errMsg = "Uygun giriþ yapýlmadý!.Güncelleme Baþarýsýz";
				req.setAttribute("errMsg", errMsg);
				forwardPost = UPDATE;
			}

		 }

		RequestDispatcher dispatcher = req.getRequestDispatcher(forwardPost);
		dispatcher.forward(req, resp);
	}

}
