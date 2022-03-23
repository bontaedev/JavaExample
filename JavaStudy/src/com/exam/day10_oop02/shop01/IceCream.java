package com.exam.day10_oop02.shop01;

// 자식 extends 부모 class
public class IceCream extends Product {
	
	public IceCream() {
		// this; 자기 자신을 의미 
		// super : 상속해주는 부모 클래스를 참조하는 변수.
		// super() : 부모 클래스의 기본생성자를 호출한다. 그리고 Product 의 인스턴스를 생성한다.
		// IceCream의 생성자를 호출하면 부모클래스의 인스턴스도 생성된다.
		super();
	}
	
	public IceCream(String product_no, String name, int price) {
		// super() 를 통해 매개변수 있는 생성자 사용.
		super(product_no, name, price);
		
		// 멤버변수를 상속받지만 private이기 때문에 접근이 불가능.
		/*
		this.product_no = product_no;
		this.name = name;
		this.pric = price;
		*/
		
		// getter/setter를 통해 부모의 멤버변수 접근
		/*
		this.setProduct_no(product_no);
		this.setName(name);
		this.setPrice(price);
		*/
	}

	/* 메서드의 오버라이딩
	 * 부모클래스가 가지고 있는 메서드를 재정의하는 작업
	 * -> 다른 클래스 안에서 이뤄짐
	 * -> 똑같은 이름의 메서드, 똑같은 반환타입, 똑같은 매개변수
	 * - 부모클래스가 가지고 있는 같은 이름의 메서드를 무효화 시킨다.
	 * */
	
	// 오버로딩
	/* -> 하나의 클래스 안에서 이뤄짐.
	 * -> 똑같은 이름의 메서드를 매개변수 자료형이나 개수를 달리해주는 작업
	 * -> 리턴타입은 동일하다.
	 * 
	 * */

	
	public double getPromotionPrice() { // 추상클래스를 가져와 부연하였음 (오버라이딩은 아님)
		return this.getPrice() * 0.01;
	}
}
