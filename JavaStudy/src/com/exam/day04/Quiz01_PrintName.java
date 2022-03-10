package com.exam.day04;

import java.util.Scanner;

public class Quiz01_PrintName {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		/*
		for (int i = 0;; i++) {
			System.out.println(" ** 입장을 종료하려면 Q를 입력하세요 ** ");
			System.out.print("닉네임을 입력해주세요 >> ");
			String username = sc.nextLine();
			
			if (username.equals("manager")) {
				System.out.println("매니저님 오셨어요?\n");
				continue;
			}
			if (username.equals("Q") || username.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(i + " : " + username + "님 어서오세요!\n");
			
		
		}
		*/
		
		while (true) {
			System.out.println(" ** 입장을 종료하려면 Q를 입력하세요 ** ");
			System.out.print("닉네임을 입력해주세요 >> ");
			String username = sc.nextLine();
			
			if (username.equals("manager")) {
				System.out.println("매니저님 오셨어요?\n");
				continue;
			}
			if (username.equals("Q") || username.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("0" + " : " + username + "님 어서오세요!\n");
		}
	}
}
