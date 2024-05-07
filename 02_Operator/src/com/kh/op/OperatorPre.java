package com.kh.op;

import java.util.Scanner;

public class OperatorPre {

	public static void main(String[] args) {
		method1();
	}
	
	//최종으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내서 사용하는 메서드 
	//메서드 : 특정 상태나 기능을 정리해놓은 집합
	//static의 뜻은 고정된 
	//static이 붙는 것은 자료형이나 변수에 담아서 쓰는게 아니라
	//단독으로 고정적으로 메모리에서 사용할수있음을 나타내는 표현 
	
	public static void method1(){
		
	
	 //1.int num 1= 10을넣고 int num 2= 3을 넣고 
	 // 더하기 빼기 곱하기 나누기 결과 출력 
		
	// Double을 활용해서 double num3= 2.5 double num4 = 3.5 
    // + - * / 출력 ㄱㄱ
		
		int num1 =10;
		int num2= 3;
		double num3= 2.5;
		double num4= 3.5; 
		
		//정수 더하기
		int sum=num1+num2;
		//정수 빼기
		int sum2=num1-num2;
		//정수 곱하기
		int sum3=num1*num2;
		//정수 나누기 
		int sum4=num1/num2;
		
		//실수덧셈
		double semi1=num3+num4;
		//실수뺄셈
		double semi2=num3-num4;
		//실수곱셈
		double semi3=num3*num4;
		//실수나누기 
		double semi4=num3/num4;
		
		System.out.println("num1= 10 , num2=3 , num3= 2.5 , num4= 3.5 ");
		System.out.println("num1+num2 = " + sum );
		System.out.println("num1-num2 = " + sum2);
		System.out.println("num1*num2 = " + sum3);
		System.out.println("num1/num2 = " + sum4);

		System.out.println("num3+num4 = " + semi1);
		System.out.println("num3-num4 = " + semi2 );
		System.out.println("num3*num4 = " + semi3);
		System.out.println("num3/num4 = " + semi4);
		
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("이 계산기는 정수 실수 계산을 도와드립니다.");
		System.out.println("a와 b는 정수 c와 d는 소숫점을 포함한 실수를 입력해주세요");
		System.out.println("a의 값을 입력해주세요");
		int a =sc.nextInt();
		System.out.println("b의 값을 입력해주세요");
		int b= sc.nextInt();
		System.out.println("실수 c의 값을 입력해주세요 (정수가아닌 소숫점 포함 실수)");
		double c= sc.nextDouble();
		System.out.println("실수 d의 값을 입력해주세요 (정수가아닌 소숫점 포함 실수)");
		double d= sc.nextDouble();
		
		int sum=a+b;
		System.out.println("a+b = "+sum );
		int sum2=a-b;
		System.out.println("a-b = "+sum2);
		int sum3=a*b;
		System.out.println("a*b = " + sum3);
		int sum4=a/b;
		System.out.println("a/b = " + sum4);
		
		double semi=c+d;
		System.out.println("c+d = "+semi);
		double semi2=c-d;
		System.out.println("c-d = "+semi2);
		double semi3=c*d;
		System.out.println("c*d = "+semi3);
		double semi4=c/d;
		System.out.println("c/d = "+semi4);
		*/
		
		
	}

}
