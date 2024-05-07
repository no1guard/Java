package com.kh.oop.method.ex;

public class coffeRun {
	public static void main(String[] args) {
		//커피 메이커 객체 생성 
		CoffeMaker coffe1= new CoffeMaker();
		coffe1.setCoffeType("아메리카노");
		coffe1.setSugar(1);
		coffe1.setMilk(false);
		coffe1.makeCoffe();
		System.out.println("--------");
		
		CoffeMaker coffe2=new CoffeMaker("디카페인아메리카노",2,true);
		coffe2.makeCoffe();
		
	}
}
