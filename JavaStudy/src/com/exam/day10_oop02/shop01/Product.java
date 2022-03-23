package com.exam.day10_oop02.shop01;

// 추상메서드를 하나라도 가지고 있는 클래스는 추상클래스가 되어야함.
// 추상클래스 -> 더 이상 직접 new를 못함. 부모가 가지고 있는 기능을 자식에게 강제하고 싶을 때
public abstract class Product {
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
//	public double getPromotionPrice() {
//		return this.price * 0.02;
//	}
	
	// 추상멧서드 : 메서드의 몸통을 만들지 않고 이름만 정의하는 메서드
	// 반드시 자식메서드에서 재정의하여 사용해야 하는 메서드
	public abstract double getPromotionPrice();
	
	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", name=" + name + ", price=" + price + "]";
	}
	
}
