package com.exam.day11_oop_test;

import com.exam.day10_oop02.shop01.Product;

public interface ProductInterface {
// 인터페이스 : 추상메서드, 디폴트메서드, 정적메서드, 상수들로 이루어진 클래스
// 보통 동일한 목적이나 기능을 강제해야 하는 상황에서 쓰임
	
	// 상수
	public final int MAX_COUNT = 30;
	
	// default 메서드
	void selectAll();
	
	// 정적 static 메서드
	static void add(Product product) {
		Product[] list = new Product[] {product} ;
	};
	
	// 추상메서드
	public abstract void update(Product product);
	public abstract void delete(int no);
}
