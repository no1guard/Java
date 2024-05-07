package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
    //메인 메서드 호출 
	public static void main(String[] args) {
	 /*
	  입력받은 정수가 3의 배수인지 확인하는 작업 
	  */
	 //int a= 10;
	// int b= a++;
	// System.out.println(a+","+b);
	// 내가 스캐너로 입력받은 값이 출력되게 해보자
	
		//int a,b;
		//a=1;
		//b=3;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("안녕하세요 덧셈 뺄셈 나눗셈 곱하기를 해드립니다.");
		System.out.println("a값을 입력해주세요");
		int a= sc.nextInt();
		System.out.println("b의 값을 입력해주세요");
		int b= sc.nextInt();
		
		
		//덧셈
		int sum=a+b;
		System.out.println("Sum = "+sum );
		//뺄셈
		int dif= a-b;
		System.out.println("dif = " + dif);
		//곱셈
		int mul= a*b;
		System.out.println("mul = " + mul);
		//나눗셈
		int div= b/a;
		System.out.println("나눗셈 결과 = "+ div);
	}

}
