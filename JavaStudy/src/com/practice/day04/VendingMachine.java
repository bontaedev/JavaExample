package com.practice.day04;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 메뉴선택
		String selectMenu = "";
		
		// 잔액
		int balance = 5000; // 기본금 5000원으로 설정
		
		// 주문 개수
		int cokeCount = 0;
		int cidarCount = 0;
		int plumTeaCount = 0;
		
		// 메뉴이름
		final String coke = "콜라";
		final String cidar = "사이다";
		final String plumTea = "매실차";
		
		// 가격
		final int cokePrice = 1000;
		final int cidarPrice = 800;
		final int plumTeaPrice = 1500;
		
		// 라벨링
		vending:while (true) {
			// 메뉴 출력
			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.print("음료수를 선택하세요 : ");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3. 매실차(1500) [0. 소지품확인] 10. 자판기종료 ");
			System.out.println(">> ");
			selectMenu = sc.nextLine();
			
			
			// 메뉴 선택
			/**/
			switch (selectMenu) {
				case "1":
					if (balance < cokePrice) {
						System.out.println("잔액이 부족합니다.\n");
						break;
					}
					System.out.println(coke + " 를 구매했습니다.");
					System.out.println(coke + " +1");
					System.out.println("소지금 -1000\n");
					
					cokeCount += 1;
					balance -= cokePrice;
					break;
				case "2":
					if (balance < cidarPrice) {
						System.out.println("잔액이 부족합니다.\n");
						break;
					}
					System.out.println(cidar + " 를 구매했습니다.");
					System.out.println(cidar + " +1");
					System.out.println("소지금 -800\n");
					
					cidarCount += 1;
					balance -= cidarPrice;
					break;
				case "3":
					if (balance < plumTeaPrice) {
						System.out.println("잔액이 부족합니다.\n");
						break;
					}
					System.out.println(plumTea + " 를 구매했습니다.");
					System.out.println(plumTea + " +1");
					System.out.println("소지금 -1500\n");
					
					plumTeaCount += 1;
					balance -= plumTeaPrice;
					break;
				case "0":
					System.out.println("=== 소지품 목록 ===");
					System.out.println("소지금 : " + balance);
					System.out.println("콜라 : " + cokeCount + "개");
					System.out.println("사이다 : " + cidarCount + "개");
					System.out.println("매실차 : " + plumTeaCount + "개");	
					System.out.println("=================\n");
		
					break;
				case "10":
					System.out.println("자판기를 종료합니다.");
					break vending;
				default:
					System.out.println("입력한 숫자를 다시 획인해주세요.\n");
					break;
			}
			
			/*
			if (selectMenu.equals("1") || selectMenu.equals(coke)) {
				if (balance < cokePrice) {
					System.out.println("잔액이 부족합니다.\n");
					continue;
				}
				System.out.println(coke + " 를 구매했습니다.");
				System.out.println(coke + " +1");
				System.out.println("소지금 -1000\n");
				
				cokeCount += 1;
				balance -= cokePrice;
				
			} else if (selectMenu.equals("2") || selectMenu.equals(cidar)) {
				if (balance < cidarPrice ) {
					System.out.println("잔액이 부족합니다.\n");
					continue;
				}
				System.out.println(cidar + " 를 구매했습니다.");
				System.out.println(cidar + " +1");
				System.out.println("소지금 -800\n");
				
				cidarCount += 1;
				balance -= cidarPrice;
				
			} else if (selectMenu.equals("3") || selectMenu.equals(plumTea)) {
				if (balance < plumTeaPrice) {
					System.out.println("잔액이 부족합니다.\n");
					continue;
				}
				System.out.println(plumTea + " 를 구매했습니다.");
				System.out.println(plumTea + " +1");
				System.out.println("소지금 -1500\n");
				
				plumTeaCount += 1;
				balance -= plumTeaPrice;
				
			} else if (selectMenu.equals("0") || selectMenu.equals("소지품확인")) {
				System.out.println("=== 소지품 목록 ===");
				System.out.println("소지금 : " + balance);
				System.out.println("콜라 : " + cokeCount + "개");
				System.out.println("사이다 : " + cidarCount + "개");
				System.out.println("매실차 : " + plumTeaCount + "개");	
				System.out.println("=================\n");
				
			} else if (selectMenu.equals("10") || selectMenu.equals("자판기종료")) {
				System.out.println("자판기를 종료합니다.");
				break;
				
			} else {
				System.out.println("입력한 숫자를 다시 획인해주세요.\n");
			}
			*/
		}

		
	}
}
