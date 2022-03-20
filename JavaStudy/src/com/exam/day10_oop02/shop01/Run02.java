package com.exam.day10_oop02.shop01;

public class Run02 {
	public static void main(String[] args) {
		
	IceCream ice = new IceCream();
	ice.getName(); // Product에 정의된 
	
	IceCream ice2 = new IceCream("001","바닐라",5000);
	System.out.println(ice2);
	
	
	Bread br = new Bread("002","바게트",5000);
	Beverage bv = new Beverage("001","생감자",5500);
	System.out.println(br.getName());
	System.out.println(bv.getName());
	
	System.out.println("아이스크림 할인 가격 : " + ice2.getPromotionPrice());
	System.out.println("빵 할인 가격 : " + br.getPromotionPrice());
	System.out.println("음료 할인 가격 : " + bv.getPromotionPrice());
	
	}
}
