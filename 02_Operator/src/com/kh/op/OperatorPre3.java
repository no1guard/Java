package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
    public static void pre1() {
    	 Scanner sc= new Scanner(System.in);
    	 
    	 System.out.println("num1�� �Է����ּ���");
    	 int num1 = sc.nextInt();
    	 System.out.println("num2�� �Է����ּ���");
    	 int num2 =sc.nextInt();
    	 
    	 boolean result1 = num1>num2;
    	 boolean result2= num1<num2;
    	 
    	 System.out.println("num1��" + num1 + "num:2"+num2 + "�Դϴ�.");
    	 
    	 System.out.println("num1>num2 ��"+result1 + "�̸�");
    	 System.out.println("num1<num2 ��"+ result2 + "�Դϴ�.");
    	
    }
	public static void pre2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("num1�� ��");
	}
    public static void main(String[] args) {
	 pre1();
	}

}
