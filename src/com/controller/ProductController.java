package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.dto.Product;
import com.model.service.ProductBiz;

public class ProductController {

	ProductBiz pb = new ProductBiz();
	Scanner sc = new Scanner(System.in);
	public List<Product> selectAll() {

		return pb.selectAll();

	}
	
	public Product selectOne() {
		System.out.print("찾을id:");
		String id = sc.next();
		return pb.selectOne(id);
	}

}
