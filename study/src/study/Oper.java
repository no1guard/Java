package study;

public class Oper {
       
	public static void main(String[]args) {
		//���� �ʱ�ȭ 
		int a= 5;
		int b =2;
		
		//���� 
		int sum =a+b;
		System.out.println("a+b =" + sum);
		
		//���� 
		int diff=a-b;
		System.out.println("a-b = " +diff);
		
		//����
		int multi= a*b;
		System.out.println("a * b =" + multi);
		
		//������ 
		int div =a/b;
		System.out.println("a / b =  "+ div);
		
		//������ 
		
		int mod = a%b; //���� 2 �������� 1 
		System.out.println("a % b = "+mod);
		
		int z= 10/0;
	}

}
