package com.exam.day11_oop_test;

// default 클래스 (같은 패키지 안에서만)
class Aclass {
	public void funcA() {
		System.out.println("funA");
	}
	public void funcExtra() {
		System.out.println("A");
	}
}

class Bclass extends Aclass {
	public void funcB() {
		System.out.println("funB");
	}
	public void funcExtra() {
		System.out.println("B");
	}
}

class Cclass extends Aclass {
	public void funcC() {
		System.out.println("funC");
	}
}

public class Test {
	public static void main(String[] args) {
	//  다형성
	
	/* 다형성 : 다양한 형태의 성질을 가지는 것
	 *  한 클래스가 다양한 클래스의 성질을 가질 수 있는 것 
	 *  (상속관계에서 부모타입의 참조변수가 자식타입의 인스턴스를 담을 수 있는 것)
	 * 
	 * */
		Aclass a1 = new Bclass();
		a1.funcA();
		a1.funcExtra();
		
		Aclass a2 = new Cclass(); // 자신을 상속받는 모든 자식형 인스턴스를 부모형 참조변수에 담을 수 있음
		a2.funcA();
		
		int a = 10;
		long b = a; // 자동형변환 - 큰 자료형에 작은 자료형을 담는 upcasting
		
		// 자식 인스턴스는 부모보다 몸집이 크다.
		// 상속 시에는 Bclass형 인스턴스가 아니라 그 안의 Aclass형 인스턴스를 가리키게 된다.
		
		// 부모의 참조변수로 자식의 기능을 사용하게 하고 싶다면?
		// 강제형변환 - 참조변수를 형변환 (a라는 참조변수(상위클래스)를 B형으로(자식클래스) 다운캐스팅)
		((Bclass)a1).funcB();
		((Cclass)a2).funcC();
		
		// 반대로 자식 클래스형 참조변수에 부모 인스턴스를 담을 수 있을까? (불가능)
//		Bclass b1 = new Aclass();
//		Cclass c1 = new Aclass();
		
		// 부모형 인스턴스가 작기 때문에 자식 인스턴스를 담는 것은 불가능...
		Bclass b2 = (Bclass)(new Aclass());
		b2.funcA();
		b2.funcB();
		
		
	}
}
