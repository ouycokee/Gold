package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HomeDAO;
import DAO.PriceDAO;
import entity.Image;
import entity.Price;
import entity.ProductMessage;

@WebServlet("/jsp/home")
public class HomeServlet extends HttpServlet{
	HomeDAO homedao = new HomeDAO(); 
	PriceDAO pridao = new PriceDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//新品 
		List<ProductMessage> listprox = homedao.selectProx();
		//热卖
		List<ProductMessage> listpror = homedao.selectPror();
		List<Image> listimgx = homedao.selectxin();
		List<Image> listimgr = homedao.selectre();
		req.setAttribute("listpror", listpror);
		req.setAttribute("listprox", listprox);
		req.setAttribute("listimgx", listimgx);
		req.setAttribute("listimgr", listimgr);
		
		List<Price> listminpri = pridao.minPirce();
		req.setAttribute("listminpri", listminpri);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
}
