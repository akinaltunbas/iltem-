package controller;

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

@WebServlet("/laboratuvar")
public class KullaniciLaboratuvarController extends HttpServlet {
	
	private static String LIST ="/laboratuvar.jsp";
	
	private LaboratuvarDAO laboratuvarDAO;

	public KullaniciLaboratuvarController() {
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
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
