package com.kh.variable.ex;

public class VariableEx3 {
 // ���θ޼��� (���α׷� �����ϴ� ����) 
	public static void main(String[] args) {
		 /*
		 ���� ����ȯ
	     1. ���� ������ ū �ڷ��� - > ���� �ڷ������� ���� ��ȯ ( ex : int�� long�� ���Ҷ� ���� int���� long���� ���� ����ȯ) 
	     - > ������ ������ �ս� �����ؾ���
	     
	     2. �ǵ������� �ڷ����� �ٸ� �ڷ������� ��ȯ�Ҷ� ���� 
	        �����
	        	 (�ڷ���) ������ ; ������ �ڷ������� �����
	        	
		 */
		//���� ����ȯ Ȯ�� 1 
		// -> �ڷ��� ��ȯ + ������ �ս� 
		int num1 = 290 ;
		//int 4byte�� byte 1byte���� ���� 
		byte result1 = (byte)num1; // ���� ����ȯ�� ���� 
		System.out.println("num1 : "+num1 );
		System.out.println("result1 : " + result1);

	}

}