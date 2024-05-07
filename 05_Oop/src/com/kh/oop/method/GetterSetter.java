package com.kh.oop.method;

import com.kh.oop.method.ex.Person;

/*
Setter
	객체의 속성 값을 설정하는 메서드
	객체 외부에서 속성 값을 변경할 수 있음
	
Getter 
	객체의 속성 값을 반환하는 메서드
	객체 외부에서 속성 값을 읽을 수 있음
 
 단축키 alt +shit + s 해준 후  getters and getters누르고 하면댐 
 
*/

public class GetterSetter {
	//필드 
	private String name;	
	private int age;
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Setter를 활용해서 속성 값 설정
		person1.setName("홍길동");
		person1.setAge(20);
		
		//Getter를 활용해서 속성 값 읽기
		 
	}

}