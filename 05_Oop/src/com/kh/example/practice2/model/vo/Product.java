package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;

	
	public String getpName() {
		return pName;
	}


	public int getPrice() {
		return price;
	}


	public String getBrand() {
		return brand;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Product() {
		
	}
	
	public void information() {
		System.out.println("이름은 :" + pName);
		System.out.println("가격은 : "+ price);
		System.out.println("브랜드는 : "+ brand);
	}

	public static void main(String[] args) {
		Product ac=new Product();
		ac.pName="234";
		ac.price=300;
		ac.brand="254";
	 
		ac.information();
	}

}
