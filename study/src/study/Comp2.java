package study;

public class Comp2 {

	public static void main(String[] args) {
		
		// ������ �� �����ϳ� ���ڿ��� �� �����ϴ� ���ڿ��� ������ ���Ҷ����� ==�� �ƴ϶� .equals() �޼��带 ����ؾ��Ѵ�. 
	  String str1 = "���ڿ�1";
	  String str2 = "���ڿ�2";
	  
	  boolean result1 = "hello".equals("hello");// ���ͷ� �� 
	  boolean result2 = str1.equals("���ڿ�1");//���ڿ������� ���ͷ� ���� ��
	  boolean result3 = str1.equals(str2);//���ڿ� ������ ���ڿ� �������� �� 
	  
	  System.out.println(result1);
	  System.out.println(result2);
	  System.out.println(result3);
	}

}
