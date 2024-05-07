package com.kh.oop.method.ex;

public class PizzaStore {
	//필드 
	private String pizzaName;//피자명
	private int pizzaPrice; // 피자가격 
	
	//필드 외에는 모두 매서드임 
	//메서드 : setter
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPirce(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	//메서드 : getter
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPirce() {
		return pizzaPrice;
	}
	
	//setter getter

	
	//메서드 : 생성자 : 기본 
	public PizzaStore() {
		
	}
	
	//메서드 : 생성자 : 필수 피자의 이름 가격 
	public  PizzaStore(String PizzaName,int Pizzapirce) {
		this.pizzaName=PizzaName;
		this.pizzaPrice=Pizzapirce;
		
	}
	
	//메서드 : void
	public void inforPizza() {
		System.out.println("피자이름 : "+pizzaName);
		System.out.println("피자가격 : "+pizzaPrice);
	}
	//메서드 : main(단축키 main ctrl+ space)
	public static void main(String[] args) {
		//피자 객체 
		PizzaStore pizza1=new PizzaStore();
		pizza1.setPizzaName("페페로니 피자");
		pizza1.setPizzaPirce(11000);
		
		pizza1.inforPizza();
		
		System.out.println("---------------");
		PizzaStore pizza2=new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		//가격 적는것을 잊음 
		pizza2.inforPizza();
		
		//필수생성자로 피자 생성 
		System.out.println("-------------");
		PizzaStore pizza3 =new PizzaStore("치즈피자",13000);
		pizza3.inforPizza(); 
	}
	
	
}
