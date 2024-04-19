package DAO;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Cart;
import entity.Image;
import entity.ProductMessage;
import entity.Specs;

public class ShopCartDAO extends baseDAO {
	public List<ProductMessage> selectShopName(Integer proid) {
		String sql = "SELECT * FROM products_message WHERE pro_id = ?";
		return this.executeQuery(sql, new Mapper<ProductMessage>() {
			@Override
			public List<ProductMessage> map(ResultSet rs) throws SQLException {
				List<ProductMessage> list = new ArrayList<>();
				while (rs.next()) {
					ProductMessage pro = new ProductMessage(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
					list.add(pro);
				}
				return list;
			}
		}, proid);
	}

	// 查找商品有什么规格
	public List<Specs> selectSpeName(Integer proid) {
		String sql = "SELECT * FROM specs WHERE pro_id = ?";
		return this.executeQuery(sql, new Mapper<Specs>() {

			@Override
			public List<Specs> map(ResultSet rs) throws SQLException {
				List<Specs> list = new ArrayList<Specs>();
				while (rs.next()) {
					Specs spe = new Specs(rs.getInt(1), rs.getInt(2), rs.getString(3));
					list.add(spe);
				}
				return list;
			}

		}, proid);
	}

	// 查找购物车有几样东西
	public Integer selecount(Integer uid) {
		String sql = "select count(*) as count FROM cart where id=?";
		Integer count = null;
		try {
			stmt = getConn().prepareStatement(sql);
			stmt.setObject(1, uid);
			rs = stmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return count;
	}

	// 查所有
	public List<Cart> seleCartAll(Integer uid) {
		String sql = "SELECT * FROM cart WHERE id = ?";
		return this.executeQuery(sql, new Mapper<Cart>() {

			@Override
			public List<Cart> map(ResultSet rs) throws SQLException {
				List<Cart> list = new ArrayList<Cart>();
				while (rs.next()) {
					Cart cart = new Cart(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getBigDecimal(4), rs.getInt(5),
							rs.getString(6), rs.getString(7), rs.getDate(8));
					list.add(cart);
				}
				return list;
			}

		}, uid);
	}

	// 删除
	public int deleteCart(Integer cid) {
		String sql = "DELETE FROM cart WHERE cid = ?";
		return this.execute(sql, cid);
	}

	// 新增
	public int Insertgwc(Integer proid, String image, String cname, BigDecimal cprice, Integer id) {
		// 先检查购物车中是否已经存在相同的商品
		String checkSql = "SELECT * FROM cart WHERE Pro_id = ? AND id = ?";
		List<Map<String, Object>> result = this.executeQuery(checkSql, new Mapper<Map<String, Object>>() {
			@Override
			public List<Map<String, Object>> map(ResultSet rs) throws SQLException {
				List<Map<String, Object>> list = new ArrayList<>();
				while (rs.next()) {
					Map<String, Object> row = new HashMap<>();
					row.put("cid", rs.getInt("cid"));
					row.put("id", rs.getInt("id"));
					row.put("ccount", rs.getInt("ccount"));
					row.put("cprice", rs.getBigDecimal("cprice"));
					row.put("proid", rs.getInt("pro_id"));
					row.put("image", rs.getString("image"));
					row.put("cname", rs.getString("cname"));
					row.put("ctime", rs.getDate("ctime"));
					list.add(row);
				}
				return list;
			}
		}, proid, id);

		if (!result.isEmpty()) {
			// 遍历结果集，检查是否存在相同的商品
			for (Map<String, Object> row : result) {
				if (row.get("image").equals(image) && row.get("cname").equals(cname)
						&& ((BigDecimal) row.get("cprice")).compareTo(cprice) == 0) {
					Integer car_count = (Integer) row.get("ccount");
					if (car_count < 5) {
						Integer car_id = (Integer) row.get("cid");
						String updateSql = "UPDATE cart SET ccount = ? WHERE cid = ?";
						return this.execute(updateSql, car_count + 1, car_id);
					} else {
						// 超过数量限制
						return 0;
					}
				}
			}
		}

		// 如果购物车中不存在相同的商品，则执行插入操作插入新的记录，但是数量不能超过50
		String insertSql = "INSERT INTO cart (id, ccount, cprice, Pro_id, image, cname, ctime) "
				+ "VALUES (?, ?, ?, ?, ?, ?, NOW())";
		return this.execute(insertSql, id, 1, cprice, proid, image, cname);
	}

}