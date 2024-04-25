package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.ProductMessage;

public class SelectShopDAO extends baseDAO{
	//模糊查询名字
	public List<ProductMessage> seleCount(String pname){
	    String sql = "SELECT COUNT(*) AS 结果数量\r\n"
	    		+ "FROM (\r\n"
	    		+ "    SELECT p.Pro_id, p.Pro_name AS 商品名称, img.Image_url, pr.price\r\n"
	    		+ "    FROM products_message AS p\r\n"
	    		+ "    JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "    JOIN specs AS ps ON p.Pro_id = ps.Pro_id\r\n"
	    		+ "    JOIN sdetail AS sd ON ps.Spe_id = sd.Spe_id\r\n"
	    		+ "    JOIN combination AS pc ON sd.Deta_id = pc.Deta_id\r\n"
	    		+ "    JOIN price AS pr ON pc.Pri_id = pr.Pri_id\r\n"
	    		+ "    WHERE p.Pro_name LIKE ? AND p.Pro_id > 12\r\n"
	    		+ "    GROUP BY p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ ") AS 查询结果;";
	    // 在搜索关键字两侧添加 %
	    String searchKeyword = "%" + pname + "%";
	    return this.executeQuery(sql, new Mapper<ProductMessage>() {
	        
	        @Override
	        public List<ProductMessage> map(ResultSet rs) throws SQLException {
	            List<ProductMessage> list = new ArrayList<ProductMessage>();
	            while(rs.next()) {
	                ProductMessage pro = new ProductMessage(rs.getInt(1));
	                list.add(pro);
	            }
	            return list;
	        }
	    }, searchKeyword); // 将搜索关键字作为参数传递
	}
	//模糊查询名字
	public List<ProductMessage> seleNr(String pname){
	    String sql = "SELECT p.Pro_id, p.Pro_name AS 商品名称, img.Image_url, pr.price\r\n"
	    		+ "    FROM products_message AS p\r\n"
	    		+ "    JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "    JOIN specs AS ps ON p.Pro_id = ps.Pro_id\r\n"
	    		+ "    JOIN sdetail AS sd ON ps.Spe_id = sd.Spe_id\r\n"
	    		+ "    JOIN combination AS pc ON sd.Deta_id = pc.Deta_id\r\n"
	    		+ "    JOIN price AS pr ON pc.Pri_id = pr.Pri_id\r\n"
	    		+ "    WHERE p.Pro_name LIKE ? AND p.Pro_id > 12";
	    // 在搜索关键字两侧添加 %
	    String searchKeyword = "%" + pname + "%";
	    return this.executeQuery(sql, new Mapper<ProductMessage>() {
	        
	        @Override
	        public List<ProductMessage> map(ResultSet rs) throws SQLException {
	            List<ProductMessage> list = new ArrayList<ProductMessage>();
	            while(rs.next()) {
	                ProductMessage pro = new ProductMessage(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBigDecimal(4));
	                list.add(pro);
	            }
	            return list;
	        }
	    }, searchKeyword); // 将搜索关键字作为参数传递
	}

	public static void main(String[] args) {
		SelectShopDAO dao = new SelectShopDAO();
		System.out.println(dao.seleCount("周"));
	}
}
