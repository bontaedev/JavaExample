package com.exam.day06;

public class Exam02_Array {
	public static void main(String[] args) {
		// 배열의 수정 / 삭제
		// CRUD 구현
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println("arr1 수정 전 :" +arr1[0]);
		arr1[0] = 10;
		System.out.println("arr1 수정 후 :" +arr1[0]);
		
		// charArr 안에 담겨있는 hello를 안녕하세요로 수정
		char[] charArr = {'h','e','l','l','o'};
		char[] newChar = {'안','녕','하','세','요'};
//		String newChar2 = "안녕하세요"; // 문자열을 charAt으로 하나씩 가져와 바꾸는 방법
		
		for (char i : charArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < charArr.length; i++) {
			charArr[i] = newChar[i];
			System.out.print(charArr[i] + " ");
		}
	}

}
