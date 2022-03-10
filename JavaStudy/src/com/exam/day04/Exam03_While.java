package com.exam.day04;

import java.util.Scanner;

public class Exam03_While {
	public static void main(String[] args) {
		/*	while : 조건식만 요구하는 반복문
		 *  언제까지 코드를 반복해야 할지 모를 때,
		 *  특별한 일이 일어나지 않을 때까지는 코드를 반복
		 * 
		 * */
		
		// 사용자가 q라고 입력할 때까지 계속 1을 반복
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		// while을 사용할 때 특정 조건을 만족하면 쓰는 분기문
		
		while (!input.equals("q")) {
			System.out.print("입력하세요 > ");
			input = sc.nextLine();
			
			System.out.println("1");
		}
		System.out.println("종료");
		
		
		// 증감문이랑 같이 쓸 때
		int i = 0;
		
		while(i < 2) {
			System.out.println("a");
			i++;
		}
	}
}
