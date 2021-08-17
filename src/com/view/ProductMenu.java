package com.view;

import java.util.List;
import java.util.Scanner;

import com.controller.ProductController;
import com.model.dto.Product;

public class ProductMenu {
	public void menu() {

		Scanner sc = new Scanner(System.in);

		ProductController pc = new ProductController();

		System.out.println("1.전체 조회하기");
		System.out.println("2.상품 추가하기");
		System.out.println("3.상품 수정하기");
		System.out.println("4.상품 삭제하기");
		System.out.println("5.상품 검색하기");
		System.out.println("0.프로그램 종료하기");

		int select = -1;

		while (select != 0) {
			System.out.print("선택:");
			select = sc.nextInt();

			switch (select) {
			case 1:
				List<Product> p = pc.selectAll();
				for(Product pd : p) {
					System.out.println(pd.getProduct_id() + pd.getP_name());
				}
				
				break;
			default:
				System.out.println("종료");
				break;

			}
		}

	}
}
