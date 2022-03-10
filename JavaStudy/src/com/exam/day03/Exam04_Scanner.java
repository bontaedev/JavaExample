package com.exam.day03;

import java.util.Scanner;

public class Exam04_Scanner {
	public static void main(String[] args) {
		
		/*
		 * Scanner : 콘솔창을 입력할 수 있게 해주는 자바 jdk에 내장된 도구
		 * 
		 * import : 외부로부터 필요한 도구를 가져오는 작업
		 * 
		 * next() : 엔터키를 치면 메서드를 종료하고 입력값을 반환
		 * 
		 * 문자를 입력할 때마다 하나씩 버퍼에 들어간다
		 * 띄어쓰기도 버퍼에 들어가고 엔터키가 버퍼에 들어갈때
		 * 버퍼의 앞에서 부터 밀어서 반환되고 띄어쓰기 앞까지만 밀려나간다.
		 * 
		 * */
		
//		Scanner sc = new Scanner(System.in);
		// System.out.println(sc.next());
		
//		String input =  sc.next();
//		System.out.println("input : " + input);
		
		// next() : 첫번째 띄어쓰기 혹은 엔터키 앞까지의 문자만 출력
		// nextLine() : 엔터키 앞까지의 모든 문자를 출력
//		String input = sc.nextLine();
//		System.out.println("input : " + input);
		
		// Q. 사용자에게 이름 나이 직업을 입력받아 출력.
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("유저의 이름, 나이, 직업을 각각 입력하세요.");
		
		String name = sc.nextLine();
		String age = sc.nextLine();
		String job = sc.nextLine();
		
		System.out.println(name + " 유저의 나이는 " + age + "살 이며 직업은 " + job + " 입니다.");
		sc.close();
		*/
		
		/*
		 * 
		// 나이를 입력하세요. (nextInt 사용)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int input = sc.nextInt();
		System.out.println("input : " + input);
		// 명시적인 자료형을 이용한 next메서드를 사용할때 주의할 점..
		// 입력을 종료하는 엔터키가 버퍼에 잔존해 있어 뒤에 있을 작업에 영향을 미칠 수 있다.
		// 되도록 nextLine만 사용하고 섞어쓰지 않도록 하기
		
		sc.nextLine(); // 남아있는 엔터키값을 처리
		
		System.out.println("직업를 입력하세요.");
		String job = sc.nextLine(); // 버퍼에 엔터키값이 이미 들어있어서 아무것도 없는 것이 담김
		System.out.println("직업 : " + job);
		 *
		 */
		
		/*
		 * 
		// nextLine() 사용 -> String -> 형변환 해서 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int input = Integer.parseInt(sc.nextLine());
		System.out.println("age : " + input);
		*/
		
		/*
		// nextLine을 이용해 String -> boolean
		Scanner sc = new Scanner(System.in);
		System.out.println("type true or false");
		boolean b = Boolean.parseBoolean(sc.nextLine());
		System.out.println("b : " + b);
		*/
		
		// nextLine()을 이용해 String -> char
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력하세요. ");
		char gen = sc.nextLine().charAt(0);
		System.out.println("gender : " + gen);

		
	}
}
