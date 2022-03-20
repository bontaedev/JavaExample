package com.exam.day08_OOP01;

public class RunAccess {
	public static void main(String[] args) {
		/* 접근제한자
		 *  - public : 외부, 모든 곳에서 접근 가능
		 *  - private : 반드시 해당 클래스 내부에서만 접근이 가능 (일반적)
		 *  - protected : 같은 패키지 혻인 자식 패키지 에서만 접근가능
		 *  - default : 같은 패키지 안에서는 접근 가능
		 * 
		 * */
		Access01 ac = new Access01();
		ac.written_date = "2022-01-02";
		System.out.println(ac.written_date);
		
		ac.age = 50;
		System.out.println(ac.age);
		
		ac.id = "abc123";
		System.out.println(ac.id);
		
		// ac.nickname = "ABC"; // private
		
		System.out.println(Math.PI);
		// final : 변하지 않는 상수인 경우에 사용
	}
}
