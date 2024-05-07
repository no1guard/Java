package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
    //Geeting :안녕하세요 인사를 출력하는 메서드

	public void practice1() {
		//사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자를 입력했다면
		//1이상의 숫자를 입력해주세요 출력하기 
		Scanner sc=new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num=sc.nextInt();
		//입력받은 숫자가 1 미만일 경우 출력해주기
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요 .");
			return;
		}
		//입력받은 숫자가 1 이상이면 1부터 입력받은 숫자까지 모두 출력해주기
		for(int i=1; i <=num; i++) {
			System.out.println(i+" ");
			//System.out.println(i+"<=" + num);
		}
		//마무리로 줄바꿈을 해주길 원한다면
		System.out.println();
	}
	
	public void practice2() {
		Scanner sc =new Scanner(System.in);
	
	int num1;
	while(true) {
		System.out.println("정수 a를 입력해주세요");
		num1=sc.nextInt();
		
		if(num1<0) {
			System.out.println("양수를 입력해주세요");
		}else {
			System.out.println("1부터 "+num1+"까지의 숫자들");
			int abc=1;
			while(abc<=num1) {
				System.out.println(abc);
				abc++;}
			break;
		}
	
		}
	
	}
	public void prac3() {
	
		Scanner sc =new Scanner(System.in);
		
		String op;
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.println("연산입력(+ - * / %) : ");
			
			op=sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				} System.out.println("정수 1: ");
				 int 정수1=sc.nextInt();
				 System.out.println("정수 2: ");
				 int 정수2=sc.nextInt();
				 
				 //정수1과 정수2의 계산에 대한 결과(result)
				 int 결과;
				 
				 if(op.equals("+")) {
					 결과=정수1+정수2;
				 }else if(op.equals("-")) {
					 결과=정수1-정수2;
				 }else if(op.equals("*")) {
					 결과=정수1*정수2;
				}else if(op.equals("/")) {
					if ( 정수2==0) {
						System.out.println("0으로 나눌수 없습니다.");
					}
					결과=정수1/정수2;
				}else {
					결과=정수1%정수2;
				}System.out.println("정수1의 값은"+정수1+"정수2의 값은"+정수2 +"선택한 연산 기호는"+op+"로"+"계산결과는");
				System.out.println(정수1+op+정수2+"는"+결과+"입니다.");
			
		}
	}
	public void practice4() {
		//1 미만의 숫자가 입력되면 1 이상의 숫자를 입력해주세요 출력되면서
		// 사용자가 값을 입력하도록 하기 
		//숫자를 입력받은 숫자부터 1까지 출력하기 
		Scanner sc=new Scanner(System.in);
		int num;
		
		do {
			System.out.println("숫자를 입력해주세요 : ");
			num=sc.nextInt();
			//1 미나의 숫자가 들어오면 !
			if(num < 1) { 
				System.out.println("1 이상의 숫자를 입력해주세요.");
			//조건에 관계엇이  do로인해 무조건 1회 실행되는 것이기 때문에  return이나 break를 
				//작성해주지 않아도 될 경우가 많습니다.
			}
			
		}while(num>1);
		//만약에 1보다 커서 밑으로 내려온다면 
		//num 부터 1까지 거꾸로 출력해주는 for문 작성해주기 
		for(int i = num; i>=1; i--) {
			System.out.println(i+"");
		}
		
	}
	public void practice5() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 하나 입력하세요 : ");
		int num=sc.nextInt();
		int result=0;
		for(int i=1; i<=num; i++) {
			result+=i; //result+= i는 result=result+i
			
			//더해지는 숫자 출력하기 
			if(i<num) {
				System.out.print(i+" + ");
			}else{System.out.print(i + " =");
				
			}
	 }
		System.out.println(result);		
	}
	public void practice7() { 
		/*
		 사용자로부터 두개의 값을 입력 받아 그 사이의 숫자 출력하기
		 만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요 출력하기
		 다시 사용자가 값을 입력해서 출력하기 
		 */
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 숫자를 입력해주세요 : ");
			int firstNum=sc.nextInt();
			
			System.out.println("두번째 숫자를 입력해주세요 :"); 
			int secondNum=sc.nextInt();

	
			
			if(firstNum >=1 && secondNum>=1) {
				int 최소값 = Math.min(firstNum, secondNum);
				int 최대값 = Math.max(firstNum, secondNum);
				//Math(수학 파일에서) 가장 작은ㅇ 값을 찾는 min을 활용해서
				//알아서 비교ㅗ하고 작은 값을 구하게 하기
				//( , ) 괄호 안에 숫자를 넣을 대 숫자 순서는 상관없음 
				//Math에 있는 random 보다 Random에 있는 랜덤 기능이 더 많지만 둘 다 사용하는데 큰 차이는 없음 
				for(int i=최소값; i<=최대값; i++) {
					System.out.print(i+" ");
				}break;
				
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요 ");
			}
			
		}
	}
	/**/
	public void practice13() { 
		//키보드로 숫자를 입력 받고 별찍기를 진행한다.
	 Scanner sc= new Scanner(System.in);
	 System.out.println("정수를 입력해주세요 : ");
	 int num=sc.nextInt();
	 
	 for(int 세로줄=1; 세로줄 <=num; 세로줄 ++) {
		 //한줄씩 별을 만들어주고 싶음 
		 //한줄-하나 두줄-둘 세줄-삼...num줄=num
		 for(int 별=1; 별<=세로줄; 별++) {
			 System.out.print("*");
		 }System.out.println();
	 }
	 
	}
	
	public void practice14() { 
		/* 정수 입력을 해서
		 첫번째 줄에서 가장 많은 별을 출력 / 마지막에서 가장 적은 별을 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num=sc.nextInt();//5
		//이중 포문 int line//3
		
		for(int line=num; line>=1; line-- ) {
			for(int star=1; line>=star; star++) {
				System.out.print("*");
			}  System.out.println();
		}
		
		
		
	}
	
	public void practice15() {
		/*
		 **** 
		  ***
		   **
		    *  
		*/
	Scanner sc = new Scanner(System.in);
	System.out.print("정수를 입력해주세요 : ");
	//키보드로 입력 받은 수를 size 안에 넣어줌
	int size=sc.nextInt();
	//line은 세로로 된 줄의 번호를 나타냄 
	
	for(int line=0; line<size; line++) {
		//blank 공백을 출력하기 위한 for문 
		// line번째 줄에서는 line 개의 공백을 출력하겠다
		for (int blank=0; blank<line; blank++) {
			System.out.print("  ");
		}
		//start 별을 출력하기 위한 for문 
		//line 번째 줄에서는 size - line 개의 별을 출력 
		// 첫 번째 줄 size
		// 두 번째 줄 size-line
		for(int star =size; star > line; star--) {
			System.out.print("* ");
			
		}
	 System.out.println();
	}
		
	}
	public void Geeting() {
		System.out.println("안녕하세요");
	}
	public void Geeting2() {
		System.out.println("반갑습니다.");
	}

}
