package com.kh.op;

public class OperatorEx6 {
	 /*
	 ���������� 
	 += ���� ������ �����ϰ� ����� ������ ���� �־��ִ� ������ �� 
	 -= ���� ������ �����ϰ� ����� ������ ������ �־��ִ� ������ ��
	  * */
	public static void main(String[] args) {
		int num1= 10;
		int num2 =5;
		//+= �����ڸ� Ȱ���� ����
		
		System.out.println(" =====[+=]=====");
		System.out.println("num1 = "+ num1 + ", num2 = "+ num2);
		
		num1+=3;
		System.out.println("num1 +=3 �� ���� num1 �� �� : "+num1);
		 
		num2 +=num1; //num2=num2+num1 (5)+(13)
		System.out.println("num1 :"+num1 +"�� num2�� ��"+num2);
		 
		System.out.println(" =====[-=]=====");
		int num4=10;
		int num5= 5;
		
		num4-=num5;//num4=num4(10)-num5(5) =�� num4�� 5
		num5-=num4;// num5=num5(5)-num4(5) = �� num 5�� 0
		System.out.println("num4�� �� :" + num4);
		System.out.println("num5�� �� : " + num5);
	}

}
