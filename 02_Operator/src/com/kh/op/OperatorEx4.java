package com.kh.op;

public class OperatorEx4 {
  
	public static void main(String[] args) {
		 /*
		  비교 연산자 
		  데이터가 같은지 다른지를 비교할 때 사용 
		  결과는 항상 true false로 나타남 
		  
		  사용 방법 
		  a == b 
		  
		  a와 b가 같으면 true
		  a와 b가 다르면 false
		  
		  a != b 
		  
		  a와 b가 다르면 true
		 
		  a와 b가 같으면 false
		  
		  *****
		  
		  !은 부정할때 사용하는 연산자
		  ==은 같을때 사용하는 연산자 
		  
		 */
		int a=3;
		int b=3;
		// System.out.println 으로 무언가를 출력할 때 
		// +는 " " 문자열이 있으면 각각의 값을 이어주는 역할을 함 
		// 문자열이 들어간 출력 프린트에서 연산(더하기 빼기 곱하기 나누기 true false)
		// 같은 작업을 진행하기 위해서는 우선순위 1번인 () 를 이용해서 
		// 연산 작업을 우선으로 진행하고 연산이 끝난 결과를 문자와 이어 붙입니다.
		
		System.out.println("a == b 일 때 :" + (a==b));
		System.out.println(a==b);
		
		int c= 20;
		int d= 10;
		
		System.out.println(c!=d);

		
		System.out.println("↓↓a==c↓↓");
		System.out.println(" "+ (a==c));
		// a==c는 값이 다르기 때문에 false가 나옵니다 
		
	}

}
