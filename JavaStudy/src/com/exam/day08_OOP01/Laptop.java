package com.exam.day08_OOP01;

public class Laptop {
	/* 추상화 : 노트북이 가지고 있는 특성, 기능을 추려내는 작업
	 * 
	 * 특성 : 브랜드, 색상, 가격, 사이즈
	 * 기능 : 전원 On/Off
	 * 
	 * */
	
	// 멤버변수(멤버필드)를 특성을 기준으로 해서 작성
	private String brand;
	private String color;
	private int price;
	private double size;
	
	public Laptop() {};
	
	public Laptop(String brand, String color, int price, double size) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	// 기능 -> 메서드(멤버 메서드)
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		System.out.println("전원이 종료합니다.");
	}
}
