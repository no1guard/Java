
public class Variable {

	public static void main(String[] args) {
		
		// 1.���� 2. ���� 3.���ڿ� 4.�Ǽ� 5.������(��,����)
		// 1. ������ byte short int long�� ����
		// byte=1byte (8��Ʈ), ���� �������� 
		byte ����Ʈ = 1;
		System.out.println(����Ʈ);
		System.out.println("����Ʈ");
		// ������ �����Ҷ� Ű���忡�� ctrl + s�� �����ָ� �����
		byte bt=2; // byte�� short�� ��ǻ�;ȿ� �׸���ũ�� 
		System.out.println(bt);
		
		short ��Ʈ=3; 
		System.out.println(��Ʈ);
		
		int ��Ʈ =1;// byte<short<int<long
		System.out.println(��Ʈ);
		System.out.println("�ѤѤѤѤ�");
	
		byte bte=2;
		short shrt=2;
		int nt=2;
		long lng=2;
		System.out.println(bte);
		System.out.println(shrt);
		System.out.println(nt);
		System.out.println(lng);
		
		//2.����
		// ���ڿ��� Char�� String�� ���� 
		// ���ڸ� ��Ÿ���� char�� '' ���� ����ǥ�� ����ؼ� ǥ�� 
		// "" ū ����ǥ�� String ���ڿ��� ��Ÿ���� ǥ�� 
	
		char myChar='A';
		System.out.println(myChar);
	
		 
		char myChar2='a';
		System.out.println(myChar2);
		//char ���� �ϳ��� ���ڸ� ���� �� �ֱ� ������ 
		//A�� B���� �ϳ��� �ۼ����� 
		char myChar3='A'; // Invalid character constant << �߸��� ���� ���
		
		//String
		String str1="�� ���� ���ڴ�~~";
		System.out.println(str1);
		// String�� ����ؼ� �̸� ����ϱ�
		// String name = " �����̸� " ;
		// System.out.println (name);
		
		String name= "�ǻ���";
		System.out.print("����� �̸���");
		System.out.println(name);
		System.out.println("�Դϴ�.");
		//���࿡ ���� ���ڳ� ������ ���ٷ� ����ϰ� �ʹٸ� 
		// + �� ����ؼ� �̾ ����� �� ���� 
		System.out.println("����� �̸��� "+name + " �Դϴ�. "); //16
		System.out.println("����� �̸���"+name + "�Դϴ�. ");
		System.out.println("�� �� �� �� �� �� " + name + " �� �� �� . ");
		// ���⸦ �ְ� ���� ��� " " ���ڿ� ���ο� ���⸦ ������ ���డ�� 
		
		// ����+���� +���ڿ� ����ϱ� 
		/*�ȳ��ϼ���. ���¿� . ���￡ ��� �ǻ��� �Դϴ�.
		 * �� ��ȭ��ȣ�� 000-0000-0000 �Դϴ�.
		 * �� �ֹι�ȣ�� ����Դϴ�.
		 * �� �������� A���Դϴ�.
		 * */
		
		String geeting="�ȳ��ϼ���.";
		String introduction = " ���¿�. ���￡ ��� OOO�Դϴ�.";
		int number1=111;
		int number2=2222;
		int number3=3333;
		String number4 = "111-2222-3333";
		char dash = '-';
		String secret ="���";
		String bloodType="A��";
		
		System.out.print(geeting);
		System.out.println(introduction);
		System.out.print("�� ��ȭ��ȣ�� ");
		System.out.print(number4);
		System.out.println("�Դϴ�.");
		System.out.println("�� �ֹι�ȣ�� "+secret+"�Դϴ�.");
		System.out.println("�� �������� "+bloodType+"�Դϴ�.");
		
		//4. �Ǽ� 5. ������ 
		// �Ǽ��� float �� double �� �ֽ��ϴ�. 
		// �Ǽ��� �⺻���� double �������� �Ǿ�����
		// float = 4byte double = 8byte
		// float�� �Ǽ��� ��� ���ؼ��� f�� �ٿ���� �� 
		// �Ǽ� �ڿ� f�� ���� �� ��ҹ��� ���� ���� ��밡��!!
		//�ڹٿ��� �Ǽ����� �⺻���� double�̹Ƿ� ���� ������ ������ float ������ ���� ������ ������
		//3.14Fó�� ���� ���̻�� F �ڸ� �� �ٿ� �־�� �Ѵ�. 
		//float �ڷ����� ���� ������ �� ���̻縦 �����ϸ� ������ ������ �߻��Ѵ�. �빮�� F ��� �ҹ��� f�� ����ص� �ȴ�.
		float ff = 3.14F;
		float ff2= 3.14F;
		System.out.println("ff1��"+ff+"�̴�");
		System.out.println("ff2�� "+ff2+"�̴�");
		
		double dd1 = 3.14; // ���ʿ� double ��ü�� ����Ŀ�� �ʿ���� F������ float���� �ξ�ŭ 
		//double�� ũ�Ⱑ float���� ũ�� ���ʿ� double�� �������� �߱⶧���� �ڿ� ������ �������ʾƵ� ����Ҽ�����
		
		System.out.println("double dd1 : " + dd1 );
		
		//5. ������ 
		// boolean�� ����ؼ� true���� false���� ǥ���� �� ���� 
		// ���߿� �˰������̳� if for while ���� ����� �� ���� ��� 
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println("���� ������"+isTrue);
		System.out.println("���� ������"+isFalse+ " ? ");
		
		
		//���� ���� ���ڿ� �Ǽ� ������ ( int char String double boolean)
		int num= 10;
		System.out.println("���� num�� �� : "+num);
		
		char ch = 'Z';
		System.out.println("���� ch�� �� : "+ ch);
		
		String text = "Hello, World";
		System.out.println("���ڿ��� text = "+ text);
		
		double dbl=3.14;
		System.out.println(dbl);
		
		boolean is=true;
		System.out.println("isTrue="+ is);
		
		num =20;
		//�������� ó�� 1ȸ�� ����� �� 
		// �������� �ٸ� ���ڳ� ���� ���� �� 
		// �������� ���� �ѹ� �� �Ƚᵵ�� ���� ���ʿ� �������� �׷��� �����ؾ���
		
		System.out.println("num = "+ num);
		//num���ٰ� 10��ſ� 20�� �ְ��ʹٸ�? 
		
		int ����=10;
		
		System.out.println("���ڴ� "+����+"�Դϴ�.");
		
		����=20;
		System.out.println("���ڴ� "+����+"�Դϴ�.");
		/*
		 * ö���� 19���̾���
		 * �׷��� 24���� �Ǹ鼭 20���� �Ǿ���.
		 */
		String name1 = "ö��";
		String age = "19";
		System.out.println(name1+"��"+age+"�� �̾���.");
		age= "20";//�̷��� age�������� �ѹ� �� ��Ȱ���ϼ� ���°� ���� age1�������� �Һ��� �Ȱ��� �������� ���°� �޸𸮻����ε� �̵��� 
		System.out.println("�׷��� 24���� �Ǹ鼭"+age+"���� �Ǿ���.");
		
		 
	}

}