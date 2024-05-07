package com.kh.oop.method.oop;

public class CoffeMaker {
	private String coffeType;//커피 종류
	private int sugar;//설탕양
	private boolean milk;//우유 유무
	public String getCoffeType() {
		return coffeType;
	}
	public void setCoffeType(String coffeType) {
		this.coffeType = coffeType;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	// boolean 같은 경우 get이 아니라 is로 표기 
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	//생성자
	public CoffeMaker(){
		
	}
	//필수 생성자
	public CoffeMaker(String a, int b,boolean c  ) {
		this.coffeType=a;
		this.sugar=b;
		this.milk=c;}
	//void-커피 제조
	public void makeCoffe() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : " + coffeType);
		System.out.println("설탕 : " + sugar + "g");
		//만약에 우유가 추가 됐다면 
		if(milk) {
			System.out.println("우유 추가");
		}else {//우유 없음 
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		
	}
	
	/*public static void main(String[] args) {
		//기본 생성자로 객체 사용 
		CoffeMaker coffe1=new CoffeMaker();
		coffe1.setCoffeType("아메리카노");
		coffe1.setSugar(1);
		coffe1.setMilk(false);
		
		coffe1.makeCoffe();
		System.out.println("======");
		CoffeMaker coffe2=new CoffeMaker("카페라떼",3,true);
		coffe2.makeCoffe();
		
	}
	*/
	
	
}
