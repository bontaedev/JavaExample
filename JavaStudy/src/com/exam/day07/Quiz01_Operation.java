package com.exam.day07;

public class Quiz01_Operation {
	public static int plus(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		/* 사칙연산을 수행하는 각각의 메서드를 구성해서 결과값을 출력하세요
		 * 
		 * */
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("a + b : " + plus(num1,num2));
		System.out.println("a - b : " + minus(num1,num2));
		System.out.println("a * b : " + multiply(num1,num2));
		System.out.println("a / b : " + divide(num1,num2));

	}


}
