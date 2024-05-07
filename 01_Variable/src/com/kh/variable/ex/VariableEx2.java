package com.kh.variable.ex;

public class VariableEx2 {
  // 메인 메서드(프로그램 실행)
	public static void main(String[] args) {
		/*
  	 컴퓨터에서 계산을 할때 값 처리 원칙
  	 -같은 자료형끼리 연산 , 결과도 같은 자료형 ? 자료형 + 자료형
  	 
  	 만약에 
  	 다른 자료형끼리 연산하는 경우에는 자료형을 맞게변환한다
  	 
  	 자동 형변환 
  	 - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환 
		 */

		//자동 형변환 확인1
			int num1=9;
			 
			long num2=10_000_000_000L;
			//result=결과 
			long result = num1+num2;
			System.out.println("더한결과 " + result + "원");
			
			// 작은 값으로 큰 값을 형변환 하려고 할 경우 
			 
			// cannot convert from long to int 발생
			//강제로 형태를 변환해서 넣을수는 있지만 값이 깨질수도있고 잘못된 값이 들어감 
			//int + long
			// -> long + long으로 자동 형변환 
			// -> 결과도 long
			// 그런데 int형 변수 long을 대입하라고 해서 오류 발생 
			 
	}

}
