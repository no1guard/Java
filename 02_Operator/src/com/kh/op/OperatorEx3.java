package com.kh.op;

public class OperatorEx3 {
 

	public static void main(String[] args) {
		/*
		 ���� ������ : ++ , --
		 ++�� 1�� ���Ѵٴ� �ǹ� 
		 --�� 1�� ���ٴ� �ǹ� 
		 
		 ���� ������ : ���� ���ϱ� ���⸦ �� ������ �ٸ� ����� ������ �� 
		 ���� ������ : �ٸ� ��� ���� �� ������ ���ϱ� ���⸦ ������ ��
		*/
		
		int a= 10;
		//(a+1=a)
		int b= ++a;
		System.out.println("a : "+a + ", b :" + b);
		
		int c=10;
		//�켱 d���ٰ� c�� ���� �־��ݴϴ� , d=c d�� 10�̉�
		// �� �Ŀ� d=c+1 10=(10+1) ���⼭ =�� equlas�� �ƴ�  ��
		//d�� �̹� ������ �ȰŶ� 10�̰� c�� �Ŀ� 1�� �������Ŷ� 11 
		
		int d=c++;
		System.out.println("c : "+ c+ " , d : "+d);
	}

}
