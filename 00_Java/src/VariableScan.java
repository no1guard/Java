import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		// ����ڿ��� �Է¹��� ������ ���� 
		// Scanner�� �̿��ؼ� �Է¹��� ������ ��ǻ�Ϳ� ǥ������
		//System.in ����ؼ� Ű���� �Է��� �о�� �� ��� 
		//Scanner �ڷ��� �ڸ��� int�� string�̳� �Ǽ� boolean���� 
		//Ȯ����� ��Ÿ�� �� ���� ������ �ʱ⿡�� Scanner��� ��� 
		
		//nextLine(): ���� �Ǵ� ���͸�  ġ�� �������� ���� ��ü�� �Է� �޴´�
		//�Էµ� ���ڸ� ��� �� �����´�.(���� , Ư������ �� ��� ������)
		
		
		
		//Scanner a = new Scanner(System.in); // �̰� ��ĳ������ a��� �̸��� �ο��Ѱ��� 
		Scanner a= new Scanner(System.in);
		String str=a.next();
		System.out.println(str);
		System.out.println("������� �̸��� �Է��ϼ���.");
		String name = a.nextLine();//�̰� Sccaner��� �������� nextLine �̶��� ���ǰ� 
		System.out.println(name);
		
		System.out.println("������� ��� ���� �Է��ϼ���.");
		String leave = a.nextLine();
		System.out.println(leave);
		
		System.out.println("������� �ڵ��� ��ȣ�� �Է��ϼ���.");
		String phoneNumber = a.nextLine();
		System.out.println(phoneNumber);
		
		System.out.println("������ ��⸦ �ۼ��Ͻÿ�");
		String kaki=a.nextLine();
		System.out.println(kaki);
	
		//Scanner String�� ����ؼ�
		// ������� Ű , ������� ���� ,������� �г����� �Է¹ޱ� 
		
		//String height , String age , String nickName
		
		 
		System.out.print("������� Ű�� �����ּ��� : ");
		String height=a.nextLine();
		System.out.println(height);
		
		System.out.print("������� ���̸� �����ּ��� : ");
		String age=a.nextLine();
		System.out.println(age);
		
		System.out.print("������� �г����� �Է��ϼ��� : ");
		String nickName=a.nextLine();
		System.out.println(nickName);
		
		System.out.println("�ٽ��ѹ� ������� Ű�� �����ּ���");
		String height2 =a.next();
		System.out.println(height2);
	}

}
