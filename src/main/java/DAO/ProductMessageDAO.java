package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Image;
import entity.ProductMessage;
import entity.SpecDetail;
import entity.Specs;

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
	                ProductMessage pro = new ProductMessage(rs.getString(1)); // 使用索引1获取商品的名称
	                list.add(pro);
	            }
	            return list;
	        }
	    }, proid);
	}
	//查找此商品的规格
	public List<Specs> selectSpecs(Integer proid){
		String sql = "SELECT spe.*\r\n"
				+ "FROM specs spe\r\n"
				+ "LEFT JOIN sdetail deta ON spe.Spe_id = deta.Spe_id\r\n"
				+ "WHERE spe.Pro_id = ? GROUP BY spe.Spe_id;";
		return this.executeQuery(sql, new Mapper<Specs>() {

			@Override
			public List<Specs> map(ResultSet rs) throws SQLException {
				List<Specs> list = new ArrayList<Specs>();
				while(rs.next()) {
					Specs pro = new Specs(rs.getInt(1), rs.getInt(2), rs.getString(3));
					list.add(pro);
				}
				return list;
			}
			
		}, proid);
	}
	
	public List<SpecDetail> selectDetail(Integer detaid){
		String sql = "SELECT deta.*\r\n"
				+ "FROM specs spe\r\n"
				+ "JOIN sdetail deta ON spe.Spe_id = deta.Spe_id\r\n"
				+ "WHERE spe.Spe_id = ?;";
		return this.executeQuery(sql, new Mapper<SpecDetail>() {

			@Override
			public List<SpecDetail> map(ResultSet rs) throws SQLException {
				List<SpecDetail> list = new ArrayList<SpecDetail>();
				while(rs.next()) {
					list.add( new SpecDetail(rs.getInt(1), rs.getInt(2), rs.getString(3)));
				}
				return list;
			}
			
		}, detaid);
	}
	
	
}
