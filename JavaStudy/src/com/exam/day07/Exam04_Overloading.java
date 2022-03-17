package com.exam.day07;

public class Exam04_Overloading {
	/* overloading : 메서드가 정의됐을 때 - 하나의 기능이 있음
	 * - 기존의 메서드가 가지고 있는 기능에 추가적인 인자값이나 자료형의 변화를 줘서
	 * - 기본적인 형태를 다양화할 수 있는 문법.
	 * 
	 * */

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	// 메서드 명은 같지만 매개변수의 개수가 다름 = 오버로딩
	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	// 메서드 명은 같지만 매개변수의 자료형이 다름 = 오버로딩
	public static int plus(double num1, double num2) {
		return (int)(num1 + num2);
	}
	// 메서드 명은 같지만 매개변수의 자료형과 개수가 다름 = 오버로딩
	public static int plus(char char1, char char2, char char3) {
		return char1 + char2 + char3;
	}
	// 반환타입과 메서드명이 같기 때문에 매개변수가 없더라도 오버로딩 가능
	public static int plus() {
		return 5 + 10;
	}
	
	// 오버로딩 성립이 안되는 경우 (반환타입이 다른 경우)
	// 한 클래스에는 똑같은 이름의 중복된 메서드는 존재할 수 없음
//	public static void plus(int num1, int num2) {
//		num1 + num2;
//	}
	// 리턴타입이 달라지고 매개변수의 형태도 달라지면 다른 메서드로써 같은 이름을 사용할 수 있다. (오버로딩x)
	public static void plus(float num1, float num2) {
		float rs = num1 + num2;
	}
	
	public static void main(String[] args) {
		// 두 개의 정수를 더하는 메서드
		System.out.println( plus(10, 5) );
		// 세 개의 정수를 더하는 메서드
		System.out.println( plus(10, 5, 10) );
		// 두 개의 실수를 더하는 메서드
		System.out.println( plus(3.5, 1.5) );
		// 세 개의 char 데이터를 더하는 메서드
		System.out.println( plus('a', 'b', 'c') );
	}
	
}
