package com.exam.day06;

public class Exam01_Array {
	public static void main(String[] args) {
		
		// 배열이 필요한 이유
		// 일관성이 있는 많은 데이터의 경우에 변수 대신에 관리할 것이 필요하다.
		// 같은 데이터타입의 자료형들을 모아놓은 집합.
		
		int[] arr = new int[5];
		/* int[] : int형 배열을 의미 (자료형)
		 * arr -  변수명
		 * new : heap영역에 데이터를 생성
		 *  -> 배열도 참조변수에 주소값을 저장하는 참조자료형
		 * int[n] : int형 데이터를 5칸 넣을 공간을 생성해라.
		 * = : heap영역에 만들어진 5칸짜리 공간을 stack에 생성한 참조변수에 이어줌.
		 * 배열을 생성할 때는 반드시 사이즈를 명시적으로 표기
		 * 
		 * */
		
		// stack영역에 변수와 heap영역의 데이터의 초기화 차이
		
		arr[0] = 10;
		// System.out.println(arr[0]);

		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
//		System.out.println("arr : " + arr);
//		System.out.println("arr[0] : " + arr[0]);
//		System.out.println("arr[1] : " + arr[1]);
//		System.out.println("arr[2] : " + arr[2]);
//		System.out.println("arr[3] : " + arr[3]);
//		System.out.println("arr[4] : " + arr[4]);
		
		// 배열의 생성과 함께 초기화
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,5};
		
		double[] arr4 = new double[] {0.5, 1.1, 1.5};
		// System.out.println(arr4[0]);
		
		String[] arr5 = new String[] {"a","b","c"};
		// System.out.println(arr5[2]);
		
		
		// 이미 배열에 저장된 데이터를 꺼내오는 작업
//		int[] temp = new int[] {1,2,3,4,5,6,7};
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println("arr[" + i + "] : " + temp[i]);
//		}
		
		// 비어있는 배열에 데이터를 순차적으로 저장
//		int[] temp2 = new int[5];
//		for (int i = 0; i < temp2.length; i++) {
//			temp2[i] = i + 1;
//			System.out.println("arr[" + i + "] : " + temp2[i]);
//		}
		
		
		// int형 배열 100칸 짜리를 만들어 0~99까지 담아보기
		int[] intArr = new int[100];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i;
			System.out.println("arr[" + i + "] : " + intArr[i]);
		}
		
		// int형 배열 100칸 짜리를 만들어 99~0까지 담아보기
		int[] intArr2 = new int[100];
		for (int i = intArr2.length-1; i >= 0; i--) {
			intArr2[i] = i;
			System.out.println("arr[" + i + "] : " + intArr2[i]);
		}
		
	}
}
