package com.controller;

import java.util.List;

import com.model.dto.Product;
import com.model.service.ProductBiz;

public class ProductController {

	ProductBiz pb = new ProductBiz();

	public List<Product> selectAll() {

		return pb.selectAll();

	}

}
