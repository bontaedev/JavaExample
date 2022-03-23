package com.practice.day07;

import java.util.Scanner;

public class Quiz04_Customer {
	// 인사
	public static String getCustomer(String name) {
		return (name + " 님 안녕하세요!");
	}
	
	// 손님 숫자
	public static String getCustomer(int peopleNum) {
		if (peopleNum == 1) {
			return "혼밥 손님입니다.";
		} else return ("손님 " + peopleNum + "명 입장하였습니다.");
	}
	
	// 체온
	public static String getCustomer(double temp) {
		
		if (temp > 37.0) {
			return "너무 높습니다. 입장불가";
		} else if (temp > 36.5 && temp < 37) {
			return "정상 체온";
		} else { // else로 마무리 해야 에러가 안남
			return "저체온";
		}
	}
	
	// 매장 손님 여부
	public static String getCustomer(boolean toGo) {
		if (toGo) {
			return "매장 손님입니다.";
		}
		return "포장 손님입니다.";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 손님 맞이 프로그램 ====");
		
		System.out.print("1. 이름을 입력해 주세요 >> ");
		String name = getCustomer(sc.nextLine());
		System.out.println(name);
		
		System.out.print("2. 인원수를 입력해 주세요 >> ");
		String peopleNum = getCustomer(Integer.parseInt(sc.nextLine()));
		System.out.println(peopleNum);
		
		System.out.print("3. 현재 체온을 입력해 주세요 >> ");
		String temp = getCustomer(Double.parseDouble(sc.nextLine()));
		System.out.println("현재 입장한 손님의 체온은 " + temp + "입니다.");
		
		System.out.print("4. 매장 식사여부를 입력해 주세요 >> ");
		String toGo = getCustomer(Boolean.parseBoolean(sc.nextLine()));
		
	}
}







/* 4가지 메뉴를 띄워주는 프로그램
 * - 4가지 메서드 모두 getCustomer를 사용하고 오버로딩을 적용
 * 1. 사용자가 이름을 입력하면 "~님 안녕하세요!"을 출력하는 메서드 실행
 * 2. 사용자가 인원수(정수)를 입력하면 "손님 ~명 입장하였습니다." 1명이면 "혼밥손님입니다."를 출력
 * 3. 사용자가 체온(실수)을 입력하면 '현재 입장한 손님의 체온은 ~도 입니다.' 출력
 *  36.5~37도 사이면 정상, 미만이면 저체온, 초과면 입장불가를 출력하는 메서드
 * 4. 사용자가 true를 입력하면 "매장 손님입니다." false를 입력하면 "포장 손님입니다."를 출력
 * 
 * */

