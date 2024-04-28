package Servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;
import entity.Information;

/**
 * Servlet implementation class orderServlet
 */
@WebServlet("/jsp/orderServlet")
public class orderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String curpageString = request.getParameter("curpage");
		String pagesizeString = request.getParameter("pagesize");
		if(curpageString==null||pagesizeString==null) {
			curpageString="1";
			pagesizeString="4";
		}
		int curpage = Integer.parseInt(curpageString);
		int pagesize = Integer.parseInt(pagesizeString);
		List<Information> ll = hdao.informationQueryId();
		System.out.println(ll);
		Map<String, Object> m = hdao.orderByPage(curpage, pagesize, "SELECT * FROM dd_Order o INNER JOIN information i ON o.`dd_UserID`=i.`id` ORDER BY dd_OrderID DESC limit ?,?", "select count(*) from dd_order");
		List l = (List) m.get("list");
		request.setAttribute("curpage", curpage);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("order", l);
		request.setAttribute("id", ll);
		request.setAttribute("total", m.get("total"));
		request.getRequestDispatcher("/jsp/dingdanxiangqing.jsp").forward(request, response);
	}
}
