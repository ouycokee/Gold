package Servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ShopCartDAO;
import entity.Cart;
import entity.Specs;

@WebServlet("/jsp/shopcart")
public class ShopCartServlet extends HttpServlet{
	ShopCartDAO shopdao = new ShopCartDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//最长
		String cname = req.getParameter("cname");
		String spenames = req.getParameter("spenames");
		cname += "," + spenames;
		String[] cnameArray = cname.split(",");
		//商品id
		String id = req.getParameter("proid");
		int proid = Integer.parseInt(id);
		//用户id
		HttpSession session = req.getSession();
		Integer uid = (Integer) session.getAttribute("uid");
		if(uid == null) {
        	req.setAttribute("shibai", "请先登录");
        	req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		//图片
		String image = req.getParameter("image");
		//价格
		String price = req.getParameter("cprice");
		BigDecimal cprice = new BigDecimal(price);
		//商品名字

		shopdao.Insertgwc(proid, image, cname, cprice, uid); 
		
		
		
		
		
		//商品规格名字
		List<Specs> listspename = shopdao.selectSpeName(Integer.parseInt(id));
		req.setAttribute("listspename", listspename);
		//商品价格
		String pricee = req.getParameter("price");
		req.setAttribute("price", pricee);
		//商品数量
		String sum = req.getParameter("sum");
		req.setAttribute("sum", sum);
		//购物车数量
		int cartsum = shopdao.selecount(uid);
		req.setAttribute("cartsum", cartsum);
		
		//购物车数据
		List<Cart> listcart = shopdao.seleCartAll(uid);
		for (Cart cartItem : listcart) {
		    String originalCname = cartItem.getCname();
		    int commaIndex = originalCname.indexOf(",");
		    String trimmedCname = (commaIndex != -1) ? originalCname.substring(0, commaIndex) : originalCname;
		    cartItem.setCname(trimmedCname); // 将截取后的字符串设置回 Cart 对象
		    
		}
		req.setAttribute("listcart", listcart);
		
		
		req.getRequestDispatcher("shopcart.jsp").forward(req, resp);
	}
}
