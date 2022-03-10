package com.exam.day03;

public class Exam03_Operator {
	public static void main(String[] args) {
		/*
		 * 연산자
		 * 1. 산술연산자 (사칙연산 + - * / %)
		 * 2. 대입연산자 (=, +=, -=, /=, *=, %=)
		 * 3. 비교연산자 ( <, > <=, >=, ==, !=)
		 * 4. 증감연산자 (전위연산, 후위연산)
		 * 5. 논리연산자 (&& and || or)
		 * 6. 삼항연산자 (조건식A ? b : c)
		 * */
		
		int a = 10;
		int b = 4;
		int c = 4;
		
		// 산술연산자
		/**/
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 몫 연산
		System.out.println(a % b); // 나머지 연산
		
		
		// 비교연산자 - 반환값으로 boolean
		/**/
		System.out.println("a > b " + (a > b));
		System.out.println("a < b " + (a < b));
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		System.out.println("b <= c " + (b <= c ));
		
		char c1 = 'a'; // 97
		char c2 = 'A'; // 65
		System.out.println(" c1 == c2 : " + (c1 == c2));
		System.out.println(" c1 > c2 : " + (c1 > c2));
		
		
		// 참조자료형 String 값에 대한 비교는? 대입연산자x
		// equals() 메서드를 이용
		// 대입 연산자를 이용하면 주소값끼리 비교하기 때문에 정확하지 않음
		
		/**/
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "def";
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		
		

		// 대입 연산자
		/**/
		int d = 5;
		d += 3;
		System.out.println(d);
		d -= 4;
		System.out.println(d);
		d *= 10;
		System.out.println(d);
		
		// 증감 연산자 (전위/후위) : ++ --
		int e = 20;
		int f = 20;
		
		System.out.println("원본 데이터 : " + e + " / " + f);
		
		
		// 전위 연산
		/**/
		System.out.println(++e); // 그 즉시 +1을 완료 (반영)
		System.out.println(e);
		
		System.out.println(--e); // 그 즉시 -1을 완료
		System.out.println(e);
		
		// 후위연산 - 값이 쓰이고 연산이 이루어짐
		System.out.println(f++); // e를 일단 출력하고 증가 (다음줄부터 적용)
		System.out.println(f);
		
		System.out.println(f--); // e를 일단 출력하고 감소 (다음줄부터 적용)
		System.out.println(f);
		
		
		/**/
		System.out.println("연산 1 : " + (++e + 5));
		System.out.println("연산 2 : " + (f++ + 5)); // 후위연산자는 Sysout이 끝나고 처리
		System.out.println("f : " + f);
		
		int x = 10;
//		int y = x-- + 5 + --x;
		int y = --x + 5 + x--;
		System.out.println("y : " + y);
		
		
		/**/
		
		// 논리연산 (and, or, !), 결과값은 true or false
		
		// and && 연산은 연산자를 기준으로 양쪽의 두 조건이 모두 TRue여야 true로 나옴
		System.out.println("a > b && a > c : " + (a > b && a > c));
		System.out.println("a < b && a > c : " + (a < b && a > c));
		System.out.println("a < b && a < c : " + (a < b && a < c));
		
		// or || 연산은 연산자를 기준으로 한쪽이라도 True가 되면 true로 결과값이 나옴
		// shortcut 연산 : 첫번째 조건식을 검사하고 이미 false이면 뒤에 조건은 스킵
		System.out.println("a > b || a > c : " + (a > b || a > c));
		System.out.println("a > b || a > c : " + (a > b || a < c));
		
		
		
		// 삼항 연산자
		// 비교식? A : B
		
		int i = 10;
		int j = 4;
		int k = 4;
		
		System.out.println(i < j ? "참" : "거짓");
		
		// 부정연산자 ! Not
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(10==5);
		
		
		
		
		
		
		
		
		
		
	}
}
