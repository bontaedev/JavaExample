package com.exam.day10_oop02.shop01;

public class Bread extends Product {
	
	public Bread() {
		// JVM 이 자동으로 super() 추가
	}
	
	public Bread(String product_no, String name, int price) {
		super();
	}

	@Override
	public double getPromotionPrice() {
		return this.getPrice() * 0.3;
	}
	
	
}
