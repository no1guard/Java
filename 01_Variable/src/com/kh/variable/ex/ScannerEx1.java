package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
	 /*
	  Scanner Ŭ���� 
	  ����ڷκ��� Ű���� �Է��� �ޱ� ���� 
	  Java���� �����ϴ� Ŭ���� 
	  
	  �⺻���� �����Ǿ��ִ� ���� �ƴ� 
	  import Java.util ��Ű�� ǥ�ø� ���� �� ����� �� ���� 
	  import ��Ȯ�� ǥ�� ��: import java.util.Scanner;
	  ���⼭ import�� �����Ѵٴ� �ǹ� (�����´ٶ���ǹ� )
	  
	  Scanner.next() : ������� �ܾ� (String) 1�� �Է� ���� Ex cat is�� ġ�� cat�� ��� ������ cat������ �����̽��� ������ �Ķ� ������� 
	  
	  Scanner.nextLine(): ���������ؼ� ���ڿ�(String) 1�� �Է� ���� * ���ᵵ�� �ٸ� ����ġ�鳡 
	  
	  Scanner.nexInt() : int�� ���� 1�� �Է�  : ���ӻ��� ȸ�������Ҷ� �޴�����ȣ�� �����Էµ ��밡���ҵ�
	  Scanner.nextLong() : long �� ���� 1�� �Է� : ���°����ֳ��̰�
	  Scanner.nextDuble(): �Ǽ� 1�� �Է� : ���ӻ� ���� �����غ��� �����Ե� ������ �Ҽ��� �ڸ��� �ʿ��ϴϱ� ������ �� �����Ű��� 
	  
	  �̿ܿ� Scanner Ŭ���� �ȿ��� �������� ����� ������ 
	  �׸��� ��ĳ�ʴ� �ҷ��� ���� close�� ����ؼ� ������ �ݾ��ִ� ǥ�ø� ���ִ°� ���� (�ʼ��¾ƴ�) 
	  */
		
	// Scanner ��� �ϱ�
	
		
		// 1. Ŭ���� ���� import ������ ���ܾ��� 
		 
		// 2. Scanner ��ü ���
		
		System.out.println(10111);
		
		Scanner sc= new Scanner(System.in);
			
		// 3. System.in Ű����� �Է��ϴ� ���� ���� �� �ֵ��� �� 
		System.out.print("�����Է� 1 : ");
		int num1=sc.nextInt(); // ������ �Էµ� ������ ������ num1�� �����ض� 
		
		System.out.print("���� �Է� 2 : ");
		int num2=sc.nextInt(); // ������ �Էµ� ������ ������ num2�� ���� 
		
		
		//�Ǽ� �Է� nextDouble�� ����ؼ� num3 ���� �Ǽ� �Է� �����
		//�ܾ� �Է� 2���ϱ� next  ����ؼ� ������ word1 word2 
		
		
		System.out.print("�Ǽ� �Է� : ");
		Double num3= sc.nextDouble();
		
		System.out.print("�ܾ� �Է� 1 : ");
		String word1 = sc.next();
		// Scanner�� �̿��ؼ� �Է��� ������ ���
		// System.out.print�� �̿��ؼ� ����� ���� �Էµƴ��� 
		// ������ ������ Ȯ�� ����� ���ִ� ������ �ִ� ���� ����
		System.out.print("�ܾ� �Է� 2: ");
		String word2 =sc.next();
		
		//************************************* << ���⼭���� ���� �޶����ٴ� ǥ�� 
		//- next() / nextInt()/ nextDouble()���� �ۼ��� ���� 
		//nextLine()�� �ۼ��ؾߵǴ� ��Ȳ�� ���� 
		//nextLine()�� �̸� �ѹ� �ۼ��ϰ� ����ϱ� ? ? 
		
	//next() �ڿ� �����ִ� ���۰��� Line�ȿ� �־��ذ� (�������� ���� �Ѱ��� �갡 ��� �޾��ذ� �׷��� �ؿ� �����Է��� �������̵ɰ��� ) 
		//�׷��� ���۰��� �츮�� ������ ���ų� ������ �ؾ��� ������ ���� ������ 
		//�տ� �ڷ����̳� �������� ����ؼ� ���۸� �־� �����ؾ��� ���������� ���������� �����Ͷ� 
		//sc.nextLine();���� ���ذ�
		
		// �� sc.nextLine();�� ȣ���ؼ� �����ִ� ���͸� �����Ѱ��� 
		sc.nextLine(); 
		
		System.out.print("���� �Է� : ");
		String str= sc.nextLine();
		
		 
		
		// 4. System.out �̿��ؼ� Ű���忡 �ۼ��� ���� ����ϱ�
		System.out.println("���� 1�� �� : " + num1);
		System.out.println("���� 2�� �� : " + num2);
		System.out.println("�Ǽ� �� : " + num3);
		System.out.println("�ܾ��: " + word1 +","+word2);
		System.out.println("�߰��� ���� : " + str);
		
		 
		 //5. System close ����ؼ� �ݾ��ֱ� 
		 
		sc.close();
		// Scanner ����� �� �ߴٸ� ������ �������� �ʱ� ���ؼ� 
		//Scanner�� �����ϴ� close �� ����ؼ� �ݾ��ֱ� 
		 
		 
		 

	}

}
