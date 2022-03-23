package com.exam.day11_Collection;

import java.util.ArrayList;

public class Exam02 {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "apple";
//		arr[1] = 10; type mismatch
		
		ArrayList list = new ArrayList<>();
		list.add("apple");
		list.add(10); // 에러가 발생하지 않음
		list.add(true);
		list.add('A');
		
		// 배열 : 같은 자료형의 데이터를 묶어놓은 집합
		// ArrayList : 마찬가지로 배열이지만 향상됨.
		// String, boolean, 실수, 정수...
		// Object는 모든 자료형/모든 클래스를 아우를 수 있다.
		// 다형성 : 부모가 자식을 담을 수 있는 성질
		// ArrayList는 Object 형 배열.
		
		String a = "mango";
		char temp1 = a.charAt(0);
		System.out.println(temp1);
		
		 // Object를 가리키고 있기 때문에 자식인 String에 정의된 charAt을 사용할 수 없음 (downcasting 필요.)
		char temp2 = ((String)list.get(0)).charAt(0);
		
		System.out.println(temp2);
		
		int temp3 = (int)list.get(1);
		double temp4 = ((double)list.get(2));
		boolean temp5 = ((boolean)list.get(3));
		
		
	}
}
