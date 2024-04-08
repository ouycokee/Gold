package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import baseDAO.Mapper;
import baseDAO.baseDAO;
import entity.Price;

public class PriceDAO extends baseDAO{

	public List<Price> minPirce(){
		String sql = "SELECT MIN(price.price) AS min_price\r\n"
				+ "FROM products_message pro\r\n"
				+ "JOIN specs spe ON pro.Pro_id = spe.Pro_id\r\n"
				+ "JOIN sdetail deta ON spe.Spe_id = deta.Spe_id\r\n"
				+ "JOIN combination com ON deta.Deta_id = com.Deta_id\r\n"
				+ "JOIN price ON com.Pri_id = price.Pri_id\r\n"
				+ "GROUP BY pro.Pro_id;";
		return this.executeQuery(sql, new Mapper<Price>() {

			@Override
			public List<Price> map(ResultSet rs) throws SQLException {
			    List<Price> list = new ArrayList<Price>();
			    while (rs.next()) {
			        Price price = new Price(rs.getInt(1),rs.getBigDecimal(1));
			        list.add(price);
			    }
			    return list;
			}
			
		});
	}
}
