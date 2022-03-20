package com.exam.day08_OOP01;

public class Car {
	/* 
	 * 속성 : brand, speed, oil
	 * 기능 : 시동 on/off speed up/down
	 * 
	 * 정보은닉(캡슐화) : 사용자가 접근하면 안되는 데이터들을 내부적으로 숨기거나 접근을 제한.
	 * 1. 접근제한자 사용.
	 * 2. getter/setter 사용
	 * - 값을 얻어오거나 셋팅할 수 있는 함수
	 * - 읽기 전용, 쓰기 전용
	 * - getter/setter는 반듯 public으로 선언
	 * - 이를 통해 들어오는 데이터와 나가는 데이터에 전처리 후처리를 해줄 수 있다. 
	 *
	 * 생성자 Constructor
	 * - 리턴타입 없음
	 * - 클래스명과 이름이 같음
	 * - 인스턴스가 만들어질 때 생성자가 필드 공간들을 초기화 (기본값을 셋팅)
	 * - 자바에서는 기본생성자를 명시하지 않아도 JVM이 추가해준다
	 * - 대신 생성자를 오버로딩 해서 사용할 때는 기본 생성자를 따로 명시해줘야 한다. JVM이 따로 추가하지 않기 때문
	 * 
	 * */
	
	private String brand;
	private int speed;
	private int oil;
	
	// 기본 생성자 Constructor
	public Car() {}
	
	public Car(String brand, int speed, int oil) {
		this.brand = brand;
		this.speed = speed;
		this.oil = oil;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		// 인스턴스안의 brand와 매개변수로 전해진 brand
		// this는 주소값. 즉 자기자신이라고 생각하자.
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	
	public void powerOn() {
		System.out.println("시동이 on");
	}
	public void powerOff() {
		System.out.println("시동이 off");
	}
	public void speedUp() {
		speed++;
		System.out.println("현재 스피드는 " + speed);
	}
	public void speedDown() {
		speed--;
		System.out.println("현재 스피드는 " + speed);
	}
}
