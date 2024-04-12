package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Image;
import entity.ProductMessage;
import entity.Specs;

public class ShopCartDAO extends baseDAO{
	public List<Image> seleimg(Integer proid){
		String sql = "SELECT * FROM image WHERE pro_id = ? limit 1";
		return this.executeQuery(sql, new Mapper<Image>() {

			@Override
			public List<Image> map(ResultSet rs) throws SQLException {
				List<Image> list = new ArrayList<Image>();
				while(rs.next()) {
					Image img = new Image(rs.getInt(1), rs.getString(2), rs.getInt(3));
					list.add(img);
				}
				return list;
			}
			
		}, proid);
	}

	public List<ProductMessage> selectShopName(Integer proid){
	    String sql = "SELECT * FROM products_message WHERE pro_id = ?";
	    return this.executeQuery(sql, new Mapper<ProductMessage>() {
	        @Override
	        public List<ProductMessage> map(ResultSet rs) throws SQLException {
	            List<ProductMessage> list = new ArrayList<>();
	            while(rs.next()) {
	                ProductMessage pro = new ProductMessage(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
	                list.add(pro);
	            }
	            return list;
	        }
	    }, proid);
	}
	//查找商品有什么规格
	public List<Specs> selectSpeName(Integer proid){
		String sql = "SELECT * FROM specs WHERE pro_id = ?";
		return this.executeQuery(sql, new Mapper<Specs>() {

			@Override
			public List<Specs> map(ResultSet rs) throws SQLException {
				List<Specs> list = new ArrayList<Specs>();
				while(rs.next()) {
					Specs spe = new Specs(rs.getInt(1), rs.getInt(2), rs.getString(3));
					list.add(spe);
				}
				return list;
			}
			
		}, proid);
	}
	
//	public static void main(String[] args) {
//		ShopCartDAO dao = new ShopCartDAO();
//		dao.selectSpeName(1);
//	}
}
