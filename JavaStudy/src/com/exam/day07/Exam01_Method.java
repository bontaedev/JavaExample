package com.exam.day07;

public class Exam01_Method {
	public static int plus(int i, int j) { // 정의부
		// 매개변수 : 호출부룰 통해 전달된 인자값을 받아주는 변수
		// 매개변수와 인자값의 자료형, 갯수는 반드시 일치해야 한다.
		// 리턴 자료형 : 메서드명 왼쪽에 반환하고자 하는 자료형을 적는다.
		
		return i+j;
		// return : 수행한 결과를 돌려준다.
		// return을 만나는 순간 결과값과 함께 메서드 영역을 벗어나 버림
	}

	
	public static void main(String[] args) {
		
		
		/* Method : 자바에서 기능을 이야기 하는 것 (function,함수)
		 * - 어떤 특정한 작업을 수행하기 위해서 모아놓은 명령문의 집합.
		 * 
		 * 구성
		 * - 정의부 : 메서드에 대해 어떤 기능을 수행할지 설명해놓은 부분
		 * - 호출부 : 정의된 메서드를 불러와서 사용하는 부분
		 * 
		 * */
		
		// 1과 5를 더한 결과값을 출력하세요.
		System.out.println(1 + 5);
		// 2, 6을 더한 결과값을 출력하세요.
		System.out.println(2 + 6);
		// 100, 200을 더한 결과값을 출력하세요.
		System.out.println(100 + 200);
		
		// 함수를 이용
		plus(1,5); // 호출부
		// 메서드명(인자값);
		
	}
}
