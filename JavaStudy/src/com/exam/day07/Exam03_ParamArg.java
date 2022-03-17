package com.exam.day07;

public class Exam03_ParamArg {
	public static char getA() { // 매개변수가 없을 때
		return 'A';
	}
	public static void greeting() { // void 리턴값이 없을 때
		System.out.println("안녕하세요.");
	}
	
	public static void main(String[] args) {
		/*  매개변수나 인자값이 있거나 없을 경우
		 * - 매개변수나 리턴값은 반드시 필수는 아니다.
		 * 
		 * */
		
		System.out.println(getA());
		greeting();
	}

	
}
