package com.exam.day10_oop02.shop01;

public class Product {
	// 품번, 이름, 가격
	private String product_no;
	private String name;
	private int price;
	
	public Product() {
		
	}
	public Product(String product_no, String name, int price) {
		this.product_no = product_no;
		this.name = name;
		this.price = price;
	}

	public String getProduct_no() {
		return product_no;
	}

	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 0.02프로의 할인율이 적용된 가격을 반환해주는 메서드
	public double getPromotionPrice() {
		return this.price * 0.02;
	}
	
	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", name=" + name + ", price=" + price + "]";
	}
	
}
