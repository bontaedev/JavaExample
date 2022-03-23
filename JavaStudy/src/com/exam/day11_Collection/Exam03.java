package com.exam.day11_Collection;

import java.util.ArrayList;

public class Exam03 {
	public static void main(String[] args) {
		ArrayList tempArr = new ArrayList<>();
		// 제네릭(Generic) : ArrayList 도 배열 - ArrayList에 저장할 자료형을 명시해주는 것
		ArrayList<String> strList = new ArrayList<>();
		
		tempArr.add("apple");
		tempArr.add(10);
		tempArr.add(true);
		
		// 제너릭을 사용하면 저장할 데이터의 타입을 걸러주는 역할을 한다.
		strList.add("apple");
//		strList.add(boolean);
//		strList.add(10); // 에러
		
		// apple 값에서 a만 뽑아내고 싶다.
		char a = ((String)tempArr.get(0)).charAt(0);
		System.out.println(a);
		
		// 제네릭을 사용하게 되면 강제형변환 x
		char a2 = strList.get(0).charAt(0);
		System.out.println(a2);
		
		
		/* 기본자료형 ArrayList 
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 * -> 기본자료형은 클래스가 아니다. 자바에서 지정해 놓은 특수한 기본 자료형.
		 * - 제네릭에 들어가는 타입은 클래스형 자료형이 들어가야 한다.
		 * - Wrapper class : 기본 자료형을 감싸고 있는 클래스. 기본 자료형을 마치 클래스처럼 사용하는게 가능하도록 해준다.
		 * 
		 * int - Integer
		 * char - Character
		 * 
		 * */
		
		
		String temp = "a"; // String은 클래스로 이루어진 참조자료형
		int x = 10; // 기본 자료형은 stack 영역에 저장된다. 참조할 수 있는 인스턴스가 없다.
		
		// int형 ArrayList인 intList를 생성
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(12);
		intList.add(32);
		System.out.println(intList.get(0) + "\t" + intList.get(1) + "\t " + intList.get(2));
		
		ArrayList<Double> doubleList = new ArrayList<>();
		ArrayList<Character> charList = new ArrayList<>();
		ArrayList<Boolean> boolList = new ArrayList<>();
	}
}
