package com.kh.operatorPre;

import java.util.Scanner;

/* �߶󳻱�(ctrl + x)  ����(ctrl + c) �ٿ��ֱ�(ctrl + v) */
public class ControlPre {
	//�ǽ����� 1�� Ȧ�� ¦�� ��Ÿ����
	public static void practice1() {
		// Ű����� �Է¹��� ������ ����̸鼭 ¦���� ���� ¦���Դϴ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt(); //Ű����� ���� �Է¹ޱ�
		
		if(number > 0) { // �Է¹��� ���ڰ� ����� ��쿡�� Ȧ¦ �����ϱ�	
			if (number % 2 == 0) { //���ڰ� ¦���� ��� ����ϱ�
				System.out.println("¦���Դϴ�.");
			} else {               //���ڰ� Ȧ���� ��� ����ϱ�
				System.out.println("Ȧ���Դϴ�.");
			}
		} else { 		// �Է¹��� ���ڰ� ������ ��� ����ϱ�
			System.out.println("�����Դϴ�. ����� �Է����ּ���.");
		}
		
		
		
		
		
		
	}
	public static void pra2() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print ("�������� :  "  );
	
		int korean=sc.nextInt();
		
		System.out.print ("�������� : ");
		int english =sc.nextInt();
		
		System.out.print ("�������� : ");
		int math=sc.nextInt();
		
		int sum = korean+english+math;
		double sum21=sum/3;
		
		if( korean>=40&&english>=40&&math>=40&&sum21>=60) {
			System.out.println("�������� : " + korean);
			System.out.println("�������� : " + english);
			System.out.println("�������� : " + math);
			System.out.println("������� : " + sum21);
			System.out.println("�����մϴ� �հ��Դϴ�.");
		}else {
			System.out.println("�������� : " + korean);
			System.out.println("�������� : " + english);
			System.out.println("�������� : " + math);
			System.out.println("���հ��Դϴ�. ");
		}
		
	}
	public static void pra3() {
		
		Scanner sc =new Scanner(System.in);
		System.out.print ("Ű�� �Է��ϼ��� : (cm�� �ƴ� m�� �Է����ּ���) ");
		double tall = sc.nextDouble();
		System.out.print ("�����Ը� �Է��ϼ��� : ");
		double weigh=sc.nextDouble();
	 
		double bmi= weigh/(tall*tall);
		//20
		System.out.println("bmi�� "+ bmi + "�Դϴ�.");
		if (bmi < 18.5){
			System.out.println("��ü���Դϴ�.");
			}else if(  bmi <23){
				System.out.println("����ü���Դϴ�.");}
			else if( bmi<25) {
				System.out.println("��ü���Դϴ�.");}
			else { System.out.println("�����Դϴ�");}
  
		
	}
	public static void par4() {
		//�߰� �⸻ ���� �⼮ �Է¹ޱ� 
		Scanner sc = new Scanner(System.in);
		System.out.print ("�߰� ���� : ");
		double mid= sc.nextDouble();
		System.out.print ("�⸻ ���� : ");
		double fin=sc.nextDouble();
		System.out.print ("���� ���� : ");
		double assig =sc.nextDouble();
		System.out.print ("�⼮ Ƚ�� : ");
		int attend = sc.nextInt();
		
		//�⼮ ���� ��� 
		double attendPer =   attend/20*100; // 

		//�� ������ ���� ���� ���
		// �߰� 20 �⸻ 30 ���� 30 �⼮ 20 = 100��
		
		//�߰� ���� 20
		double midscore=mid *0.2;
		//�⸻ ���� 30
		double fiScore= fin*0.3;//100�� ���� 30%
		//���� ���� 30
		double asScore =assig * 0.3;
		//�⼮ ���� 20
		double attendScore=attendPer*0.2;
		double totalScore=midscore+fiScore+asScore+ attendScore;
		
		//�򰡿� ���� Pass �Ǵ� Fail ���
		if(totalScore>=70 && attendPer>=70 ) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		System.out.println(" ���");
		System.out.println(" �߰� (20������ )"+midscore);
	}
	public static void main(String[] args) {
		par4();

	}
 
}