package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
    //���� �޼��� ȣ�� 
	public static void main(String[] args) {
	 /*
	  �Է¹��� ������ 3�� ������� Ȯ���ϴ� �۾� 
	  */
	 //int a= 10;
	// int b= a++;
	// System.out.println(a+","+b);
	// ���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� �غ���
	
		//int a,b;
		//a=1;
		//b=3;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("�ȳ��ϼ��� ���� ���� ������ ���ϱ⸦ �ص帳�ϴ�.");
		System.out.println("a���� �Է����ּ���");
		int a= sc.nextInt();
		System.out.println("b�� ���� �Է����ּ���");
		int b= sc.nextInt();
		
		
		//����
		int sum=a+b;
		System.out.println("Sum = "+sum );
		//����
		int dif= a-b;
		System.out.println("dif = " + dif);
		//����
		int mul= a*b;
		System.out.println("mul = " + mul);
		//������
		int div= b/a;
		System.out.println("������ ��� = "+ div);
	}

}
