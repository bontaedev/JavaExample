package com.exam.day06;

public class Exam03_Swap {
	public static void main(String[] args) {
		
		char[] arr = new char[] {'A','B'};
		System.out.println(arr[0] + " " + arr[1]);
		
		// A와 B의 순서 뒤집기
		
		/*
		char temp; // 임시 공간 생성
		temp = arr[0]; // 임시 공간에 첫번째 원소 저장
		System.out.println(temp);
		arr[0] = arr[1]; // 2번째 원소를 1번째 공간으로 덮어씌움
		arr[1] = temp; // 임시 공간의 데이터를 2번째 공간에 덧씌움
		System.out.println(arr[0] + " " + arr[1]);
		
		*/
		
		
		
		// hello가 담긴 char 배열 만들기
		// 뒤집어서 olleh가 담기도록 만들어 보기
		
		char[] hello = {'h','e','l','l','o'};
		char temp;
		
//		char[] tempArr = new char[5];
		
		// swap 반복문
		for (int i = 0; i < (hello.length/2); i++) {
			temp = hello[i];
			hello[i] = hello[(hello.length-1)-i];
			hello[(hello.length-1)-i] = temp;
		}
		
		// 바뀐 출력문 
		for (char i : hello) {
			System.out.print(i);
		}
		
		
		
		
		
		
		
//		temp = hello[0];
//		hello[0] = hello[4];
//		hello[4] = temp;
//		
//		temp = hello[1];
//		hello[1] = hello[3];
//		hello[3] = temp;
		
		
//		temp = hello[2];
		
	}
}
