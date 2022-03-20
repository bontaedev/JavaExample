package com.exam.day10_oop02.shop01;

import java.util.Scanner;

public class Run {
	// 아이스크림 재고 관리 프로그램
	
	/* 가게에 메뉴가 추가될 때마다 따라오는 문제점
	 * 1. 메뉴가 추가될때마다 생성자,getter/setter,멤버필드,메서드 설정이 반복 -> 코드의 중복도 증가. (상속)
	 * 2. 연쇄적으로 수정해야 하는 작업이 많아진다. index, add, print 메서드가 연쇄적으로 증가 - 코드 결합도 증가 (다형성)
	 * 3. 배열 사이즈 문제, 삭제/수정이 복잡.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IceCream[] iceCream = new IceCream[3];
		Shop baskin = new Shop("baskin31", "09:00", "20:00", 
				iceCream);
		
		while (true) {
			System.out.println("==== 재고 관리 프로그램 ====");
			// 1. 아이스크림 등록 2. 목록확인 3. 가게 정보 확인 4. 프로그램 종료
			System.out.println("1. 아이스크림 등록");
			System.out.println("2. 목록확인");
			System.out.println("3. 가게 정보 확인");
			System.out.println("4. 프로그램 종료");
			System.out.print(">> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				System.out.print("품번 입력 >> ");
				String product_no = sc.nextLine();
				
				System.out.print("이름 입력 >> ");
				String name = sc.nextLine();
				
				System.out.print("가격 입력 >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				baskin.addIceCream(new IceCream(product_no,name,price));
				
				baskin.getIceCream()[0] = new IceCream(product_no,name,price);
				System.out.println(baskin.getIceCream()[0].getProduct_no());
				
			} else if (menu == 2) {
				
				baskin.printIceCream();
				
			} else if (menu == 3) {
				
				
			} else if (menu == 0) {
				break;
			}
		}
		
	}
}
