package com.kh.oop.method.ex;

public class iceCream {
	//필드 만들기
	private int sugar;
	private String name;
	private boolean milk;
	
	//Setter
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//Getter
	public int getSugar() {
		return sugar;
	}
	public String getName() {
		return name;
	}
	public boolean isMilk() {
		return milk;
	}

	//생성자 기본 
	public iceCream() {
		
	}
	//생성자 필수 
	public iceCream(int a,String b, boolean c) {
		this.sugar=a;
		this.name=b;
		this.milk=c;
	}
	
	//void메서드 만들기
	public void makeIceCream() {
		System.out.println("아이스크림을 만듭니다.");
		System.out.println("이름 : "+name);
		System.out.println("설탕 : "+sugar+"g");
		System.out.println("우유 유무 : "+milk);
		if(milk) {
			System.out.println("우유 추가");
		}else {
			System.out.println("우유 미추가");
		}
	}

}
