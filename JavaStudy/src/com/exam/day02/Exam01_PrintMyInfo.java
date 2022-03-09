package com.exam.day02;

public class Exam01_PrintMyInfo {
	public static void main(String[] args) {
		// 실습1 : 인삿말, 본인의 이름 영어이름, 나이, 체온측정 결과
		// 문자열 연결 + 사용
		System.out.println("hello!");
		System.out.println("my name is 강낭콩. my english name is beeean.");
		System.out.println("my age is ..." + 55 + "years old.");
		System.out.println("today temperature is "+ 36.5 + "degree");
		
		// 문자와 숫자를 연결할 때 주의할 점
		// 우선순위가 있지 않으면 왼쪽에서 오른쪽으로
		System.out.println("a" + "b" + 5 + 10);
		System.out.println(5 + 10 + "a" + "b" );
	}
}
