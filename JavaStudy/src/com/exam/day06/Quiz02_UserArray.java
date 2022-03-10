package com.exam.day06;

import java.util.Scanner;

public class Quiz02_UserArray {
	public static void main(String[] args) {
		
		// 사용자에게 입력받은 정수만큼 int형 배열 크기를 할당
		// 1부터 순차적으로 값을 할당
		
		// 배열을 사용할 때는 ArrayIndexOutOfBoundsException이 발생 할 가능성이 높음
		
		// try ~ catch : 예외 처리, 에러가 발생할 여지가 있는 코드 부분에 씌워 에러메세지를 띄워줄 수 있게 한다.
		
		Scanner sc = new Scanner(System.in);
		int size = 0;
		try {
			// 에러가 발생할 수 있는 코드를 이 안쪽에 넣음 
			System.out.print("input number > ");
			size = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			// try문 안의 코드에서  에러가 발생했다면
			// 실행해주고 싶은 코드가 작업을 이 안쪽에서 해줌
			System.out.println("유효한 번호가 아닙니다. 정수만 입력하세요!");
		}
		
		int[] arr = new int[size];
		try {
			System.out.println(arr[10]);
		} catch (Exception e) {
			// Exception : 모든 에러를 포함하는 최상위
			System.out.println("없는 인덱스 번호입니다.");
		}
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]= i+1;
//			System.out.println("arr[" + i + "] : " + arr[i]);
//		}
		
//		for (int i : arr) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);
//		}
	
	}
}
