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
	public List<Information> InformationQuery(String tiaojian){
		String sql ="select * from Information where username like ?";
		String tj = "%"+tiaojian+"%";
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
		},tj);
	}
	public List<Information> informationQueryId(){
		String sql = "select id from information";
		return this.executeQuery(sql,new Mapper<Information>() {

			@Override
			public List<Information> map(ResultSet rs) throws SQLException {
				List<Information> list = new ArrayList();
				while (rs.next()) {
					Information i = new Information(rs.getInt(1));
					list.add(i);
				}
				return list;
			}
		});
	}
	public List<ProductMessage> productQueryId(){
		String sql = "select Pro_id from products_message order by Pro_id DESC";
		return this.executeQuery(sql,new Mapper<ProductMessage>() {

			@Override
			public List<ProductMessage> map(ResultSet rs) throws SQLException {
				List<ProductMessage> list = new ArrayList();
				while (rs.next()) {
					ProductMessage p = new ProductMessage(rs.getInt(1));
					list.add(p);
				}
				return list;
			}
		});
	}
	public String zhuanhuanInformation(List<Information> datalist) {
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<table>");
		htmlBuilder.append("<tr>");
		htmlBuilder.append("<th>ID</th>");
		htmlBuilder.append("<th>用户名</th>");
		htmlBuilder.append("<th>密码</th>");
		htmlBuilder.append("<th>邮箱</th>");
		htmlBuilder.append("<th>性别</th>");
		htmlBuilder.append("<th>出生日期</th>");
		htmlBuilder.append("</tr>");
		for(Information inf:datalist) {
			htmlBuilder.append("<tr>");
			htmlBuilder.append("<td>").append(inf.getId()).append("</td>");
			htmlBuilder.append("<td>").append(inf.getUsername()).append("</td>");
			htmlBuilder.append("<td>").append(inf.getPassword()).append("</td>");
			htmlBuilder.append("<td>").append(inf.getEmail()).append("</td>");
			htmlBuilder.append("<td>").append(inf.getGender()).append("</td>");
			htmlBuilder.append("<td>").append(inf.getBirthday()).append("</td>");
			htmlBuilder.append("</tr>");
		}
		htmlBuilder.append("</table>");
		return htmlBuilder.toString();
	}
	public int deleteInformation(int id) {
		String sql="delete from information where id=?";
		return this.execute(sql, id);
	}
	public int deleteOrder(int id) {
		String sql="DELETE FROM dd_order WHERE dd_OrderID=?";
		return this.execute(sql, id);
	}
	public int deleteAdmin(int id) {
		String sql="delete from Admin where admin_id = ?";
		return this.execute(sql, id);
	}
	public int deleteProduct(int id) {
		String sql="delete from ProductMessage where pro_id=?";
		return this.execute(sql, id);
	}
	public List<Order> orderQuery(String tiaojian){
		String sql="SELECT * FROM dd_Order o INNER JOIN information i ON o.`dd_UserID`=i.`id`  WHERE i.username LIKE ? ORDER BY dd_OrderID DESC";
		String tj ="%"+tiaojian+"%";
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
		},tj);
	}
	public String zhuanhuanOrder(List<Order> datalist) {
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<table>");
		htmlBuilder.append("<tr>");
		htmlBuilder.append("<th>ID</th>");
		htmlBuilder.append("<th>用户ID</th>");
		htmlBuilder.append("<th>订单总价</th>");
		htmlBuilder.append("<th>订单状态</th>");
		htmlBuilder.append("<th>下单时间</th>");
		htmlBuilder.append("<th>送货地址</th>");
		htmlBuilder.append("<th>送货电话</th>");
		htmlBuilder.append("<th>送货时间</th>");
		htmlBuilder.append("<th>送货备注</th>");
		htmlBuilder.append("<th>用户名</th>");
		htmlBuilder.append("<th>密码</th>");
		htmlBuilder.append("<th>邮箱</th>");
		htmlBuilder.append("<th>性别</th>");
		htmlBuilder.append("<th>出生日期</th>");
		htmlBuilder.append("</tr>");
		for(Order or : datalist) {
			htmlBuilder.append("<tr>");
			htmlBuilder.append("<td>").append(or.getOrderId()).append("</td>");
			htmlBuilder.append("<td>").append(or.getUserId()).append("</td>");
			htmlBuilder.append("<td>").append(or.getTotalPrice()).append("</td>");
			htmlBuilder.append("<td>").append(or.getStatus()).append("</td>");
			htmlBuilder.append("<td>").append(or.getCreateTime()).append("</td>");
			htmlBuilder.append("<td>").append(or.getAddress()).append("</td>");
			htmlBuilder.append("<td>").append(or.getPhone()).append("</td>");
			htmlBuilder.append("<td>").append(or.getDeliveryTime()).append("</td>");
			htmlBuilder.append("<td>").append(or.getNote()).append("</td>");
			htmlBuilder.append("<td>").append(or.getUsername()).append("</td>");
			htmlBuilder.append("<td>").append(or.getPassword()).append("</td>");
			htmlBuilder.append("<td>").append(or.getEmail()).append("</td>");
			htmlBuilder.append("<td>").append(or.getGender()).append("</td>");
			htmlBuilder.append("<td>").append(or.getBirthday()).append("</td>");
			htmlBuilder.append("</tr>");
		}
		htmlBuilder.append("</table>");
		return htmlBuilder.toString();
	}
	public List<admin> adminQuery(String tiaojian){
		String sql = "select * from admin where Admin_name like ?";
		String tj = "%"+tiaojian+"%";
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
		},tj);
	}
	public String zhuanhuanadmin(List<admin> datalist){
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<table>");
		htmlBuilder.append("<tr>");
		htmlBuilder.append("<th>ID</th>");
		htmlBuilder.append("<th>管理员名称</th>");
		htmlBuilder.append("<th>管理员密码</th>");
		htmlBuilder.append("<th>管理员联系方式</th>");
		htmlBuilder.append("<th>管理员权限</th>");
		htmlBuilder.append("<th>创建时间</th>");
		htmlBuilder.append("</tr>");
		for(admin ad:datalist) {
			htmlBuilder.append("<tr>");
			htmlBuilder.append("<td>").append(ad.getAdminId()).append("</td>");
			htmlBuilder.append("<td>").append(ad.getAdminName()).append("</td>");
			htmlBuilder.append("<td>").append(ad.getAdminPassword()).append("</td>");
			htmlBuilder.append("<td>").append(ad.getAdminContact()).append("</td>");
			htmlBuilder.append("<td>").append((ad.getAdminRole()==1?"低级管理员":"高级管理员")).append("</td>");
			htmlBuilder.append("<td>").append(ad.getAdminCreateTime()).append("</td>");
			htmlBuilder.append("</tr>");
		}
		htmlBuilder.append("</table>");
		return htmlBuilder.toString();
	}
	public List<ProductMessage> productQuery(String tiaojian){
		String sql="SELECT * FROM Products_message p INNER JOIN Category c ON p.`Cate_id`=c.`Cate_id` WHERE p.`Pro_name` LIKE ? ORDER BY p.`Pro_id` DESC";
		String tj = "%"+tiaojian+"%";
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
		},tj);
	}
	public String zhuanhuanProduct(List<ProductMessage> datalist) {
		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<table>");
		htmlBuilder.append("<tr>");
		htmlBuilder.append("<th>ID</th>");
		htmlBuilder.append("<th>商品名称</th>");
		htmlBuilder.append("<th>商品分类ID</th>");
		htmlBuilder.append("<th>上架状态</th>");
		htmlBuilder.append("<th>分类ID</th>");
		htmlBuilder.append("<th>分类名称</th>");
		htmlBuilder.append("</tr>");
		for(ProductMessage pm :datalist) {
			htmlBuilder.append("<tr>");
			htmlBuilder.append("<td>").append(pm.getProId()).append("</td>");
			htmlBuilder.append("<td>").append(pm.getProName()).append("</td>");
			htmlBuilder.append("<td>").append(pm.getCategoryId()).append("</td>");
			htmlBuilder.append("<td>").append((pm.getProStatus()==1?"已上架":"未上架")).append("</td>");
			htmlBuilder.append("<td>").append(pm.getCate_id()).append("</td>");
			htmlBuilder.append("<td>").append(pm.getCate_name()).append("</td>");
			htmlBuilder.append("</tr>");
		}
		
		htmlBuilder.append("</table>");
		return htmlBuilder.toString();
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
		}, (curpage-1) * pagesize, pagesize);
		
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
	public int InformationInsert(String sql,String name,String pwd,String email,String gender) {
//		String sql = "insert into Information(username,ipassword,email,gender,birthday) values(?,?,?,?,?)";
		System.out.println(1);
		return this.execute(sql, name,pwd,email,gender);
	}
	public int InformationUpdate(String sql,String name,String pwd,String email,String gender,String id) {
		return this.execute(sql, name,pwd,email,gender,id);
	}
	public int AdminInser(String sql,String adminName,String adminPassword,String adminContact,int adminRole) {
		return this.execute(sql, adminName,adminPassword,adminContact,adminRole);
	}
	public int AdminUpdate(String sql,String adminName,String adminPassword,String adminContact,int adminRole,int adminId) {
		return this.execute(sql,adminName,adminPassword,adminContact,adminRole,adminId);
	}
	public int ProductInsert(String sql,String proName,int Cate_id,int proStatus) {
		return this.execute(sql,proName,Cate_id,proStatus);
	}
	public int ProductUpdate(String sql,String proName,int Cate_id,int proStatus,int proId) {
		return this.execute(sql,proName,Cate_id,proStatus,proId);
	}
	public int orderUpdate(String sql,String dizhi,String dianhua,String beizhu,int id) {
		return this.execute(sql, dizhi,dianhua,beizhu,id);
	}

}
