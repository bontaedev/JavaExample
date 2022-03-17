package com.exam.day07;

import java.util.Scanner;

public class Quiz03_Dictionary {
	public static String dict(String input) {
		
		String[] korDict = {"당근","가지","양파"};
		String[] engDict = {"carrot","eggplant","onion"};
		
		for (int i = 0; i < engDict.length; i++) {
			if (input.equals(korDict[i])) return engDict[i];
		}
		return "사전에 등록되지 않은 단어 ";
		
//		if (input.equals("당근")) return "carrot";
//		if (input.equals("양파")) return "onion";
//		if (input.equals("가지")) return "eggplant";
//		else return "등록된 단어가 사전에 없";
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 원하는 채소의 이름을 입력하세요 ====");
		System.out.print(">> ");
		String input = sc.nextLine();

		System.out.println("입력한 " + input + "은 영어로 " + dict(input) + "입니다.");
	}
}


/* 사용자에게
 * ==== 원하는 채소의 이름을 입력하세요 ====
 * >>
 * 
 * dict()라는 메서드를 생성해서 사용자가 입력한 채소를 영어 단어로 바꿔 반환해주는 기능 구현
 * "입력한 ??은 영어로 ??입니다."라고 출력
 * -> 채소는 3가지만, 그 외의 값을 입력하게 되면 "사전에 등록된 단어가 없습니다."를 출력
 * 
 * */