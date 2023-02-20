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

import dao.KullaniciDAO;
import dao.KullaniciDAOImpl;
import model.Kullanici;


@WebServlet("/loginKullanici")
public class LoginKullaniciController extends HttpServlet {
	
	private KullaniciDAO kullaniciDAO;
	
	public LoginKullaniciController() {
		super();
		kullaniciDAO = new KullaniciDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/loginKullanici.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		String mail =req.getParameter("mail");
		String password =req.getParameter("password");
	    
	    
	    List<Kullanici> kullanicilist=kullaniciDAO.getKullanicis();
		
		
		for(Kullanici kln:kullanicilist){
				if(mail.equals(kln.getKullaniciMail()) & password.equals(kln.getKullaniciSifre())){
				HttpSession session=req.getSession();
				session.setAttribute("seviye", kln.getSeviye());
				session.setAttribute("id", kln.getKullaniciId());
				session.setAttribute("password", password);
				session.setAttribute("mail", mail);
				session.setAttribute("ad", kln.getKullaniciAd());
				session.setAttribute("soyad", kln.getKullaniciSoyad());
				System.out.println("kullanýcý baðlandý");
				
				resp.sendRedirect("kullaniciProfilController");
				return;
				}
		 
		}
	    			
		RequestDispatcher dispatcher = req.getRequestDispatcher("/loginKullanici.jsp");
		dispatcher.forward(req, resp);
		
		
	}
	

}
