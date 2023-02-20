package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/loginSecim")
public class loginSecimController extends HttpServlet {
	
	private static String KULLANICI ="/loginKullanici.jsp";
	private static String YONETICI ="/login.jsp";
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String forward = "";
		String action = req.getParameter("action");

		if (action.equals("kullanici")) {
		

		
		forward = KULLANICI;
		}
		else if (action.equals("yonetici")) {
			forward = YONETICI;
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

