package com.exam.day03;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====정수 사칙연산 프로그램 (1 ~ 100 사이 입력)=====");
		
		int firstInput = 0;
		int secondInput = 0;
		int result = 0;
		
		System.out.print("첫번째 정수를 입력해주세요 > ");
		firstInput = Integer.parseInt(sc.nextLine());
		
		if (firstInput < 0 || firstInput > 100) {
			System.out.print("잘못된 정수입니다. 프로그램을 종료합니다.");
			return;
		}
		else {
			System.out.print("두번째 정수를 입력해주세요 > ");
			secondInput = Integer.parseInt(sc.nextLine());
			if (secondInput < 0 || secondInput > 100) {
				System.out.print("잘못된 정수입니다. 프로그램을 종료합니다.");
				return;
			}
		}
		
		System.out.print("연산자를 입력해주세요 > ");
		String opt = sc.nextLine();
	
		if (opt.equals("+")) result = firstInput + secondInput;
		else if (opt.equals("-")) result = firstInput - secondInput;
		else if (opt.equals("*")) result = firstInput * secondInput;
		else if (opt.equals("/")) result = firstInput / secondInput;
		else {
			System.out.print("잘못된 연산자입니다. 프로그램을 종료합니다.");
			return;
		}
		
		System.out.println("연산결과 : " + result);
		
	}
}
