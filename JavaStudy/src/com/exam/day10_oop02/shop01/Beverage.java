package com.exam.day10_oop02.shop01;

public class Beverage extends Product {
	
	public Beverage() {
		
	}
	
	public Beverage(String product_no, String name, int price) {
		super(product_no, name, price);
	}
	
	public double getPromotionPrice() {
		return this.getPrice() * 0.04;
	}
}
