package study;

public class Oper7 {

	public static void main(String[] args) {
		//�� ������
		// �� �����ڴ� boolean ���� true,false�� ���ϴµ� ����Ѵ�.
		// && (And,�׸���): �� �ǿ����ڰ� ��� ���̸� ���� ��ȯ , ���� �ϳ��� �����̸� ������ ��ȯ 
		//|| (�Ǵ� or ) : �� �ǿ����� �� �ϳ��� ���̸� ���� ��ȯ , �Ѵ� �����̸� ������ ��ȯ
		// ! (���� negative) : �ǿ������� ���� ������ ��ȯ , �� ,���̸� ������ , �����̸� ���� ��ȯ 
		
		System.out.println("&& : AND ����");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false&&false);
		
		System.out.println("|| : OR����");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false||false);
		
		System.out.println("! ����");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println( "���� Ȱ��");
		boolean a= true;
		boolean b= false;
		System.out.println(a && b);// false
		System.out.println(a||b);//���� �ϳ��� ���̸� �Ǵϱ� �̰Ŵ� True
		System.out.println(!a);//a�� true ������ ��ȯ ������������ false�� ���ð���
		System.out.println(!b);//b�� false �̰͵� �������� �ĸ¾Ƽ� True�� ���� 
	}

}
