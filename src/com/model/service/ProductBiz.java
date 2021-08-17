package com.model.service;

import java.sql.Connection;
import java.util.List;

import com.model.dao.ProductDao;
import com.model.dto.Product;
import static com.common.JDBCTemplate.*;

public class ProductBiz {

	ProductDao pd = new ProductDao();

	public List<Product> selectAll() {
		Connection con = getConnection();
		return pd.selectAll(con);

	}

}
