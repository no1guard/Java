package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
    public static void pre1() {
    	 Scanner sc= new Scanner(System.in);
    	 
    	 System.out.println("num1을 입력해주세요");
    	 int num1 = sc.nextInt();
    	 System.out.println("num2를 입력해주세요");
    	 int num2 =sc.nextInt();
    	 
    	 boolean result1 = num1>num2;
    	 boolean result2= num1<num2;
    	 
    	 System.out.println("num1은" + num1 + "num:2"+num2 + "입니다.");
    	 
    	 System.out.println("num1>num2 는"+result1 + "이며");
    	 System.out.println("num1<num2 는"+ result2 + "입니다.");
    	
    }
	public static void pre2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("num1의 값");
	}
    public static void main(String[] args) {
	 pre1();
	}

}
