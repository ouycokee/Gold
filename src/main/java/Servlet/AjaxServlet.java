package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;
import entity.Information;

/**
 * Servlet implementation class InformationServlet
 */
@WebServlet("/jsp/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String curpageString = request.getParameter("curpage");
		String pagesizeString = request.getParameter("pagesize");
		if(curpageString==null||pagesizeString==null) {
			curpageString="1";
			pagesizeString="3";
		}
		int curpage = Integer.parseInt(curpageString);
		int pagesize = Integer.parseInt(pagesizeString);
		String action = request.getParameter("action");
		System.out.println(curpage);
		System.out.println(pagesize);
		System.out.println(action);
//		if(action.equals("getData1")) {
////			String html = hdao.InfoQueryToHTML("select * from Information order by id desc");
//			String html = hdao.InfoQueryToHTMLtwo(curpage, pagesize, "select * from information limit ?,?", "select Count(*) from information");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}else if(action.equals("getData2")) {
//			String html = hdao.OrQueryToHTML("SELECT * FROM dd_Order o INNER JOIN information i ON o.`dd_UserID`=i.`id` ORDER BY dd_OrderID DESC");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}else if(action.equals("getData3")) {
//			String html = hdao.adQueryToHTML("select * from Admin order by Admin_role desc");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}else if(action.equals("getData4")) {
//			String html = hdao.prQueryToHTML("SELECT * FROM Products_message p INNER JOIN Category c ON p.`Cate_id`=c.`Cate_id` ORDER BY p.`Pro_id` DESC");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}else if(action.equals("getData5")) {
//			String html = hdao.reQueryToHTML("SELECT * FROM pl_Reviews AS pl INNER JOIN dd_order AS dd ON pl.`dd_OrderID`=dd.`dd_OrderID` INNER JOIN products_message AS pr ON pl.`Pro_id`=pr.`Pro_id` INNER JOIN category AS ca ON pr.`Cate_id`=ca.`Cate_id` ORDER BY pl.`pl_ReviewID` DESC");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}else if(action.equals("getData6")) {
//			String html = hdao.refQueryToHTML("SELECT tk.*,dd.`dd_OrderID`,dd.`dd_UserID`,dd.`dd_TotalPrice` FROM tk_Refunds AS tk INNER JOIN dd_order AS dd ON tk.`dd_OrderID`=dd.`dd_OrderID`");
//			response.setContentType("text/html");
//			response.getWriter().write(html);
//		}
	}
}
