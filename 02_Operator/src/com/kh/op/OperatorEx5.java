package com.kh.op;

import java.util.Scanner;

public class OperatorEx5 {
public static void op1() {
	 /*
	  �� ������
	  == : ���� ������ true
	    ���� ��� 
	    		5 == 5 true
	    		3 == 5 false
	    		5 == 3 false
	  != : ���� �ٸ��� true
	  	���� ��� 
	  			5!=5 false
	  			3!=5 true
	  			5!=3 true
	  	
	  �������� && and ||or
	  
	  && : ���� ������ �� ���� ������ ��� ���� ���� ��ü ǥ���� �� 
	   ���� ��� 
	     (5 ==5 ) &&(3==3) : true
	     (5!=3) && ( 3==3) : true
	     (5==5) && (5 ==3) : false
	     (3==5) &&(5==5) : false
	     
	  ||< ��Ƽ�� �� ( OR)  : ���� ������ �� �� �ϳ��� ���̸� �� 
	   	���� �� 
	   	 		(5 == 5) || (5==5) true
	   	 		(5 == 5) || (5 ==3 ) true
	   	 		(5 == 3 ) || (3 ==3) true
	   	 		(5 ==3 ) || ( 3==5) false
	   	 		
	   �� ������ >, < , >= , <=
	   ���� > ������ : �������� ������ ������ ũ�� true (�����̶� �������� �ʰ��� �̸��϶� ����ϴ� ǥ��)
	   ���� >= ������ : �������� ���� ������ ũ�ų� ������ true
	   			    �����̶� ��������  �̻� ���� ó�� ���� ���� ����ϴ� ǥ�� 
	   ���� < ������ : �������� ���� ���ʺ��� ũ�� true
	   				�����̶� �������� �ʰ��� �̸��� �� ����ϴ� ǥ�� 
	   				
	   ���� <=������ : �������� ���� ���ʺ��� ũ�ų� ������ true
	   				�����̶� �������� �̻� ����ó�� �������� ����ϴ� ǥ�� 
	  */
	int num1 = 10;
	int num2 = 20;
	
	//num1 num2 ����1.  ������ 2. �ٸ��� 3. � ���� �� ū��

	boolean result1 = num1 == num2;
	boolean result2 =num1 !=num2;// num1�� num2�� �ٸ��� ���̴�
	boolean result3 = num1 < num2; //num2�� num1 ���� ũ�ٸ� �� 
	System.out.println("result1 : " + result1 );
	System.out.println("result2 : "+ result2);
	System.out.println("result3 : " + result3);
	
}
public static void op2() {
	Scanner sc=new Scanner(System.in);
	System.out.print("num1�� �Է����ּ��� : ");
	int num1= sc.nextInt();
	System.out.print("num2�� �Է����ּ��� : ");
	int num2= sc.nextInt();
	System.out.print("num3�� �Է����ּ��� : ");
	int num3= sc.nextInt();
	
	 boolean result =(num1==num2)&&(num2==num3);
	 boolean result2 =(num1==num2)||(num2==num3);
	System.out.println("num1��"+num1+"�̸�" + "num2��"+num2+"�Դϴ�");
	System.out.println("num3��"+num3+"Ȯ�εƽ��ϴ�.");
	
	System.out.println("�񱳽��� (num1==num2)&&(num2==num3)���� ����Ǿ� ���� �����" + result+"�Դϴ�.");
	System.out.println("�ι�° �񱳽��� (num1==num2)||(num2==num3)���� ����Ǿ� ���� �����" + result2+"�Դϴ�.");
	// && if while ������ üũ�� �� 
	// �� ���� ������ ��� �����ϴ� ��� ��� 
	//  & ��Ʈ ���� ���� Ư�� ��Ʈ ������ �Ǵ��� �� ��� 
	//
}
public static void main(String[] args) {
		 op2();
	}
      
}
