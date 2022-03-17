package com.exam.day07;

import java.util.Scanner;

public class Exam02_Number {
	
	public static int smaller(int num1,int num2) {
		if (num1==num2) return 0;
		return num1 > num2 ? num2 : num1;
	}
	
	public static int getRanNum(int minX, int maxY) {
		return (int)(Math.random() * (maxY - minX + 1) + minX);
	}
	
	public static void main(String[] args) {
		// 두 정수를 입력받고 smaller() 라는 메서드를 이용해서 두 정수 중 더 작은 수를 반환받아 출력.
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 입력값 > ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 입력값 > ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("result : " + smaller(num1,num2));
		*/
		
		
		// 사용자에게 최소값 x와 최대값 y를 입력받아 getRanNum() 최소값과 최대값
		// Math.random() * (MAX - MIN + 1) + MIN
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최소값 x값 입력 > ");
		int minX = Integer.parseInt(sc.nextLine());
		System.out.print("최대값 y값 입력 > ");
		int maxY = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < 20; i++) {
			System.out.println("result : " + getRanNum(minX,maxY));
		}
		
		/* 메서드를 사용하면 좋은 점
		 * - 코드가 분리되므로 가독성이 좋아진다
		 * - 유지보수하기에 좋다
		 * - 코드의 재활용성이 높아진다.
		 * 
		 * */
		
	}

}
