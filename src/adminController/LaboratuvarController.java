package adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LaboratuvarDAO;
import dao.LaboratuvarDAOImpl;
import model.Laboratuvar;

@WebServlet("/laboratuvarController")
public class LaboratuvarController extends HttpServlet {
	
	private static String INSERT ="/admin/laboratuvarInsert.jsp";
	private static String LIST ="/admin/laboratuvarIndex.jsp";
	private static String UPDATE ="/admin/laboratuvarUpdate.jsp";
	
	
	
	private LaboratuvarDAO laboratuvarDAO;
	
	public LaboratuvarController() {
		super();
		laboratuvarDAO = new LaboratuvarDAOImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String forward = "";
		String action = req.getParameter("action");

		if (action == null) {
		List<Laboratuvar> laboratuvarList = laboratuvarDAO.getLaboratuvars();

		req.setAttribute("allLaboratuvars", laboratuvarList);
		forward = LIST;
		}
		else if (action.equals("insert")) {
			forward = INSERT;
		}
		else if(action.equals("delete")) {
			int id=Integer.parseInt(req.getParameter("laboratuvarId"));
			laboratuvarDAO.removeLaboratuvar(id);
			forward=LIST;
			req.setAttribute("allLaboratuvars",laboratuvarDAO.getLaboratuvars());
		}
		else if(action.equals("update")) {
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("laboratuvarId"));
			Laboratuvar lbr=new Laboratuvar();
			lbr=laboratuvarDAO.getLaboratuvar(id);
			req.setAttribute("Laboratuvar",lbr);
			
		}
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forwardPost;
      

		req.setCharacterEncoding("UTF-8"); 
		String laboratuvarId = req.getParameter("laboratuvarId");
		String laboratuvarAd = req.getParameter("laboratuvarAd");

		if (laboratuvarId == null) {
			if (validator.Validator.laboratuvarValidator(laboratuvarAd)) {
				laboratuvarDAO.insertLaboratuvar(laboratuvarAd);
				forwardPost = LIST;
				List<Laboratuvar> laboratuvarList = laboratuvarDAO.getLaboratuvars();
				req.setAttribute("allLaboratuvars", laboratuvarList);
			     } 
			else {
				String errMsg = "Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost = INSERT;
			}
		 } 
		 else{
			 if(validator.Validator.laboratuvarValidator(laboratuvarAd)) {
				int id=Integer.parseInt(laboratuvarId);
				laboratuvarDAO.updateLaboratuvar(id, laboratuvarAd);
				forwardPost = LIST;
				List<Laboratuvar> laboratuvarList = laboratuvarDAO.getLaboratuvars();
				req.setAttribute("allLaboratuvars", laboratuvarList);
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
