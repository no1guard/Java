package com.kh.op;

public class OperatorEx4 {
  
	public static void main(String[] args) {
		 /*
		  �� ������ 
		  �����Ͱ� ������ �ٸ����� ���� �� ��� 
		  ����� �׻� true false�� ��Ÿ�� 
		  
		  ��� ��� 
		  a == b 
		  
		  a�� b�� ������ true
		  a�� b�� �ٸ��� false
		  
		  a != b 
		  
		  a�� b�� �ٸ��� true
		 
		  a�� b�� ������ false
		  
		  *****
		  
		  !�� �����Ҷ� ����ϴ� ������
		  ==�� ������ ����ϴ� ������ 
		  
		 */
		int a=3;
		int b=3;
		// System.out.println ���� ���𰡸� ����� �� 
		// +�� " " ���ڿ��� ������ ������ ���� �̾��ִ� ������ �� 
		// ���ڿ��� �� ��� ����Ʈ���� ����(���ϱ� ���� ���ϱ� ������ true false)
		// ���� �۾��� �����ϱ� ���ؼ��� �켱���� 1���� () �� �̿��ؼ� 
		// ���� �۾��� �켱���� �����ϰ� ������ ���� ����� ���ڿ� �̾� ���Դϴ�.
		
		System.out.println("a == b �� �� :" + (a==b));
		System.out.println(a==b);
		
		int c= 20;
		int d= 10;
		
		System.out.println(c!=d);

		
		System.out.println("���a==c���");
		System.out.println(" "+ (a==c));
		// a==c�� ���� �ٸ��� ������ false�� ���ɴϴ� 
		
	}

}
