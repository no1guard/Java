package com.kh.ineritance.ex;

//자식클래스 
public class 아이폰 extends 스마트폰{

	
//필드
	private int IOS; // 아이폰 운영체제 





	//메서드 
	//Setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}
	//Getter
	public int getIOS() {
		return IOS;
	}
	
	//생성자 : 기본 ctrl +space > enter
	public 아이폰() {
		 
	}
	//생성자 : 필수 alt+shift+s > o 
	public 아이폰(String 화면,String 통신사 , String 성능 ,int IOS) {
		 super(화면,통신사,성능);
		 this.IOS=IOS;
		 
	}
	
	//toString
	public String toString() {
		return "아이폰버전 : "+IOS+"/"+super.toString();
	}
}
