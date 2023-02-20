package kullaniciController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KullaniciDAO;
import dao.KullaniciDAOImpl;

import model.Kullanici;



@WebServlet("/kullaniciProfilController")
public class KullaniciProfilController extends HttpServlet {
	
	
	private static String UPDATE ="/kullanici/kullaniciProfilUpdate.jsp";
	private static String INSERT ="/kullanici/kullaniciProfilDetails.jsp";
	private static String LIST ="/kullanici/kullaniciProfil.jsp";
	
	private KullaniciDAO kullaniciDAO;

	public KullaniciProfilController() {
		super();
		kullaniciDAO = new KullaniciDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String forward = "";
		String action = req.getParameter("action");

		if (action == null) {
		List<Kullanici> kullaniciList = kullaniciDAO.getKullanicis();

		req.setAttribute("allKullanicis", kullaniciList);
		forward=LIST;
		
		}
		else if(action.equals("insert")){
			forward=INSERT;
		}
		else if(action.equals("update")){
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("kullaniciId"));
			Kullanici kullanici=new Kullanici();
			kullanici=kullaniciDAO.getKullanici(id);
			req.setAttribute("Kullanici",kullanici);
		}
		else if(action.equals("details")){
			forward=INSERT;
			int id=Integer.parseInt(req.getParameter("kullaniciId"));
			Kullanici kullanici=new Kullanici();
			kullanici=kullaniciDAO.getKullanici(id);
			req.setAttribute("Kullanici",kullanici);
		}
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		String forwardPost;
		
		req.setCharacterEncoding("UTF-8");
		
		String kullaniciId=req.getParameter("kullaniciId");
		String kullaniciAd=req.getParameter("kullaniciAd");
		String kullaniciSoyad=req.getParameter("kullaniciSoyad");
		String kullaniciMail=req.getParameter("kullaniciMail");
		String kullaniciSifre=req.getParameter("kullaniciSifre");
		String seviye=req.getParameter("seviye");
		
		
		if (kullaniciId  == null) {
			if (validator.Validator.kullaniciVaidator(kullaniciAd, kullaniciSoyad, kullaniciMail, kullaniciSifre, seviye)) {
				kullaniciDAO.insertKullanici(kullaniciAd,kullaniciSoyad,kullaniciMail,kullaniciSifre,seviye);
				forwardPost = LIST;
				List<Kullanici> kullaniciList = kullaniciDAO.getKullanicis();
				req.setAttribute("allKullanicis", kullaniciList);
			     } 
			else {
				String errMsg = "Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost = INSERT;
			}
		 } 
		 else{
			 if(validator.Validator.kullaniciVaidator(kullaniciAd, kullaniciSoyad, kullaniciMail, kullaniciSifre, seviye)) {
				int id = Integer.parseInt(kullaniciId);
				kullaniciDAO.updateKullanici(id, kullaniciAd,kullaniciSoyad,kullaniciMail,kullaniciSifre,seviye);
				forwardPost = LIST;
				List<Kullanici> kullaniciList = kullaniciDAO.getKullanicis();
				req.setAttribute("allKullanicis", kullaniciList);
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



