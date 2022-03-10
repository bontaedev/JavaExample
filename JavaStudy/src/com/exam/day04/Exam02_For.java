package com.exam.day04;

import java.util.Iterator;
import java.util.Scanner;

public class Exam02_For {
	public static void main(String[] args) {
		
		// 언제까지 반복문을 돌려야 할지 모르는 경우에는.
		// 사용자의 입력 값에 따라 횟수를 조절
		// 1부터 사용자가 입력한 값 num까지 출력
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력 > ");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < num+1; i++) {
			System.out.print(i + " ");
		}
		*/
		
		// 1부터 사용자가 입력한 값에서 출력을 하는데 홀수만 출력
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력 > ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		// 홀수일 때만 출력
		for (int i = 1; i < num2+1; i++) {
			if (i%2 == 1) System.out.print(i + " ");
		}
		
		// 증감문을 2씩 증가
		for (int i = 1; i < num2+1; i+=2) {
			System.out.print(i + " ");
		}
		*/
		
		// 1부터 5까지의 수를 차례대로 출력, 3은 제외 (continue)
		// continue : 현재 진행되고 있는 반복 흐름이 종료되고 다음 반복으로 넘어간다.
		// break vs continue
		
		/*
		for (int i = 1; i < 6; i++) {
			if (i==3) continue;
			System.out.print(i + " ");
		}
		*/
		
		
		
		// 사용자에게 입력값을 받음, 1부터 사용자 입력값까지의 전체합을 출력
		
		int inputNum = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >  ");
		inputNum = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= inputNum; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println(sum);
		
		// local variable : 지역변수
		// 중괄호 내에서 선언된 변수. 중괄호 내 블록에서만 사용할 수 있다.
		// 같은 지역에서 선언된 변수는 언제든 같은 영역에서 사용가능
		// 큰지역에서 선언된 변수는 작은 지역에서 사용가능.
		// 작은 지역에서 선언된 변수는 큰지역에서 쓸수 없다.
		
		
	}	
}
