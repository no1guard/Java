package study;

public class Oper2 {

	public static void main(String[] args) {
		 
		//���ڿ��� ���ڿ� ���ϱ�1
		String sum1 = "hello"+" world";
		
		System.out.println(sum1);
		
		//���ڿ��� ���ڿ� ���ϱ� 2
		String s1= "string1";
		String s2= "string2";
		String result2=s1 +s2;
		System.out.println(result2);
		
		//���ڿ��� ���� ���ϱ�1
		String result3="a+b = "+ 10;
		System.out.println(result3);
		
		//�L�ڿ��� ���� ���ϱ�2
		int num= 20;
		String str = "a+b = ";
		String result4=str+num;// ���ڿͼ��ڴ� �⺻������ �������������� �׷��� ����+���ڷ��ϸ� �ڹٿ����� ���� + ���ڷ� �ν��ؼ� ���ھƹ��� 
		System.out.println(result4); // a+b= 20
	}

}
