package study;

public class Oper5 {

	public static void main(String[] args) {
	 int a=0;
	 
	 a= a+1;
	 System.out.println("a = " + a);//1
	 
	 a= a+1;
	 System.out.println("a = "+ a );//2
	 
	 // �ǹ����� ���̽Ἥ ���� �����ڶ�°� ���� 
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 
	 --a; 
	 System.out.println("a=" + a);
	 // ++a << ���� �����ڸ� �ǿ����� �տ� �Ѽ��ִ� . �̰��� �տ� �ִٰ��ؼ� ����(Prefix)���� �����ڶ��Ѵ�.
	 //a++ : ���� �����ڸ� �ǿ����� �ڿ� �Ѽ��ִ� . �̰��� �ڿ��ִٰ��ؼ� ����(postfix)���� �����ڶ� �Ѵ�.
	 

	}

}
