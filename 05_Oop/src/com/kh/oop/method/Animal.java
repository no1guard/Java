package com.kh.oop.method;

public class Animal {
	
//필드 
	public String name;
	public int age;
	
//이제부터 여기 밑에서부터는 메서드 
	//메서드 
		//생성자
	//초기 생성자
public Animal() {
	
}
	//필수 생성자
public Animal(String name,int age) {
	this.name=name;
	this.age=age;
	
}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// void 로 프린트 출력하기 
	public void info() {
		System.out.println("동물 이름 :"+name);
		System.out.println("동물 나이 :"+age);
	}
	
	
	
	//메인 메서드
	public static void main(String[] args) {
		Animal dog=new Animal("강아지",1) ;
		Animal cat=new Animal("고양이",2) ;
		
		dog.info();
		cat.info();
	 

	}

}
