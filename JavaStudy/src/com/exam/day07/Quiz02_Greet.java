package com.exam.day07;

import java.util.Scanner;

public class Quiz02_Greet {
	public static void greetings(int input) {
		for (int i = 0; i < input; i++) {
			System.out.println("안녕하세요!");
		}
	}
	
	public static void main(String[] args) {
		// 사용자에게 입력받은 정수만큼 "안녕하세요"를 출력하는 메서드 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		int input = Integer.parseInt(sc.nextLine());
		
		greetings(input);
	}
}