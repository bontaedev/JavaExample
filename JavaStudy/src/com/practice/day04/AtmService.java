package com.practice.day04;

import java.util.Scanner;

public class AtmService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 3000;
		int money = 0;
		int select = 0;
		
		while (true) {
			System.out.println("=== ATM 시뮬레이터 ===");
			System.out.println("1. 잔액조회");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 종료하기");
	
			System.out.print(">> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch (select) {
				case 1:
					System.out.println("현재 보유잔액은 " + balance + "입니다.\n");
					continue;
				case 2:
					System.out.print("얼마를 입금하시겠습니까? > ");
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.println(money + " 원이 입금되었습니다.\n");
					continue;
				case 3:
					System.out.print("얼마를 출금하시겠습니까? > ");
					money = Integer.parseInt(sc.nextLine());
					balance -= money;
					System.out.println(money + " 원이 출금되었습니다.\n");
					continue;
				case 4:
					System.out.println("거래가 종료되었습니다.");
					break;
				default:
					System.out.println("유효한 번호가 아닙니다.\n");
			}
		}
	}
}
