package com.kh.variable.ex;

public class VariableEx3 {
 // 메인메서드 (프로그램 실행하는 공간) 
	public static void main(String[] args) {
		 /*
		 강제 형변환
	     1. 값의 범위가 큰 자료형 - > 작은 자료형으로 강제 변환 ( ex : int와 long을 더할때 값이 int보면 long으로 강제 형변환) 
	     - > 하지만 데이터 손실 고려해야함
	     
	     2. 의도적으로 자료형을 다른 자료형으로 변환할때 사용됌 
	        사용방법
	        	 (자료형) 변수명 ; 지정된 자료형으로 변경됨
	        	
		 */
		//강제 형변환 확인 1 
		// -> 자료형 변환 + 데이터 손실 
		int num1 = 290 ;
		//int 4byte를 byte 1byte으로 변경 
		byte result1 = (byte)num1; // 강제 형변환을 원함 
		System.out.println("num1 : "+num1 );
		System.out.println("result1 : " + result1);

	}

}
