package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.YoneticiDAO;
import dao.YoneticiDAOImpl;
import model.Yonetici;



@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	private YoneticiDAO yoneticiDAO;
	
	
	public LoginController() {
		super();
		
		yoneticiDAO = new YoneticiDAOImpl();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		String mail =req.getParameter("mail");
		String password =req.getParameter("password");
	    
	    
	    List<Yonetici> yoneticilist=yoneticiDAO.getYoneticis();
		
		
		for(Yonetici ynt:yoneticilist){
				if(mail.equals(ynt.getYoneticiMail()) & password.equals(ynt.getYoneticiSifre())){
				HttpSession session=req.getSession();
				
				session.setAttribute("mail", mail);
				session.setAttribute("ad", ynt.getYoneticiAd());
				session.setAttribute("soyad", ynt.getYoneticiSoyad());
				System.out.println("baðlandý");
				
				resp.sendRedirect("laboratuvarController");
				return;
				}
		 
		}
	    			
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	
}
