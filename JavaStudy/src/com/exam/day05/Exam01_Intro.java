package com.exam.day05;

import java.util.Scanner;

public class Exam01_Intro {
	public static void main(String[] args) {
		
		/* 랜덤한 수 생성
		 * 
		 * - 임시 비밀번호 생성 로직
		 * - Math.random()
		 * */
		
		// 지정한 숫자 범위 내에서 랜덤한 수를 뽑아내고 싶을 때
		// Math.random() * ((MAX - MIN +1)) + MIN
		// Math.random() * ((10 - 1 + 1)) + 1
		
		// 정수 표현을 위해 int로 강제 캐스팅
		// 정수를 char로 형변환도 가능, 하면 문자로 출력된다
		// 여러가지 타입의 데이터를 연산할 때는 항상 계산 순서를 주의
//		for (int i = 0; i < 100; i++) {
//			System.out.println((int)(Math.random() * ((20 - 2 + 1)) + 2));
//			System.out.print((char)(Math.random() * ((122 - 65 + 1)) + 65) + " ");
//		}
		
		// quiz. 1~10 사이의 random 값을 뽑아내면, 사용자가 홀짝 중 하나를 선택.
		// 사용자가 입력한 값에 따라서 사용자에게 정답! 실패!라는 출력구문을 보여준다.
		
		// 랜덤 값 미리 저장, 정답을 미리 저장하는 변수 초기화
		
		// 변수 초기화를 할때 빈 스트링이나 null을 이용
		
		final int MAX = 10;
		final int MIN = 1;
		int randomValue = (int)(Math.random() * ((MAX - MIN +1)) + MIN);
		String ans = "";
		
		// 정답을 저장
		if (randomValue % 2 == 1) ans = "홀";
		else ans = "짝";
		
		System.out.println(ans);
		
		// else vs else if 
		// 조건문에서 마지막인 else 대신 else if라면
		// 사용자 입장에서는 직관적으로 이해 할수 있지만 컴파일러는 else if 를 보고
		// 다른 상황이 존재할 수 있다는 여지를 남겨주기 때문에 ans를 if문에서 부르게 되면
		// ans에는 값이 존재하지 않기 때문에 에러가 날 여지가 있다.
		// else로 끝나게 되면 컴파일러는 판단하에 ans
		
		while (true) {
			// 입력값 받음
			Scanner sc = new Scanner(System.in);
			System.out.print("홀/짝 중 하나를 입력 > ");
			String oddOrEven = sc.nextLine();
		
			// 비교
			if (oddOrEven.equals(ans)) {
				System.out.println(randomValue);
				System.out.println("정답!");
				break;
			} else {
				System.out.println(randomValue);
				System.out.println("실패!");
			}
		}
		
		
		
		
		
	}
	
}
