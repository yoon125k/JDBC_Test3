package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.dto.Product;
import static com.common.JDBCTemplate.*;

public class ProductDao {

	public List<Product> selectAll(Connection con) {

		Statement stmt = null;
		String sql = "SELECT * FROM PRODUCT3";
		ResultSet rs = null;
		List<Product> list = new ArrayList<Product>();

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Product p = new Product();
				p.setProduct_id(rs.getString(1));
				p.setP_name(rs.getString(2));
				p.setPrice(rs.getInt(3));
				list.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
			close(stmt);
		
		return list;

	}

}
