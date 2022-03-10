package com.exam.day03;

public class Quiz01_Casting {
	public static void main(String[] args) {
		// 퀴즈 1 : 주어진 값을 모두 int형으로 변환해서 모두 더한 값 rs에 담아 출력
		char a = '2';
		double b = 5.6;
		long c = 125000;
		int d = 10000;
		
		int rs;
		
//		int ia = a;
//		System.out.println(ia);
//		int ib = (int)b;
//		System.out.println(ib);
//		int ic = (int)c;
//		System.out.println(ic);
//		rs = ia + ib + ic + d;
		
		rs = a + (int)b + (int)c + d;
//		rs = (int)(a + b + c + d);
		System.out.println("rs : " + rs);
	}
}
