package com.exam.day11_Collection;

import java.util.ArrayList;

public class Exam01 {
	public static void main(String[] args) {
		// ArrayList : 똑똑한 동적 배열
		// 사이즈를 명시해주지 않아도 데이터에 따라 공간을 조절한다.
		
		// 생성
		String[] arr = new String[5];
		ArrayList<String> list = new ArrayList<>();
		// 중간에 꺽쇠괄호가 나온다
		// 사이즈를 미리 정하지 않아도 된다.
		
		
		// 값 추가 (apple)
		arr[0] = "apple"; // 배열의 인덱스를 활용해 값 추가
		list.add("apple"); // add라는 메서드를 활용해 0번 인덱스부터 순차적으로 값 추가
		
		// 값 출력
		System.out.println("array[0] : " + arr[0]);
		System.out.println("list.get(0) : " + list.get(0));
		
		// 값을 더 추가
		arr[1] = "banana";
		arr[2] = "kiwi";
		arr[3] = "mango";
		
		list.add("banana");
		list.add("kiwi");
		list.add("mango");
		
		// 길이 값 출력
		System.out.println("arr length : " + arr.length);
		System.out.println("list length : " + list.size());
		
		// 값 삭제 ( 1번 인덱스에 있는 값을 삭제 )
		arr[1] = null;
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr length : " + arr.length);
		
		System.out.println("list get : " + list.get(1)); // 삭제 전
		System.out.println("list size : " + list.size());
		list.remove(1);
		System.out.println("list get : " + list.get(1)); // 삭제 후
		System.out.println("list size : " + list.size());
		
		// toString을 이용해 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.toString());
	}
}
