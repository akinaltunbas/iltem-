package adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Analiz;

import dao.AnalizDAO;
import dao.AnalizDAOImpl;

@WebServlet("/analizController")
public class AnalizController extends HttpServlet {
	
	private static String INSERT ="/admin/analizInsert.jsp";
	private static String LIST ="/admin/analizList.jsp";
	private static String UPDATE ="/admin/analizUpdate.jsp";
	
	
	
	private AnalizDAO analizDAO;
	
	public AnalizController() {
		super();
		analizDAO = new AnalizDAOImpl();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String forward = "";
		String action = req.getParameter("action");

		if (action == null) {
			
		List<Analiz> analizList = analizDAO.getAnalizs();

		req.setAttribute("allAnalizs", analizList);
		forward = LIST;
		}
		else if (action.equals("insert")) {
			forward = INSERT;
		}
		else if(action.equals("delete")) {
			int id=Integer.parseInt(req.getParameter("analizId"));
			analizDAO.removeAnaliz(id);
			forward=LIST;
			req.setAttribute("allAnalizs",analizDAO.getAnalizs());
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forwardPost;
	      
	       
		req.setCharacterEncoding("UTF-8"); 
		String analizId = req.getParameter("id");
		String analizAd =req.getParameter("analizAd");
		String analizFiyat= req.getParameter("analizFiyat");
		int cihId = Integer.parseInt(req.getParameter("cihId"));
	    
		if (analizId  == null) {
			if (analizAd !=null) {
				analizDAO.insertAnaliz(analizAd,analizFiyat,cihId);
				forwardPost = LIST;
				List<Analiz> analizList = analizDAO.getAnalizs();
				req.setAttribute("allAnalizs", analizList);
			     } 
			else {
				String errMsg = "Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost = INSERT;
			}
		 } 
		 else{
			 if(analizAd != null) {
				int id = Integer.parseInt(analizId);
				analizDAO.updateAnazliz(id, analizAd, analizFiyat, cihId);
				forwardPost = LIST;
				List<Analiz> analizList = analizDAO.getAnalizs();
				req.setAttribute("allAnalizs", analizList);
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
	
	

