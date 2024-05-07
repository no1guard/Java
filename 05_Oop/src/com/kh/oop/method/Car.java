package com.kh.oop.method;

public class Car {
	//필드 
	public String brand; //차 브랜드
	public String model; //차 모델
	public 	  int year;  // 차 년도
	
	// 생성자 
	
	// 생성자 : 기본
	public Car() {
		
	}
	// 생성자 : 필수 
	public Car(String brand,String model,int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	// return 메서드
	public String getBrand() {
		return brand;
	}
	public String getModel1() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public static void main(String[] args) {
		//자동차 car1 출력
		Car car1=new Car("Toyota","Carmy",2022);
	 
		//값을 출력
		System.out.println(car1.getBrand()+"   "+car1.getModel1()+ "   "+car1.getYear() );
		
	}

}
