package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		DrinkMaker coffe1=new DrinkMaker("허브티",1,15);
		DrinkStore coffe12=new DrinkStore(coffe1,"경기","맥아커피",false);
		coffe12.orederDrink();
		System.out.println("============");
		DrinkMaker coffe2=new DrinkMaker("아메리카노",3,1);
		DrinkStore coffe3=new DrinkStore(coffe2,"서울 서초구","빠나쁘레소",true);
		coffe3.orederDrink();

	}

}
