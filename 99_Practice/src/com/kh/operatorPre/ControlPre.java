package com.kh.operatorPre;

import java.util.Scanner;

/* 잘라내기(ctrl + x)  복사(ctrl + c) 붙여넣기(ctrl + v) */
public class ControlPre {
	//실습문제 1번 홀수 짝수 나타내기
	public static void practice1() {
		// 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt(); //키보드로 숫자 입력받기
		
		if(number > 0) { // 입력받은 숫자가 양수일 경우에만 홀짝 실행하기	
			if (number % 2 == 0) { //숫자가 짝수일 경우 출력하기
				System.out.println("짝수입니다.");
			} else {               //숫자가 홀수일 경우 출력하기
				System.out.println("홀수입니다.");
			}
		} else { 		// 입력받은 숫자가 음수일 경우 출력하기
			System.out.println("음수입니다. 양수만 입력해주세요.");
		}
		
		
		
		
		
		
	}
	public static void pra2() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print ("국어점수 :  "  );
	
		int korean=sc.nextInt();
		
		System.out.print ("영어점수 : ");
		int english =sc.nextInt();
		
		System.out.print ("수학점수 : ");
		int math=sc.nextInt();
		
		int sum = korean+english+math;
		double sum21=sum/3;
		
		if( korean>=40&&english>=40&&math>=40&&sum21>=60) {
			System.out.println("국어점수 : " + korean);
			System.out.println("영어점수 : " + english);
			System.out.println("수학점수 : " + math);
			System.out.println("평균점수 : " + sum21);
			System.out.println("축하합니다 합격입니다.");
		}else {
			System.out.println("국어점수 : " + korean);
			System.out.println("영어점수 : " + english);
			System.out.println("수학점수 : " + math);
			System.out.println("불합격입니다. ");
		}
		
	}
	public static void pra3() {
		
		Scanner sc =new Scanner(System.in);
		System.out.print ("키를 입력하세요 : (cm가 아닌 m로 입력해주세요) ");
		double tall = sc.nextDouble();
		System.out.print ("몸무게를 입력하세요 : ");
		double weigh=sc.nextDouble();
	 
		double bmi= weigh/(tall*tall);
		//20
		System.out.println("bmi는 "+ bmi + "입니다.");
		if (bmi < 18.5){
			System.out.println("저체중입니다.");
			}else if(  bmi <23){
				System.out.println("정상체중입니다.");}
			else if( bmi<25) {
				System.out.println("과체중입니다.");}
			else { System.out.println("고도비만입니다");}
  
		
	}
	public static void par4() {
		//중간 기말 과제 출석 입력받기 
		Scanner sc = new Scanner(System.in);
		System.out.print ("중간 점수 : ");
		double mid= sc.nextDouble();
		System.out.print ("기말 점수 : ");
		double fin=sc.nextDouble();
		System.out.print ("과제 점수 : ");
		double assig =sc.nextDouble();
		System.out.print ("출석 횟수 : ");
		int attend = sc.nextInt();
		
		//출석 비율 계산 
		double attendPer =   attend/20*100; // 

		//평가 비율에 따른 총점 계산
		// 중간 20 기말 30 과제 30 출석 20 = 100점
		
		//중간 점수 20
		double midscore=mid *0.2;
		//기말 점수 30
		double fiScore= fin*0.3;//100점 만점 30%
		//과제 점수 30
		double asScore =assig * 0.3;
		//출석 점수 20
		double attendScore=attendPer*0.2;
		double totalScore=midscore+fiScore+asScore+ attendScore;
		
		//평가에 따른 Pass 또는 Fail 출력
		if(totalScore>=70 && attendPer>=70 ) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		System.out.println(" 결과");
		System.out.println(" 중간 (20점만점 )"+midscore);
	}
	public static void main(String[] args) {
		par4();

	}
 
}