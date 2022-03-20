package com.exam.day10_oop02.shop01;

public class Shop { // 아이스크림 가게 재고 관리 프로그램
	// 가게 name, openTime, closeTime , iceCream
	
	private String nameString;
	private String openTime;
	private String closeTime;
	private IceCream[] iceCream;
	private Bread[] bread;
	
	private int index;
	
	public Shop() {}
	public Shop(String nameString, String openTime, String closeTime, IceCream[] iceCream) {
		this.nameString = nameString;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.iceCream = iceCream;
	}
	public Shop(String nameString, String openTime, String closeTime, IceCream[] iceCream, Bread[] bread) {
		this.nameString = nameString;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.iceCream = iceCream;
		this.bread = bread;
	}
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public IceCream[] getIceCream() {
		return iceCream;
	}
	public void setIceCream(IceCream[] iceCream) {
		this.iceCream = iceCream;
	}
	public Bread[] getBread() {
		return bread;
	}
	public void setBread(Bread[] bread) {
		this.bread = bread;
	}
	
	
	public void addBread(Bread bread) {
		this.bread[index++] = bread;
	}
	
	public String printBread() {
		String rs = "";
		for (int i = 0; i < this.bread.length; i++) {
			if (this.bread[i] != null) {
				rs += this.bread[i].getProduct_no() 
						+ " : " + this.bread[i].getName() 
						+ " : " + this.bread[i].getPrice()
						+ "\n";
			}
		}
		return rs;
	}
	
	
	
	public void addIceCream(IceCream iceCream) {
		this.iceCream[index++] = iceCream;
	}
	
	public String printIceCream() {
		String rs = "";
		for (int i = 0; i < this.iceCream.length; i++) {
			if (this.iceCream[i] != null) {
				rs += this.iceCream[i].getProduct_no() 
						+ " : " + this.iceCream[i].getName() 
						+ " : " + this.iceCream[i].getPrice()
						+ "\n";
			}
		}
		return rs;
	}
	
	
}
