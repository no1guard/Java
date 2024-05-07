package com.kh.conditionEx;

import java.util.Scanner;

public class ConditonPre {
	
	/* public static void method1(){
  if문 활용하여 	숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 같타면 같습니다. 출력하고
	 같지않다면 같지않습니다 출력하기 
	 *  
	 */
	/* public static void method2(){
	if 문자 값 2개를 받아서 숫자 두개가 일치하는지 확인
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 같타면 같습니다. 출력하고
	 같지않다면 같지않습니다 출력하기 
	 *  
	 */
	/* public static void method3(){
	if 문자 값 2개를 받아서 숫자 두개가 일치하는지 확인
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 같타면 같습니다. 출력하고
	 같지않다면 같지않습니다 출력하기 
	 *  
	 */
	public static void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("정수 a를 입력해주세요 : ");
		int num1= sc.nextInt();
		
		System.out.print ("정수 b를 입력해주세요 : ");
		int num2= sc.nextInt();
		
		if (num1==num2) {
			System.out.println("정수 a와 정수 b는 같습니다.");
		}else {
			System.out.println("정수 a와 b는 다릅니다.");
		}
	}
	public static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("문자 a를 입력해주세요 : ");
		String str1=sc.nextLine();
		
		System.out.print ("문자 b를 입력해주세요 : ");
		String str2=sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("문자 a와 문자 b는 같습니다.");
			
		}else {
			System.out.println("문자 a와 문자 b는 다릅니다.");
		}
		
	}
	public static void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("실수 a를 입력해주세요 : ");
		double num1=sc.nextDouble();
		
		System.out.print ("실수 b를 입력해주세요 : ");
		double num2=sc.nextDouble();
		
		if (num1==num2) {
			System.out.println("실수 a와 문자 b는 같습니다.");
			
		}else {
			System.out.println("실수 a와 문자 b는 다릅니다.");
		}
		
	}
	//최종으로 실행할 메인 메서드
	public static void main(String[]args) {
		method1();
		method2();
		method3();
	}
	
}
