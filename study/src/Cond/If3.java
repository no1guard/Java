package Cond;

public class If3 {

	public static void main(String[] args) {
		/*7�� �����ϰ�� : ������ 
		  8�� �̻� 13�� ������ ��� : �ʵ��л� 
		  14�� �̻� 16�� ������ ��� : ���л� 
		  17�� �̻� 19�� ������ ��� : ����л� 
		  20�� �̻��� ��� ����
		
		 */
		int age=14;
		
		if (age<=7) {
			System.out.println("�������Դϴ�.");
		}if(age>=8 && age<=13) {
			System.out.println("�ʵ��л��Դϴ�.");
		}if(age>=14 && age<=16) {
			System.out.println("���л��Դϴ�.");
		}if(age>=17 && age<=19) {
			System.out.println("����л��Դϴ�.");
		}if (age>20) {
			System.out.println("�����Դϴ�.");
		} // �� �ڵ尡 ���۰� �ƴ����� ������ ���� 
		// ���ʿ��� ������ ��� ������ 
		
		//else if >> �ռ� if���� ������ �����϶� ���� ������ �˻��Ѵ�. ���� �ռ� if ���� ���̶�� else if�� ���������ʴ´� 

	}

}
