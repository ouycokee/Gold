package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;

/**
 * Servlet implementation class productInsertServlet
 */
@WebServlet("/jsp/productInsertServlet")
public class productInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		int fenlei = Integer.parseInt(request.getParameter("fenlei"));
		int zhuangtai = Integer.parseInt(request.getParameter("zhuangtai"));
		String yanzheng = request.getParameter("yanzheng");
		if(yanzheng.equals("1")) {
			hdao.ProductInsert("insert into product_message(pro_name,Cate_id,Pro_Status) values(?,?,?)", name, fenlei, zhuangtai);
		}else if(yanzheng.equals("2")) {
			int id = Integer.parseInt(request.getParameter("id"));
			hdao.ProductUpdate("update products_message set pro_name=?,cate_id=?,pro_status=? where pro_id=?", name, fenlei, zhuangtai, id);
		}
		request.getRequestDispatcher("/jsp/productServlet").forward(request, response);
	}

}
