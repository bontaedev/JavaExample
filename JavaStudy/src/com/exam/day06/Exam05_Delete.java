package com.exam.day06;

import java.util.Scanner;

public class Exam05_Delete {
	public static void main(String[] args) {
		// 배열 삭제
		// 배열은 처음 만들 때 사이즈 고정
		
		int[] arr = {1,2,3};
		// int의 초기값인 0을 이용해 의미없는 값으로 만들어 버리기.
		arr[1] = 0;
		for(int i : arr) System.out.println(i);
		
		
		
		String[] temp = {"abc","가나다","50"};
		temp[0] = "";
		for (String s : temp) {
			if(s!=null) System.out.println(s);
		}
		
		// int형 배열 안에서 사용자가 입력한 값만 삭제하기
		// 사용자가 입력한 값이 들어있는 인덱스를 0으로 바꾸시오.
		
		int input = 0;
		int[] intArr = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("하나의 값을 입력하세요 > ");
			input = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		
		for (int i = 0; i < intArr.length; i++) {
			if (input==intArr[i]) intArr[i] = 0;
		}
		
		
		
//		for (int i = 0; i < intArr.length; i++) {
//			if (intArr[i]==0) {
//				intArr[i] = intArr[i+1];
//				intArr[i+1] = 0;
//			}
//		}
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		
		
		
		
	}
}
