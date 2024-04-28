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
 * Servlet implementation class yonghuServlet
 */
@WebServlet("/jsp/yonghuServlet")
public class yonghuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String curpageString = request.getParameter("curpage");
		String pagesizeString = request.getParameter("pagesize");
		if(curpageString==null||pagesizeString==null) {
			curpageString="1";
			pagesizeString="4";
		}
		int curpage = Integer.parseInt(curpageString);
		System.out.println(curpage);
		int pagesize = Integer.parseInt(pagesizeString);
		System.out.println(pagesize);
		Map<String, Object> m = hdao.InforqueryByPage(curpage, pagesize, "select * from Information limit ?,?", "select count(*) from Information");
		List l = (List) m.get("list");
		request.setAttribute("curpage", curpage);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("information", l);
		request.setAttribute("total", m.get("total"));
		request.getRequestDispatcher("/jsp/Yonghuxiangqing.jsp").forward(request, response);
	}

}
