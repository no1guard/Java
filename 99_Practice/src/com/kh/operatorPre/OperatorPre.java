package com.kh.operatorPre;

import java.util.Scanner;

// ��Ű�� : ���� ���� Ŭ������ ����ִ� ���� ��ġ 
public class OperatorPre {
	public static void pre1() {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("�ο����� �Է��ϼ��� : ");
		 int people = sc.nextInt();
		 System.out.print("������ ������ �Է��ϼ��� : ");
		 int candy = sc.nextInt();
		 System.out.println("���� �ο���"+people + "���� ������"+" ������"+candy+"���� �ֽ��ϴ�.");
		 int candy1 =candy/people ;
		int candy2 =candy%people;
		System.out.println("1�δ� �����ϰ� �������� ������ "+ candy1 + "���̸�" + " ���� ������ ������ "+ candy2 +"�� �Դϴ�.");
		 
		
	}
    public static void pre2() {
      //Ű����� ���� �Է¹ޱ�+�� �� Ȯ�� 
    	//Scanner Ȱ���ؼ� Ű���� �Է¹޴� â ������ֱ� ;
    	Scanner sc=new Scanner(System.in);
    	//�̸� �Է¹ޱ� 
    	System.out.print("�̸� : ");
    	String name = sc.nextLine();
    	//�г� �Է� �ޱ�
    	System.out.print("�г�(���ڸ�) : ");
    	int grade = sc.nextInt();
    	//�� �Է� �ޱ�
    	System.out.print("��(���ڸ�)");
    	int classNum=sc.nextInt();
    	//��ȣ �Է¹ޱ� 
    	System.out.print("��ȣ(���ڸ�) : ");
    	int num=sc.nextInt();
    	// ���� �Է� �ޱ� String -> char�� �޴� ����� ���� 
    	// ��ĳ�ʷ� char ���� �Է¹ް��� �� ��쿡�� 
    	// charAt�� ����ؼ� ���ڿ� ��ġ�� �о���� �۾��� �����ؾ��մϴ�.
    	// charAt ��ĳ�� - next - charAt
    	
    	// charAt �޼���� ���ڿ����� Ư�� ��ġ�� ���ڸ� �����Ѵ�.Hello Java ���ڿ����� J�� ������° �ε����� ��ġ�� �����̴�. �ε��� 6���� ���� J�� ���Ϲ������� ������ ���� charAt�� ����Ѵ�.
    	
    	// Ex  : Table = 5���� 
    	// charAT(0) : �Ǿձ��ڸ� �������� 
    	
    	System.out.print("����(M/F) : ");
    	
    	char gender = sc.next().charAt(0);
    	//� ���ڰ� ������ ������� �� �տ��ִ� ���ڸ� �ʿ��ϱ� ������0���� �ۼ��Ѱ�
    	//���� �Է� �ޱ� ( �Ҽ��� ��° �ڸ� ������ �Է¹��� )
     
    	
    	System.out.println(" ���� : ");
    	double score =sc.nextDouble();//��ü�ڸ� �Է¹���
    	//������ ���� ��� ���ڿ� ���� 
    	//���� ������ ��� ���ڿ� ���� 
    	System.out.println("�̸� : " + name );
    	System.out.println("�г� : " + grade);
    	System.out.println( "�� : "+ classNum);
    	System.out.println("��ȣ : " + num);
    	System.out.println("���� : "+ gender);
    	//System.out.println("���� :  "+score);
    	System.out.printf("���� : %.2f" , score);
		 // printf�� %f �� ����� ���� �Ҽ��� �ڸ��� �������൵ �ǰ�
    	//���������� �ʾƵ� �ȴ� . 
    	//�ٸ� ���࿡ �Ҽ��� �ڸ� ��ġ�� �����ؼ� ����ϱ� ���Ѵٸ� 
    	//%  . ����� ���ϴ� �Ҽ��� ��ġ�ڸ� ���� �����ϰ� f�� ������� 
    	//ex "���� : %.3f , score�� �����ϸ� �Ҽ��� 3�ڸ����� ����̉� ���� ���ڰ� 1�̶�� ���ڸ��������� ����̉� 
    	/*
    	 
    	 System.out.print("�ٹٲ� ���� ���η� ���")
    	           .println("�� ����� ������ �����ٿ��� �ۼ��ϱ� ���� " )
    	           .printf("������ ������ ���ڿ��� ����� �� ���") ��ǥ������ %d�� %f�� %s %c %b %x %o
    	           %d : 10�������� 
    	           %f : �Ҽ��� ���� ����ϴ� ģ�� 
    	           %s : ���ڿ� ��� 
    	           %c : ���� �ϳ� ��� 
    	           %b : true���� false���� ���
    	           %x : 16���� ����
    	           %o : 8���� ���� 
    	 
    	 
    	 */
    }
	public static void pre3() {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kuk = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng= sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math =sc.nextInt();
		
		int sum = kuk+eng+math;
		double sum1= (double) sum/3;
		System.out.println("�������� : "+kuk +"��");
		System.out.println("�������� : " +eng+"��");
		System.out.println("�������� : " + math+"��");
		System.out.println("�������� ���� �հ�� "+sum+"�̸�");
		System.out.println("�� ������ ��� ������ "+sum1 + "�Դϴ�.");
	}
    public static void pre4() {
    	//2���� ���� Ű����� �Է� ���� ���� ��� ������ 
    	//true �ƴϸ� false ��� 
    	Scanner sc=new Scanner(System.in);
    	//ù��° �� �Է¹ޱ� 
    	System.out.print("ù��° ���� �Է��ϼ��� : ");
    	int num1 = sc.nextInt();
    	System.out.print("�ι�° ���� �Է��ϼ��� : ");
    	int num2 = sc.nextInt();
    	/*
    	 ==true == ���ʿ� �ִ� ���� ������ true
    	 3==5 �� false��� ǥ�� 
    	 5==5 �� true��� ǥ�� 
    	 
    	 * */
    	boolean a = num1==num2;
    	System.out.println("a�� b��" + a +"�Դϴ�.");
    	
    	
    	
    }
	public static void pre4_1() {
		//2���� ���� Ű���� �Է� �޾� �Է� ���� ���� ��� �ٸ��� 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("a�� ���� �Է����ּ��� : ");
		int num1 =sc.nextInt();
		System.out.print("b�� ���� �Է����ּ��� : ");
		int num2 = sc.nextInt();
		
		boolean sum1 = (num1!=num2);
		
		System.out.println("a�� b�� ����� " + sum1+ "�Դϴ�");
	}
    public static void pre5() {
    	//practice5
    	//3���� ���� Ű����� �Է� �޾�
    	//�Է� ���� ���� ��� ������ true,�ƴϸ� false�� ��� 
    	 Scanner sc= new Scanner(System.in);
    	 System.out.print("num1�� ���� �Է����ּ��� : ");
    	 int num1 =sc.nextInt();
    	 System.out.print ("num2�� ���� �Է����ּ��� : ");
    	 int num2 =sc.nextInt();
    	 System.out.print("num3�� ���� �Է����ּ��� : ");
    	 int num3=sc.nextInt();
    	 
    	 //                                �� true ��
    	 //               num1�̶� num2�� ������ && num2�� num3�� ������ 
    	 boolean result =(num1!=num2) && (num2==num3);
    	 
    	 //  || vertical bar or 
    	 // ����1 or ����2
    	 // (true) or (false)= true
    	 // (false) or (true) = true
    	 // (true) or (true)= true
    	 // (false) or (false)= false
    	 boolean isOR = (num1==num2) || (num2 ==num3);
    	 
    	 System.out.println("num1: " + num1 + ", num2 : "+ num2 + ", num3 : "+ num3);
    	 System.out.println("result�� ����? : "+result);
    	 System.out.println("isor:" + isOR);
    	 
    	 //&& ampersand and 
    	 //   ����1 && ����2 = true
    	 // (true) && (true) = true
   
    	 
    	 
    }
	public static void main(String[] args) {
		 pre5();

	}

}