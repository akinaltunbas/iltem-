package adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.YoneticiDAO;
import dao.YoneticiDAOImpl;
import model.Yonetici;


@WebServlet("/yoneticiController")
public class YoneticiController extends HttpServlet {
	
	private static String INSERT="/admin/yoneticiInsert.jsp";
	private static String LIST="/admin/yoneticiList.jsp";
	private static String UPDATE="/admin/yoneticiUpdate.jsp";
	
	
	private YoneticiDAO yoneticiDAO;
	
	public YoneticiController() {
		super();
		 yoneticiDAO = new YoneticiDAOImpl();	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
		String forward="";
		String action=req.getParameter("action");
		
		if(action==null){
			
			List<Yonetici> yoneticilist=yoneticiDAO.getYoneticis();
			
			req.setAttribute("allYoneticis", yoneticilist);
			forward=LIST;
		}
		else if(action.equals("insert")){
			forward=INSERT;
		}
		else if(action.equals("delete")){
			int id=Integer.parseInt(req.getParameter("yoneticiId"));
			
			yoneticiDAO.removeYonetici(id);
			forward=LIST;
			req.setAttribute("allYoneticis", yoneticiDAO.getYoneticis());
		}
		else if(action.equals("update")){
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("yoneticiId"));
			Yonetici yonetici=new Yonetici();
			yonetici=yoneticiDAO.getYonetici(id);
			req.setAttribute("yonetici",yonetici);
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
		
	}
   
	
}
