package com.kh.op;

public class OperatorEx3 {
 

	public static void main(String[] args) {
		/*
		 증감 연산자 : ++ , --
		 ++는 1을 더한다는 의미 
		 --는 1을 뺀다는 의미 
		 
		 전위 연산자 : 먼저 더하기 빼기를 한 다음에 다른 계산을 실행할 것 
		 후위 연산자 : 다른 계산 먼저 한 다음에 더하기 빼기를 진행할 것
		*/
		
		int a= 10;
		//(a+1=a)
		int b= ++a;
		System.out.println("a : "+a + ", b :" + b);
		
		int c=10;
		//우선 d에다가 c의 값을 넣어줍니다 , d=c d는 10이됌
		// 그 후에 d=c+1 10=(10+1) 여기서 =는 equlas이 아님  즉
		//d는 이미 대입이 된거라 10이고 c는 후에 1이 더해진거라 11 
		
		int d=c++;
		System.out.println("c : "+ c+ " , d : "+d);
	}

}
