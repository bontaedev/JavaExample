package com.exam.day01;

public class Exam01_Print {
	public static void main(String[] args) {
		// 다룬 줄에 A,B,C를 출력
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		// 같은 줄에 A,B,C를 출력
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		
		// Double quotation vs Single quotation
		// single quotation은 문자에서만, 문자열은 반드시 "" 안에!
		System.out.println("a");
		System.out.println('가');
		// System.out.println('가나다'); // error
		
		// 숫자도 출력가능
		System.out.println(50);
		System.out.println(0.48);
		System.out.println(-5.55);
		
	}
}
