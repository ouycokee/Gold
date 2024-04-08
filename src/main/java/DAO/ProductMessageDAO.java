package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Image;
import entity.ProductMessage;

public class ProductMessageDAO extends baseDAO{
	// 查找商品的图片
	public List<Image> selectShopImage(Integer proid) {
	    String sql = "SELECT Image_url FROM image WHERE Pro_id = ?";
	    return this.executeQuery(sql, new Mapper<Image>() {
	        @Override
	        public List<Image> map(ResultSet rs) throws SQLException {
	            List<Image> list = new ArrayList<Image>();
	            while (rs.next()) {
	                Image img = new Image(rs.getString(1));
	                list.add(img);
	            }
	            return list;
	        }
	    }, proid);
	}

	// 查找商品的名字
	public List<ProductMessage> selectShopName(Integer proid) {
	    String sql = "SELECT Pro_name FROM products_message WHERE Pro_id = ?";
	    return this.executeQuery(sql, new Mapper<ProductMessage>() {
	        @Override
	        public List<ProductMessage> map(ResultSet rs) throws SQLException {
	            List<ProductMessage> list = new ArrayList<ProductMessage>();
	            while (rs.next()) {
	                ProductMessage pro = new ProductMessage(rs.getInt(1),rs.getString(1),rs.getInt(2),rs.getInt(3)); // 使用索引1获取商品的名称
	                list.add(pro);
	            }
	            return list;
	        }
	    }, proid);
	}
	//查找此商品的所有规格
	public List<ProductMessage> selectAllDetail(Integer proid){
		String sql = "SELECT pro.Pro_id, spe.Spe_id, deta.detail\r\n"
				+ "FROM products_message pro\r\n"
				+ "JOIN specs spe ON pro.Pro_id = spe.Pro_id\r\n"
				+ "JOIN sdetail deta ON spe.Spe_id = deta.Spe_id\r\n"
				+ "WHERE pro.Pro_id = ?;";
		return this.executeQuery(sql, new Mapper<ProductMessage>() {

			@Override
			public List<ProductMessage> map(ResultSet rs) throws SQLException {
				List<ProductMessage> list = new ArrayList<ProductMessage>();
				while(rs.next()) {
					ProductMessage pro = new ProductMessage(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
					list.add(pro);
				}
				return list;
			}
			
		}, proid);
	}
}
