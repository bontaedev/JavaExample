package com.practice.day03;

import java.util.Scanner;

public class Conditional_prac02 {
	public static void main(String[] args) {

		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		System.out.print("정수를 한 개 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());

		// 짝수 홀수 판별
		if (num > 0) {
			if (num % 2 == 0) {
			System.out.println("짝수다");
			} else {
			System.out.println("홀수다");
	            }
	        } else {
	            System.out.println("양수만 입력해주세요");
	        }
	        
	    }
	}


