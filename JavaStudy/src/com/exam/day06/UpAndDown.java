package com.exam.day06;

import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		// Up and down game
		// 1-99 까지의 랜덤한 숫자를 추측하여 입력하여 맞으면 정답, 틀리면 up인지 down인지 알려주고 재입력
		// 기회는 다섯 번 주기로 결정
		// 1번 메뉴는 게임 2번 메뉴는 점수 3번 메뉴는 게임 종료

		int menuSelect = 0;
		
		int winCount = 0;
		int loseCount = 0;
		int tryCount = 0;
		
		final int MAX = 99;
		final int MIN = 1;
		
		int myNumber = 0;
		int compNumber = (int)(Math.random() * (MAX - MIN + 1) + MIN);;
		
		Scanner sc = new Scanner(System.in);
		
		game:while (true) {
			System.out.println("==== UP & Down Game ====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("Type menu >> ");
			menuSelect = Integer.parseInt(sc.nextLine());
			
			menu:if (menuSelect == 1) {
				guess:for (int i = 0; i < 5; i++) {
					System.out.print("Input Number >> ");
					myNumber = Integer.parseInt(sc.nextLine());
					tryCount++;
					if (myNumber < compNumber) System.out.println("<< Up >>");
					else if (myNumber > compNumber) System.out.println("<< Down >>");
					else {
						winCount++;
						System.out.println("<< Excellent >>");
						System.out.println("Tried : " + tryCount);
						System.out.println("Your current score >> " + winCount + " win " + loseCount + " lose");
						break guess;
					};
				}
				if (tryCount >= 5) {
					loseCount++;
					System.out.println("You lose!");
					System.out.println("Your current score >> " + winCount + " win " + loseCount + " lose");
					
				}
			} else if (menuSelect == 2) {
				System.out.println("Your current score >> " + winCount + " win " + loseCount + " lose");
			} else if (menuSelect == 3) {
				System.out.println("End Game. Bye!");
				break game;
			} else {
				System.out.println("Try a valid number menu (1,2,3)");
			}
		}
		
	}
	
	

}
