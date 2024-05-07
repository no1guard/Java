package com.kh.example.practice6;

import com.kh.example.practice6.model.vo.Book;

public class run {

	public static void main(String[] args) {
		
		System.out.println("kh 서점에 오신 것을 환영합니다.");
		Book member1=new Book();
		
		member1.title="그것이 알고싶다.";
		member1.publisher="노노";
		member1.author="너구";
		member1.price=3;
		member1.discountRate=3.0;
		
		member1.inform();
		
		Book member2=new Book("5월 32일","kh T반","김경난");
		member2.inform();
		
		Book member3=new Book("Do it! 자바 프로그맹 입문","이지스퍼블리싱1","박은종",16500,0.34);
		member3.inform();
		
	
	}

}
