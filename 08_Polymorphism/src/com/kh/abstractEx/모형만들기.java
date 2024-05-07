package com.kh.abstractEx;

public class 모형만들기 {
	public static void main(String[] args) {
		//삼각형 만들기
		삼각형 우아한삼각형 = new 삼각형("빨간색",3,4);
		//삼격형의 넓이와 둘레와 색상
		System.out.println("삼각형의 색깔 : "+우아한삼각형.get색깔());
		System.out.println("삼각형의 넓이 : "+우아한삼각형.도형넓이());
		System.out.println("삼각형의 둘레 : "+우아한삼각형.도형둘레());
	
		//사각형 만들기
		//사각형 각진사각형 ("파란사각형"
		System.out.println("================");
		사각형 사각형1= new 사각형("파란색",3,5);
		System.out.println("사각형의 색깔 : "+사각형1.get색깔());
		System.out.println("사각형의 넓이 : "+사각형1.도형넓이());
		System.out.println("사각형의 둘레 : "+사각형1.도형둘레());
	}

}
