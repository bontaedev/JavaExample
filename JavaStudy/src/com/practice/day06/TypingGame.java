package com.practice.day06;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		// 한컴타자연습 - 산성비
		// 게임을 시작한 순간부터 종료된 순간까지 시간을 잼
		// System.currentTimeMillis() : 현재시간을 long형으로 뽑아줌
		
		/*
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500000; i++) {
			System.out.println('.');
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000 + "초");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0; // 메뉴번호
		int correctCount = 0; // 10번 맞추면 게임 종료될 수 있게함.
		String[] wordList = {"마부위침","싱글벙글","귀모토각","반근착절","백전백승",
							  "흘깃흘깃","부서지다","사흘돌이","바람언덕","외유내강"};
		String typeWord = "";
		
		game:while (true) {
			// 메뉴 출력
			System.out.println("===== 산성비 게임이 오신 걸 환영합니다.=====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 종료");
			System.out.print("메뉴를 선택하세요 >> ");
			
			// 예외처리
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Enter valid number!");
			}
			
			// 메뉴 분기
			if (menu!=1) { // 종료되는 부분 먼저
				System.out.println("Game end! Goodbye!");
				break game;
			}
			// 게임시작
			System.out.println("  게임 Start!  ");
			long start = System.currentTimeMillis();
			while (correctCount < 10) { // 10번 맞추면 게임종료
				// 문제 단어 출력
				for (String str : wordList) {
					System.out.print(str + "\t");
				}
				
				// 단어 입력
				System.out.print("\n입력 >> ");
				typeWord = sc.nextLine();
				
				// 공백을 입력할 경우 차단.
				if (typeWord.equals("")) {
					System.out.println("문자를 입력하세요.");
					continue;
				}
				
				// 비교해서 삭제
				for (int i = 0; i < wordList.length; i++) {
					if(typeWord.equals(wordList[i])) {
						wordList[i] = "";
						typeWord = "";
						correctCount++;
					}
				}
			}
			
			// 게임종료
			long end = System.currentTimeMillis();
			System.out.println("Game clear!");
			System.out.println("플레이 시간 : " + ((end-start)/1000) + "초");
			System.out.println("===== 게임이 끝났습니다.=====\n");
		}
		
		
	}
}
