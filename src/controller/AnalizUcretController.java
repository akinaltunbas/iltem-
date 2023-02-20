package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AnalizDAO;
import dao.AnalizDAOImpl;
import model.Analiz;



@WebServlet("/analizUcret")
public class AnalizUcretController extends HttpServlet {
	
	private static String LIST ="/analizUcret.jsp";
	
	private AnalizDAO analizDAO;
	
	public AnalizUcretController() {
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
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
