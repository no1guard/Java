package com.kh.array;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class ArrayEx2 {
	public static void practice3() {
		//양의 정수를 입력 
		Scanner sc= new Scanner(System.in);
		System.out.print("양의 정수 :");
		int size =sc.nextInt();
		
		//입력 받은 정수 크기의 배열 생성 
		int[] numbers= new int[size];
		
		for(int i=0; i<size; i++) {
			//numers.length=size
			numbers[i]=i+1;
			System.out.println(numbers[i]+" ");
		}
	}
	
	public static void practice6() {
		//요일 생성 
		
		//index는 0부터 마지막숫자 -1까지 들어감 0 1 2 3 4
		//length 5 1부터 길이를 보여줌 
					//	0	1	2	3	4	5	6
		String[] week= {"월","화","수","목","금","토","일"};
		Scanner sc =new Scanner(System.in);
		//0부터 6까지의 숫자 입력
		System.out.print("0부터 6까지의 숫자 입력받기: ");
		int num=sc.nextInt();
		//입력한 숫자가 0~6 사이에 있는지 확인 후 사이에 있다면 요일 출력 
		if(num>=0&&num<=6) {
			System.out.println(week[num]+"요일");
		}else {
			System.out.println("잘못입력하였습니다.");
		}
	}
	public static void practice7() {
		//길이가 7인 배열을 생성
		int[] num=new int[7];//index [0 1 2 3 4 5 6] length:7
					// num의 최종 길이를 알기 위해서 num.length를 사용합니다.
		//랜덤으로 숫자 랜덤으로 숫자 출력하기 
		// 랜덤으로 숫자를 출력하는 방법 
		// 1.Random 객체 사용 
		// 2. Math 객체에서 random() 메서드를 사용 : 위 Random 객체보다 작은 범위로 사용 가능 
		
		for (int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()* 45 +1);//45 0~44 ->1~45
			System.out.println("num["+i+"]= "+num[i]);
			
		}
	}
	public static void method1() {
		//정수 0 1 2 10 20 30 출력하기
		int num[]=new int[6];
		num[0]=0;
		num[1]=1;
		num[2]=2;
		num[3]=10;
		num[4]=20;
		num[5]=30;
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]+" ");
		}
		System.out.println("============");
		//-------------------------------
		
		//문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력 
		String[] str= {"월","화","수","목","금","토","일",};
		for(int k = 0; k<str.length; k++) {
			System.out.println("str["+k+"]"+str[k]);}
	
		//실수 index 2까지 만들어주고 출력 실수는 자유 
		System.out.println("=============");
		double dl[]= new double[3];
		for(int z=0; z<dl.length; z++) {
			dl[z]=(double)(Math.random()*99+1);
			System.out.println("dl["+z+"]"+dl[z]);
		}
		
		//문자 'A','B','C' 넣어준 다음 각 자리 출력해보기
		char chr[]=new char[3];
		chr[0]='A';
		chr[1]='B';
		chr[2]='C';
		
		for(int n=0; n<chr.length; n++) {
			System.out.println(chr[n]);
		}
				
	}
		

	
public static void main(String[] args) {
	method1();
		}
		
	}

 