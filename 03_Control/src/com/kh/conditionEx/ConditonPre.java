package com.kh.conditionEx;

import java.util.Scanner;

public class ConditonPre {
	
	/* public static void method1(){
  if�� Ȱ���Ͽ� 	���� �� 2���� �޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 ��Ÿ�� �����ϴ�. ����ϰ�
	 �����ʴٸ� �����ʽ��ϴ� ����ϱ� 
	 *  
	 */
	/* public static void method2(){
	if ���� �� 2���� �޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 ��Ÿ�� �����ϴ�. ����ϰ�
	 �����ʴٸ� �����ʽ��ϴ� ����ϱ� 
	 *  
	 */
	/* public static void method3(){
	if ���� �� 2���� �޾Ƽ� ���� �ΰ��� ��ġ�ϴ��� Ȯ��
	 Scanner sc=new Scanner(System.in);
	 int num1= sc.nextInt();
	 int num2= sc.nextInt();
	 ��Ÿ�� �����ϴ�. ����ϰ�
	 �����ʴٸ� �����ʽ��ϴ� ����ϱ� 
	 *  
	 */
	public static void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("���� a�� �Է����ּ��� : ");
		int num1= sc.nextInt();
		
		System.out.print ("���� b�� �Է����ּ��� : ");
		int num2= sc.nextInt();
		
		if (num1==num2) {
			System.out.println("���� a�� ���� b�� �����ϴ�.");
		}else {
			System.out.println("���� a�� b�� �ٸ��ϴ�.");
		}
	}
	public static void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("���� a�� �Է����ּ��� : ");
		String str1=sc.nextLine();
		
		System.out.print ("���� b�� �Է����ּ��� : ");
		String str2=sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("���� a�� ���� b�� �����ϴ�.");
			
		}else {
			System.out.println("���� a�� ���� b�� �ٸ��ϴ�.");
		}
		
	}
	public static void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print ("�Ǽ� a�� �Է����ּ��� : ");
		double num1=sc.nextDouble();
		
		System.out.print ("�Ǽ� b�� �Է����ּ��� : ");
		double num2=sc.nextDouble();
		
		if (num1==num2) {
			System.out.println("�Ǽ� a�� ���� b�� �����ϴ�.");
			
		}else {
			System.out.println("�Ǽ� a�� ���� b�� �ٸ��ϴ�.");
		}
		
	}
	//�������� ������ ���� �޼���
	public static void main(String[]args) {
		method1();
		method2();
		method3();
	}
	
}
