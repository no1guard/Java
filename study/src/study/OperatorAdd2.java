package study;

public class OperatorAdd2 {

	public static void main(String[] args) {

		// ++a << ���� �����ڸ� �ǿ����� �տ� �Ѽ��ִ� . �̰��� �տ� �ִٰ��ؼ� ����(Prefix)���� �����ڶ��Ѵ�.
		 //a++ : ���� �����ڸ� �ǿ����� �ڿ� �Ѽ��ִ� . �̰��� �ڿ��ִٰ��ؼ� ����(postfix)���� �����ڶ� �Ѵ�.

		// ���� ���� ������ �̿� 
		int a= 1;
		int b= 0;
		b=++a; //a�� ���� ���� ������Ű�� �� ����� b�� ���� 
		
		System.out.println("a = "+ a +  " ,b= "+ b);// a= 2 , b=2 
		
		//���� �����ڸ� ���� �� �ʱ�ȭ 
		
		a=1; // a�� ���� �ٽ� 1�� ����
		b=0; // b�� ���� �ٽ� 0���� ���� 
		
		b=a++;
		
		System.out.println("a = "+ a +  " ,b= "+ b);	

	}

}
