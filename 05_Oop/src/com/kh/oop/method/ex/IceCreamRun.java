package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
	 iceCream ice1 =new iceCream();
	 ice1.setName("A아이스크림");
	 ice1.setSugar(4);
	 ice1.setMilk(false);
	 
	 ice1.makeIceCream();
	 
	 System.out.println("-------------");
	 
	 iceCream ice2=new iceCream(3,"V",true);
	 ice2.makeIceCream();
	 
	  
	 

	}

}
