package com.exam.day02;

public class Exam03_Variable {
	public static void main(String[] args) {
		
		/*
		변수 선언 규칙
	
		1. 변수명 첫글자는 숫자 x  ex. int 40var
		2. 특수문자로 시작하지 x   ex. int %var = 40;
		3. 변수명의 길이는 제한이 없지만, 보통은 짧고 의미있게!
		4. 변수에 두 개의 단어가 조합될때는 camelCase로 지정
		*/	
				
		// 변수 선언, 값 대입
		int a = 10;
		System.out.println(a);
		
		int b;
//		System.out.println(b);
		b = 20;
		System.out.println(b);
		
		b = 30;
		System.out.println("두번째 : " + b);

	}
}
