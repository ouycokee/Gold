package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Image;
import entity.ProductMessage;

public class HomeDAO extends baseDAO{
	public List<ProductMessage> selectProx(){
		String sql = "select * from products_message LIMIT 0,6";
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
			
		});
	}
	public List<ProductMessage> selectPror(){
		String sql = "select * from products_message LIMIT 6,12";
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
			
		});
	}
	//新款图片
	public List<Image> selectxin(){
		String sql = "SELECT * FROM image LIMIT 0,6";
		return this.executeQuery(sql, new Mapper<Image>() {

			@Override
			public List<Image> map(ResultSet rs) throws SQLException {
				List<Image> list = new ArrayList<Image>();
				while(rs.next()) {
					Image img = new Image(rs.getInt(1),rs.getString(2),rs.getInt(3));
					list.add(img);
				}
				return list;
			}
		});
	}
	//热卖图片
	public List<Image> selectre(){
		String sql = "SELECT * FROM image LIMIT 6,12";
		return this.executeQuery(sql, new Mapper<Image>() {

			@Override
			public List<Image> map(ResultSet rs) throws SQLException {
				List<Image> list = new ArrayList<Image>();
				while(rs.next()) {
					Image img = new Image(rs.getInt(1),rs.getString(2),rs.getInt(3));
					list.add(img);
				}
				return list;
			}
		});
	}
	
}
