package com.kh.oop.Constructor;

public class cafe {// 맨 위는 () 들어가지 않음 
	//필드 선언
		//카페 이름 지역 테이블수
	public String name;
	public String location;
	public 	int tableNum;
	
	//기본 생성과 필수 생성자 만들기
	//기본 생성자
	public cafe() { 
	
		
	}
	//필수 생성자  
	public cafe(String a, String b,int c) {
		this.name=a;
		this.location=b;
		this.tableNum=c;
		
	}
	
	//void 메서드 만들기
	public void cafeInfo() {
		System.out.println("카페 이름 : "+name);
		System.out.println("카페 위치 : "+location);
		System.out.println("카페 테이블 수 : "+tableNum);
		System.out.println("---------------");
	}
	
	
	//메인 출력
	public static void main(String[] args) {
		System.out.println("안녕하세요 .kh민족입니다.");
		System.out.println("===카페 조회하기===");
		
		//Cafe 객체를 사용해서
		//1. 기본생성자로 cafe1 만들기
		//이름 테이블 작성하고 출력하기
		cafe cafe1=new cafe();
		cafe1.name="카페1";
		cafe1.tableNum=3;
		cafe1.cafeInfo();
		
		//2.지역 테이블 작성
		cafe cafe2=new cafe();
		cafe2.location="서울";
		cafe2.tableNum=4;
		
		cafe2.cafeInfo();
		//3.필수 생성자 만들기 
		cafe cafe3=new cafe("cafeKH","Seoul",6);
		
		cafe3.cafeInfo();
		

	}

}
