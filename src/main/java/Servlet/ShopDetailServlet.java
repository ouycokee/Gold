package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson2.JSONObject;

import DAO.PriceDAO;
import entity.Price;
@WebServlet("/jsp/shopdetail")
public class ShopDetailServlet extends HttpServlet{
	PriceDAO pridao = new PriceDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String proid = req.getParameter("proid");
		String detail = req.getParameter("detils");
		
		List<Price> listpri = pridao.proPrice(Integer.parseInt(proid), detail);
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("listpri", listpri);
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println(jsonObj.toJSONString());
		
	}
}
