package study;

public class Oper6 {

	public static void main(String[] args) {
	int a=2;
	int b=3;
	
	System.out.println(a == b);// a�� b�� �޶� false
	System.out.println(a != b);
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);// >= �̻�
	System.out.println(a<=b);// <= ����
 
    //����� boolean ������ �������ִ� 
	boolean result= a==b;
	System.out.println(result);

	 // ������ �� �����ϳ� ���ڿ��� �� �����ϴ� ���ڿ��� ������ ���Ҷ����� ==�� �ƴ϶� .equals() �޼��带 ����ؾ��Ѵ�. 

	}

}
