package com.exam.day02;

public class Exam04_Types {
	public static void main(String[] args) {
		
		// 데이터 타입 Data Type
		// 8개의 Data Type : 자바의 기본 데이터 타입 Primitive Type (기본 자료형)
		
		boolean t = true;
		boolean f = false;
		System.out.println("t : " + t);
		System.out.println("f : " + f);
		
		char c1 = 'a';
		char c2 = '가';
		char c3 = '5';
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		// 숫자를 저장하는 자료형
		// 정수형
		byte b1 = -128;
		byte b2 = 127;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		// 데이터타입에 맞는 데이터만 대입가능
		//byte b3 = true;
		
		// short : -32768 ~ 32767
		short s1 = -32768;
		short s2 = 32767;
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// int형 : 정수의 대표타입
		System.out.println(100); // int형으로 자동지정
				
		// long형 : 데이터 끝에 L을 붙여 long형임을 명시
		long l1 = 321321321;
		System.out.println("l1 : " + l1);
		long l2 = 321321321321321L;
		System.out.println("l2 : " + l2);
		
		
		// 실수형
		float f1 = 3.14f;
		System.out.println("f1 : " + f1);
		
		// double : 실수의 대표타입
		double d1 = 3.14;
		System.out.println("d1 : " + d1);

	}
}
