package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson2.internal.asm.MethodWriter;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Information;
import entity.Order;
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
	public String InfoQueryToHTML(String sql) {
		List<Information> datalist = this.InformationQuery(sql);
		return generateTableHtml(datalist);
	}
	public String OrQueryToHTML(String sql) {
		List<Order> dataList =this.orderQuery(sql);
		return generateTableHtmlForOrder(dataList);
	}
	public String adQueryToHTML(String sql) {
		List<admin> datalist = this.adminQuery(sql);
		return generateTableHtmlForAdmin(datalist);
	}
	public String generateTableHtml(List<Information> datalist) {
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
	public String generateTableHtmlForOrder(List<Order> datalist) {
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
	public String generateTableHtmlForAdmin(List<admin> datalist) {
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
	public Map<String, Object> queryByPage(int curpage, int pagesize,String sql,String sql2){
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
}
