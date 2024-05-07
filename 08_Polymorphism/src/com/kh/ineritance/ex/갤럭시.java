package com.kh.ineritance.ex;

public class 갤럭시 extends 스마트폰{
	
//필드
	private int 안드로이드; 
//메서드
	//Setter
	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}

	//Getter
	public int get안드로이드() {
		return 안드로이드;
	}
	//생성자 : 컨트롤 스페이스 엔터
	public 갤럭시() {
		 
	}
	//생성자 필수 알트 쉬프트 에스 > o

	public 갤럭시(int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;
	}

	//@Override toSting alt shif s 
	@Override
	public String toString() {
		return "갤럭시버전 : "+안드로이드+"/"+super.toString();
	}

 
 
 
}
