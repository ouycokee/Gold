package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.ProductMessage;

public class SelectShopDAO extends baseDAO{
	public List<ProductMessage> seleCount(String pname){
	    String sql = "SELECT COUNT(*)\r\n"
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
	            if (rs.next()) {
	                ProductMessage pro = new ProductMessage(rs.getInt(1));
	                list.add(pro);
	            }
	            return list;
	        }
	    }, searchKeyword);
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

	//查询所有商品
	public List<ProductMessage> seleAll(){
	    String sql = "SELECT p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ "FROM products_message AS p\r\n"
	    		+ "JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "JOIN specs AS sp ON sp.Pro_id = p.Pro_id \r\n"
	    		+ "JOIN sdetail AS sd ON sd.Spe_id = sp.Spe_id\r\n"
	    		+ "JOIN combination AS co ON co.Deta_id = sd.Deta_id\r\n"
	    		+ "JOIN price AS pr ON pr.Pri_id = co.Pri_id\r\n"
	    		+ "WHERE p.Pro_id > 12;";
	    // 在搜索关键字两侧添加 %
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
	    }); 
	}
	
	//查询商品类型
	public List<ProductMessage> seleType(String type){
	    String sql = "SELECT p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ "FROM products_message AS p\r\n"
	    		+ "JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "JOIN specs AS sp ON sp.Pro_id = p.Pro_id \r\n"
	    		+ "JOIN sdetail AS sd ON sd.Spe_id = sp.Spe_id\r\n"
	    		+ "JOIN combination AS co ON co.Deta_id = sd.Deta_id\r\n"
	    		+ "JOIN price AS pr ON pr.Pri_id = co.Pri_id\r\n"
	    		+ "JOIN category AS c ON p.Cate_id = c.Cate_id\r\n"
	    		+ "WHERE c.Cate_name like ? AND p.Pro_id > 12;";
	    
	    String searchKeyword = "%" + type + "%";
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
	    }, searchKeyword);
	}

	//价格由高到低
	public List<ProductMessage> seleGao(){
	    String sql = "SELECT p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ "FROM products_message AS p\r\n"
	    		+ "JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "JOIN specs AS sp ON sp.Pro_id = p.Pro_id \r\n"
	    		+ "JOIN sdetail AS sd ON sd.Spe_id = sp.Spe_id\r\n"
	    		+ "JOIN combination AS co ON co.Deta_id = sd.Deta_id\r\n"
	    		+ "JOIN price AS pr ON pr.Pri_id = co.Pri_id\r\n"
	    		+ "WHERE p.Pro_id > 12\r\n"
	    		+ "ORDER BY pr.price DESC;";
	    // 在搜索关键字两侧添加 %
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
	    }); 
	}
	//价格由低到高
	public List<ProductMessage> seleDi(){
	    String sql = "SELECT p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ "FROM products_message AS p\r\n"
	    		+ "JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "JOIN specs AS sp ON sp.Pro_id = p.Pro_id \r\n"
	    		+ "JOIN sdetail AS sd ON sd.Spe_id = sp.Spe_id\r\n"
	    		+ "JOIN combination AS co ON co.Deta_id = sd.Deta_id\r\n"
	    		+ "JOIN price AS pr ON pr.Pri_id = co.Pri_id\r\n"
	    		+ "WHERE p.Pro_id > 12\r\n"
	    		+ "ORDER BY pr.price ASC;";
	    // 在搜索关键字两侧添加 %
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
	    }); 
	}
	//最新上架
	public List<ProductMessage> seleNew(){
	    String sql = "SELECT p.Pro_id, p.Pro_name, img.Image_url, pr.price\r\n"
	    		+ "FROM products_message AS p\r\n"
	    		+ "JOIN image AS img ON p.Pro_id = img.Pro_id\r\n"
	    		+ "JOIN specs AS sp ON sp.Pro_id = p.Pro_id \r\n"
	    		+ "JOIN sdetail AS sd ON sd.Spe_id = sp.Spe_id\r\n"
	    		+ "JOIN combination AS co ON co.Deta_id = sd.Deta_id\r\n"
	    		+ "JOIN price AS pr ON pr.Pri_id = co.Pri_id\r\n"
	    		+ "WHERE p.Pro_id > 12\r\n"
	    		+ "ORDER BY p.Pro_id DESC;";
	    // 在搜索关键字两侧添加 %
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
	    }); 
	}
//	public static void main(String[] args) {
//		SelectShopDAO dao = new SelectShopDAO();
//		System.out.println(dao.seleGao());
//	}
}
