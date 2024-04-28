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
import entity.Order;
import entity.ProductMessage;
import entity.admin;

/**
 * Servlet implementation class chaxunServlet
 */
@WebServlet("/jsp/chaxunServlet")
public class chaxunServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		String panduan = request.getParameter("panduan");
		System.out.println(panduan);
		if(panduan.equals("yonghu")) {
			String tiaojian = request.getParameter("tiaojian");
			List<Information> l = hdao.InformationQuery(tiaojian);
			String html = hdao.zhuanhuanInformation(l);
			response.setContentType("text/html");
			response.getWriter().write(html);
		}else if(panduan.equals("dingdan")) {
			String tiaojian = request.getParameter("tiaojian");
			List<Order> l = hdao.orderQuery(tiaojian);
			String html = hdao.zhuanhuanOrder(l);
			response.setContentType("text/html");
			response.getWriter().write(html);
		}else if(panduan.equals("admin")) {
			String tiaojian = request.getParameter("tiaojian");
			List<admin> l = hdao.adminQuery(tiaojian);
			String html = hdao.zhuanhuanadmin(l);
			response.setContentType("text/html");
			response.getWriter().write(html);
		}else if(panduan.equals("product")) {
			String tiaojian = request.getParameter("tiaojian");
			List<ProductMessage> l = hdao.productQuery(tiaojian);
			String html = hdao.zhuanhuanProduct(l);
			response.setContentType("text/html");
			response.getWriter().write(html);
		}
	}

}
