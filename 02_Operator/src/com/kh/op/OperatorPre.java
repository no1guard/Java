package com.kh.op;

import java.util.Scanner;

public class OperatorPre {

	public static void main(String[] args) {
		method1();
	}
	
	//�������� ����ϴ� �޼���� �ƴ�
	//���� �ʿ��� �� ������ ����ϴ� �޼��� 
	//�޼��� : Ư�� ���³� ����� �����س��� ����
	//static�� ���� ������ 
	//static�� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�
	//�ܵ����� ���������� �޸𸮿��� ����Ҽ������� ��Ÿ���� ǥ�� 
	
	public static void method1(){
		
	
	 //1.int num 1= 10���ְ� int num 2= 3�� �ְ� 
	 // ���ϱ� ���� ���ϱ� ������ ��� ��� 
		
	// Double�� Ȱ���ؼ� double num3= 2.5 double num4 = 3.5 
    // + - * / ��� ����
		
		int num1 =10;
		int num2= 3;
		double num3= 2.5;
		double num4= 3.5; 
		
		//���� ���ϱ�
		int sum=num1+num2;
		//���� ����
		int sum2=num1-num2;
		//���� ���ϱ�
		int sum3=num1*num2;
		//���� ������ 
		int sum4=num1/num2;
		
		//�Ǽ�����
		double semi1=num3+num4;
		//�Ǽ�����
		double semi2=num3-num4;
		//�Ǽ�����
		double semi3=num3*num4;
		//�Ǽ������� 
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
		System.out.println("�� ����� ���� �Ǽ� ����� ���͵帳�ϴ�.");
		System.out.println("a�� b�� ���� c�� d�� �Ҽ����� ������ �Ǽ��� �Է����ּ���");
		System.out.println("a�� ���� �Է����ּ���");
		int a =sc.nextInt();
		System.out.println("b�� ���� �Է����ּ���");
		int b= sc.nextInt();
		System.out.println("�Ǽ� c�� ���� �Է����ּ��� (�������ƴ� �Ҽ��� ���� �Ǽ�)");
		double c= sc.nextDouble();
		System.out.println("�Ǽ� d�� ���� �Է����ּ��� (�������ƴ� �Ҽ��� ���� �Ǽ�)");
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
