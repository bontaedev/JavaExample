package com.exam.day05;

import java.util.Scanner;

public class Quiz01_RSP {
	public static void main(String[] args) {
		/* 가위바위보 게임
		 * 가위 바위 보를 선택하고 컴퓨터가 미리 낸 값이랑 비교한다.
		 * 이기는지 비기는지 지는지
		 * 
		 * 입력값은 
		 * 
		 * 
		 * */
		final int MAX = 3;
		final int MIN = 1;
		
		int input = 0;
		int computer = (int)(Math.random() * (MAX - MIN + 1) + MIN);
		
		
		// computerNum =1 input => 2
		// computerNum =2 input => 3
		// computerNum = 3 input =>1
				
//		boolean isWin = (computer == 1 && input == 2) ||
//						(computer == 2 && input == 3) ||
//						(computer == 3 && input == 1);
//		boolean isDraw = (computer == input);
//		boolean isLose = (computer == 1 && input == 3) ||
//						(computer == 2 && input == 1) ||
//						(computer == 3 && input == 2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 가위 바위 보 게임 =====");
		System.out.println("아래의 숫자 중 하나를 선택하세요.");
		System.out.println("1. 가위 \t 2. 바위\t 3. 보");
		System.out.print(">> ");
		input = Integer.parseInt(sc.nextLine());
		
		while (true) {
			if (computer == 1) {
				if (input == 1) {
					System.out.println("비겼습니다.");
					System.out.println("컴퓨터 : " + "가위" + "\t\t" + "사용자 : " + "가위");
				}
				if (input == 2) {
					System.out.println("와! 이겼습니다.");
					System.out.println("컴퓨터 : " + "가위" + "\t\t" + "사용자 : " + "바위");
					break;
				}
				if (input == 3) {
					System.out.println("졌습니다.");
					System.out.println("컴퓨터 : " + "가위" + "\t\t" + "사용자 : " + "보");
				}
			} else if (computer == 2) {
				if (input == 1) {
					System.out.println("졌습니다.");
					System.out.println("컴퓨터 : " + "바위" + "\t\t" + "사용자 : " + "가위");
				}
				if (input == 2) {
					System.out.println("비겼습니다.");
					System.out.println("컴퓨터 : " + "바위" + "\t\t" + "사용자 : " + "바위");
				}
				if (input == 3) {
					System.out.println("와! 이겼습니다.");
					System.out.println("컴퓨터 : " + "바위" + "\t\t" + "사용자 : " + "보");
					break;
				}
			} else if (computer == 3) {
				if (input == 1) {
					System.out.println("와! 이겼습니다.");
					System.out.println("컴퓨터 : " + "보" + "\t\t" + "사용자 : " + "가위");
					break;
				}
				if (input == 2) {
					System.out.println("졌습니다.");
					System.out.println("컴퓨터 : " + "보" + "\t\t" + "사용자 : " + "바위");
				}
				if (input == 3) {
					System.out.println("비겼습니다.");
					System.out.println("컴퓨터 : " + "보" + "\t\t" + "사용자 : " + "보");
				}
			}
		}
		
//		System.out.println("와! 이겼습니다.");
//		System.out.println("비겼습니다.");
//		System.out.println("졌습니다.");
	}
}
