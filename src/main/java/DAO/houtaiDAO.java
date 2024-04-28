package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import com.alibaba.fastjson2.internal.asm.MethodWriter;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Information;
import entity.Order;
import entity.ProductMessage;
import entity.Refund;
import entity.Review;
import entity.admin;

public class houtaiDAO extends baseDAO {
	public List<Information> InformationQuery(String sql){
		return this.executeQuery(sql,new Mapper<Information>() {
			@Override
			public List<Information> map(ResultSet rs) throws SQLException {
				List<Information> list = new ArrayList();
				while (rs.next()) {
					Information i = new Information(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6));
					list.add(i);
				}
				return list;
			}
		});
	}
	public List<Order> orderQuery(String sql){
		return this.executeQuery(sql,new Mapper<Order>() {
			@Override
			public List<Order> map(ResultSet rs) throws SQLException {
				List<Order> list = new ArrayList();
				while (rs.next()) {
					Order o = new Order(rs.getInt(1),
										rs.getInt(2),
										rs.getBigDecimal(3),
										rs.getInt(4),
										rs.getDate(5),
										rs.getString(6),
										rs.getString(7), 
										rs.getDate(8),
										rs.getString(9),
										rs.getInt(10),
										rs.getString(11),
										rs.getString(12),
										rs.getString(13),
										rs.getString(14),
										rs.getDate(15));
					list.add(o);
				}
				return list;
			}
		});
	}
	public List<admin> adminQuery(String sql){
		return this.executeQuery(sql,new Mapper<admin>() {
			@Override
			public List<admin> map(ResultSet rs) throws SQLException {
				List<admin> list = new ArrayList();
				while (rs.next()) {
					admin a = new admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getTimestamp(6));
					list.add(a);
				}
				return list;
			}
		});
	}
	public List<ProductMessage> productQuery(String sql){
		return this.executeQuery(sql,new Mapper<ProductMessage>() {
			@Override
			public List<ProductMessage> map(ResultSet rs) throws SQLException {
				List<ProductMessage> list = new ArrayList();
				while (rs.next()) {
					ProductMessage pm = new ProductMessage(rs.getInt(1),
														   rs.getString(2),
														   rs.getInt(3),
														   rs.getInt(4),
														   rs.getInt(5),
														   rs.getString(6));
					list.add(pm);
					System.out.println(pm);
				}
				return list;
			}
		});
	}
	public List<Review> reviewQuery(String sql){
		return this.executeQuery(sql,new Mapper<Review>() {
			@Override
			public List<Review> map(ResultSet rs) throws SQLException {
				List<Review> list = new ArrayList();
				while (rs.next()) {
					System.out.println(rs.getString(5));
					Review r = new Review(rs.getInt(1),
										  rs.getInt(2),
										  rs.getInt(3),
										  rs.getInt(4),
										  rs.getString(5),
										  rs.getDate(6),
										  rs.getInt(7),
										  rs.getInt(8),
										  rs.getBigDecimal(9),
										  rs.getInt(10),
										  rs.getDate(11),
										  rs.getString(12),
										  rs.getString(13),
										  rs.getDate(14),
										  rs.getString(15),
										  rs.getInt(16),
										  rs.getString(17),
										  rs.getInt(18),
										  rs.getInt(19));
					list.add(r);
					System.out.println(r);
				}
				return list;
			}
		});
	}
	public List<Refund> refundQuery(String sql){
		return this.executeQuery(sql,new Mapper<Refund>() {
			@Override
			public List<Refund> map(ResultSet rs) throws SQLException {
				List<Refund> list = new ArrayList();
				while (rs.next()) {
					Refund re = new Refund(rs.getInt(1),
										   rs.getInt(2),
										   rs.getString(3),
										   rs.getBigDecimal(4),
										   rs.getString(5),
										   rs.getDate(6),
										   rs.getInt(7),
										   rs.getInt(8),
										   rs.getBigDecimal(9));
					list.add(re);
					System.out.println(re);
				}
				return list;
			}
		});
	}
	
	public Map<String, Object> InforqueryByPage(int curpage, int pagesize,String sql,String sql2){
		List<Information> list = this.executeQuery(sql, new Mapper<Information>() {
			@Override
			public List<Information> map(ResultSet rs) throws SQLException {
				List<Information> list = new ArrayList<>();
				while(rs.next()) {
					Information inf = new Information(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5),
							rs.getDate(6));
					list.add(inf);
				}
				return list;
			}
		}, (curpage - 1) * pagesize, pagesize);
		
		Object obj = this.singleObject(sql2);
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("total", obj);
		return map;
	}
	public Map<String, Object> adminByPage(int curpage,int pagesize,String sql,String sql2){
		List<admin> list = this.executeQuery(sql, new Mapper<admin>() {

			@Override
			public List<admin> map(ResultSet rs) throws SQLException {
				List<admin> list = new ArrayList<>();
				while(rs.next()) {
					admin a = new admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getTimestamp(6));
					list.add(a);
				}
				return list;
			}
		},(curpage-1)*pagesize,pagesize);
		Object obj = this.singleObject(sql2);
		
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("total", obj);
		return map;
	}
	public Map<String, Object> productByPage(int curpage,int pagesize,String sql,String sql2){
		List<ProductMessage> list = this.executeQuery(sql, new Mapper<ProductMessage>() {
			@Override
			public List<ProductMessage> map(ResultSet rs) throws SQLException {
				List<ProductMessage> list = new ArrayList<>();
				while(rs.next()){
					ProductMessage pm = new ProductMessage(rs.getInt(1),
							   rs.getString(2),
							   rs.getInt(3),
							   rs.getInt(4),
							   rs.getInt(5),
							   rs.getString(6));
					list.add(pm);
				}
				return list;
			}
		},(curpage-1)*pagesize,pagesize);
		Object obj = this.singleObject(sql2);
		Map<String, Object>map  = new HashMap<>();
		map.put("list", list);
		map.put("total", obj);
		return map;
	}
	public Map<String, Object> orderByPage(int curpage,int pagesize,String sql,String sql2){
		List<Order> list = this.executeQuery(sql, new Mapper<Order>() {
			@Override
			public List<Order> map(ResultSet rs) throws SQLException {
				List<Order> list = new ArrayList();
				while (rs.next()) {
					Order o = new Order(rs.getInt(1),
										rs.getInt(2),
										rs.getBigDecimal(3),
										rs.getInt(4),
										rs.getDate(5),
										rs.getString(6),
										rs.getString(7), 
										rs.getDate(8),
										rs.getString(9),
										rs.getInt(10),
										rs.getString(11),
										rs.getString(12),
										rs.getString(13),
										rs.getString(14),
										rs.getDate(15));
					list.add(o);
				}
				return list;
			}
		},(curpage-1)*pagesize,pagesize);
		Object obj = this.singleObject(sql2);
		Map<String, Object>map  = new HashMap<>();
		map.put("list", list);
		map.put("total", obj);
		return map;
	}
	public int InformationInsert(String sql,String name,String pwd,String email,String gender,String birthday) {
//		String sql = "insert into Information(username,ipassword,email,gender,birthday) values(?,?,?,?,?)";
		return this.execute(sql, name,pwd,email,gender,birthday);
	}
	public int InformationUpdate(String sql,String name,String pwd,String email,String gender,String birthday,String id) {
		return this.execute(sql, name,pwd,email,gender,birthday,id);
	}
	public int AdminInser(String sql,String adminName,String adminPassword,String adminContact,int adminRole,String adminCreateTime) {
		return this.execute(sql, adminName,adminPassword,adminContact,adminRole,adminCreateTime);
	}
	public int AdminUpdate(String sql,String adminName,String adminPassword,String adminContact,int adminRole,String adminCreateTime,int adminId) {
		return this.execute(sql,adminName,adminPassword,adminContact,adminRole,adminCreateTime,adminId);
	}
	public int ProductInsert(String sql,int proId,String proName,int categoryId,int proStatus,int Cate_id,String Cate_name) {
		return this.execute(sql,proName,categoryId,proStatus,Cate_id,Cate_name);
	}
	public int ProductUpdate(String sql,String proName,int categoryId,int proStatus,int Cate_id,String Cate_name,int proId) {
		return this.execute(sql,proName,categoryId,proStatus,Cate_id,Cate_name,proId);
	}

}
