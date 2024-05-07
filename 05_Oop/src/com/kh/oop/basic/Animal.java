package com.kh.oop.basic;

public class Animal { //동물
	
	//1.필드 String name이름 나이 int age
	public String name;
	public int age;
	
	public Animal() {
		
	}
	
	public Animal(String 이름,int 나이) {
		this.age=나이;
		this.name=이름;	
	}
	
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println();
	}
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.name="개";
		dog.age=3;
		dog.info();
		
		Animal cat=new Animal("고양이",3);
		cat.info();
	}
}
