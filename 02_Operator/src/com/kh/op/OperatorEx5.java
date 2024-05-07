package com.kh.op;

import java.util.Scanner;

public class OperatorEx5 {
public static void op1() {
	 /*
	  비교 연산자
	  == : 서로 같으면 true
	    예를 들어 
	    		5 == 5 true
	    		3 == 5 false
	    		5 == 3 false
	  != : 서로 다르면 true
	  	예를 들어 
	  			5!=5 false
	  			3!=5 true
	  			5!=3 true
	  	
	  논리연산자 && and ||or
	  
	  && : 왼쪽 오른쪽 두 개의 조건이 모두 참일 때만 전체 표현이 참 
	   예를 들어 
	     (5 ==5 ) &&(3==3) : true
	     (5!=3) && ( 3==3) : true
	     (5==5) && (5 ==3) : false
	     (3==5) &&(5==5) : false
	     
	  ||< 버티컬 바 ( OR)  : 왼쪽 오른쪽 둘 중 하나라도 참이면 참 
	   	예를 들어서 
	   	 		(5 == 5) || (5==5) true
	   	 		(5 == 5) || (5 ==3 ) true
	   	 		(5 == 3 ) || (3 ==3) true
	   	 		(5 ==3 ) || ( 3==5) false
	   	 		
	   비교 연산자 >, < , >= , <=
	   왼쪽 > 오른쪽 : 오른쪽의 값보다 왼쪽이 크면 true (왼쪽이랑 오른쪽이 초과나 미만일때 사용하는 표현)
	   왼쪽 >= 오른쪽 : 오른쪽의 값이 왼쪽이 크거나 같으면 true
	   			    왼쪽이랑 오른쪽이  이상 이하 처럼 같을 때도 사용하는 표현 
	   왼쪽 < 오른쪽 : 오른쪽의 값이 왼쪽보다 크면 true
	   				왼쪽이랑 오른쪽이 초과나 미만일 때 사용하는 표현 
	   				
	   왼쪽 <=오른쪽 : 오른쪽의 값이 왼쪽보다 크거나 같으면 true
	   				왼쪽이랑 오른쪽이 이상 이하처럼 같을때도 사용하는 표현 
	  */
	int num1 = 10;
	int num2 = 20;
	
	//num1 num2 값이1.  같은지 2. 다른지 3. 어떤 값이 더 큰지

	boolean result1 = num1 == num2;
	boolean result2 =num1 !=num2;// num1과 num2가 다르면 참이다
	boolean result3 = num1 < num2; //num2가 num1 보다 크다면 참 
	System.out.println("result1 : " + result1 );
	System.out.println("result2 : "+ result2);
	System.out.println("result3 : " + result3);
	
}
public static void op2() {
	Scanner sc=new Scanner(System.in);
	System.out.print("num1을 입력해주세요 : ");
	int num1= sc.nextInt();
	System.out.print("num2을 입력해주세요 : ");
	int num2= sc.nextInt();
	System.out.print("num3을 입력해주세요 : ");
	int num3= sc.nextInt();
	
	 boolean result =(num1==num2)&&(num2==num3);
	 boolean result2 =(num1==num2)||(num2==num3);
	System.out.println("num1은"+num1+"이며" + "num2는"+num2+"입니다");
	System.out.println("num3은"+num3+"확인됐습니다.");
	
	System.out.println("비교식은 (num1==num2)&&(num2==num3)으로 진행되어 따라서 결과는" + result+"입니다.");
	System.out.println("두번째 비교식은 (num1==num2)||(num2==num3)으로 진행되어 따라서 결과는" + result2+"입니다.");
	// && if while 조건을 체크할 때 
	// 두 개의 조건이 모두 만족하는 경우 사용 
	//  & 비트 단위 연산 특정 비트 패턴을 판단할 때 사용 
	//
}
public static void main(String[] args) {
		 op2();
	}
      
}
