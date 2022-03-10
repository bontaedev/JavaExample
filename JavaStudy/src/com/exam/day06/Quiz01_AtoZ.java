package com.exam.day06;

public class Quiz01_AtoZ {
	public static void main(String[] args) {
		
		// char형 배열 26칸을 만들어 A to Z를 저장하고 출력
		// char ascii code를 사용
		
		char[] charArr = new char[26];
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = (char)(i + 65);
			System.out.println("charArr[" + i + "] : " + charArr[i]);
		}
		
		// for-each : 향상된 for문
		// 처음 index 부터 끝까지 무조건 순차적으로 반복
		int[] arr = new int[10];
		for(int i : arr) {
			System.out.println(i + " ");
		}
	}
}
