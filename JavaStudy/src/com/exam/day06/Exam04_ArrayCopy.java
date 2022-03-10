package com.exam.day06;

public class Exam04_ArrayCopy {
	public static void main(String[] args) {
		// 배열 복사
		// shallow copy vs deep copy
		
		
		// 같은 주소값을 가지는 공간을 가르키게 된다면 shallow copy
		// 한 참조변수를 통해 값을 수정하면 다른 참조 변수의 주소값의 데이터도 변경된다.
		int[] arr = {1,2,3};
		System.out.println("arr 주소 : " + arr);
		System.out.println("복사 전 : " + arr[0]);

		int[] arr2 = arr;
		arr2[0] = 10;
		System.out.println("arr2 주소 : " + arr2);
		System.out.println("복사 후 : " + arr[0]);
		
		
		// deep copy
		// 실제 배열 안에 들어있는 값만 복사가 이뤄지는 것
		// 원본 데이터에 영향을 미치지 않는다.
		
		int[] arr3 = new int[3];
		for (int i = 0; i < 3; i++) {
			arr3[i] = arr[i];
		}
		System.out.println("arr3 주소 : " + arr3);
		System.out.println("복사 후 : " + arr[0]);
		
	}
}
