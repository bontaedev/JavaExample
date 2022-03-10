package com.exam.day04;

public class Exam01_Loop {
	public static void main(String[] args) {
		/* 반복문 Loop : 프로그램의 흐름을 반복시켜주는 제어문.
		 * 반복문은 조건식을 충족하는 동안은 해당 범위의 코드가 반복되어 실행된다.
		 * 조건식을 불충족하는 순간 그 범위를 벗어나 원래 흐름으로 돌아가게 된다.
		 * 
		 * 초기식 : 몇번부터 시작할건지
		 * 조건식 : 언제까지 반복할건지
		 * 증감식 : 안쪽 코드가 반복될 때마다 한번씩 실행
		 * 
		 *  조건식을 충족시켜서 안쪽 코드가 실행되고 증감식은 코드블록이 끝나기 직전 중괄호에서 실행
		 * */
		
		// for
		
		for (int i = 0; i < 1; i++) {
			System.out.println(i);
		}
		
		// exam1. 0~4까지 for문으로 출력
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);	
		}
		
		// exam2. 1~100까지 for를 이용해 출력
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		// exam3. 100부터 1까지
		for (int i = 100; i > 0 ; i--) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		
		// while
//		while (it.hasNext()) {
//			type type = (type) it.next();
//			
//		}
		
		// do while
	}
}
