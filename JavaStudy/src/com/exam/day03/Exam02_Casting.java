package com.exam.day03;

public class Exam02_Casting {
	public static void main(String[] args) {
		/*
		 * 형변환(Casting) : 데이터의 자료형을 변환하는 것
		 * - 개발자가 데이터의 타입을 예측하지 못했을 때
		 * - 개발자가 원하는 대로의 데이터 타입을 사용하기 위해서 데이터타입을 변경
		 * 
		 * 자동 형변환(promotion) : 작은 자료형에서 큰 자료형으로 변환이 이루어지는 경우
		 * 강제 형변환(down casting) : 큰 자료형에서 작은 자료형으로 변환이 이루어지는 경우
		 * ( 데이터의 손실이 일어날 수 있음 )
		 * 
		 * */
		
		byte b1 = 127;
		System.out.println("b1 : " + b1);
		short s1 = b1; // 더 큰 자료형으로 대입
		System.out.println("s1 : " + s1);
		int i1 = s1;
		System.out.println("i1 : " + i1);
		long l1 = i1;
		System.out.println("l1 : " + l1);
		
		long l2 = 1234567890123L;
		System.out.println(l2);
		int i2 = (int)l2;
		System.out.println(i2);
		short s2 = (short)i2;
		System.out.println(s2);
		byte b2 = (byte)s2;
		System.out.println(b2);
		
		
		// 정수 -> 실수로 형변환
		int i3 = 50;
		float f3 = i3;
		System.out.println(f3);
		
		// 실수 -> 정수로 형변환
		double d4 = 3.14;
		int i4 = (int)d4;
		System.out.println(i4);
		
		// char (ASCII code) : 실제로는 내부적으로 문자와 매칭되는 코드가 들어있음
		char c5 = 'a';
		System.out.println("c5 : " + c5);
		int i5 = c5;
		System.out.println("i5 : " + i5);
	}

}
