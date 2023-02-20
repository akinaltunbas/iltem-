package kullaniciController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/kullaniciLogoutController")
public class KullaniciLogoutController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession();
		session.removeAttribute("mail");
		session.invalidate();
		System.out.println("Kullanýcý Çýkýþ Yaptý!!!");
		resp.sendRedirect("index.jsp");
	}

}
