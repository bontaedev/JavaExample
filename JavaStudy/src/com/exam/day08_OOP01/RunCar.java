package com.exam.day08_OOP01;

public class RunCar {
	public static void main(String[] args) {
		Car avante = new Car();
		
//		avante.brand = "Hyundai";
//		avante.speed = 0;
//		avante.oil = 10;
		
		avante.setBrand("Hyundai");
		avante.setOil(50);
		avante.setSpeed(120);
		System.out.println(avante.getBrand());
		System.out.println(avante.getOil());
		System.out.println(avante.getSpeed());
		
		avante.powerOn();
		avante.speedUp();
		
		Car morning = new Car("Kia",100,50);
		
		System.out.println(morning.getBrand()
				+ " : " + morning.getSpeed() 
				+ " : " + morning.getOil());
		
		
	}
}
