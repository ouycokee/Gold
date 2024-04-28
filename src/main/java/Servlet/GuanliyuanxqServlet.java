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
@WebServlet("/jsp/GuanliyuanxqServlet")
public class GuanliyuanxqServlet extends HttpServlet {
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
		Map<String, Object> m = hdao.adminByPage(curpage, pagesize, "select * from admin limit ?,?","select count(*) from admin");
		List l = (List) m.get("list");
		System.out.println(l);
		request.setAttribute("curpage", curpage);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("admin", l);
		request.setAttribute("total", m.get("total"));
		request.getRequestDispatcher("/jsp/Guanlixuanxiangqing.jsp").forward(request, response);
	}

}


