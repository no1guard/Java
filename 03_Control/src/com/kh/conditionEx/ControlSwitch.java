package com.kh.conditionEx;

public class ControlSwitch {
	/*
	 switch / case
	  if���� ��������� ������ �����ϰ� �ִ� ���� �Ǵܹ� 
	  
	  ��� ���
	  switch(�Էº���){
	  	case �Է°� :
	  		������ ���� 
	  		break; // case�� ���������� ���� ������ġ
	  		
	  	case �Է°� 2: 
	  		������ ���� 
	  		break; // ���� break ���ٸ� ���� case���� ���� ������ 
	  		..
	  		
	  		default: // �Էº����� ���ϴ� ���� ���� �� ����Ǵ� �ɼ� 
	  		// ���� �����̸� �ʿ信 ���� ������ �� ���� 
	  		// else �� ����� ������ ������ 
	  		 ������ ���� 
	  		 break;
	  }
	  
	  ����� 2 
	  case�� ��� �ٸ� ��ȣ�� ������ ����� ���� ���Ѵٸ�
	  case�� �̾ �ۼ��� �� ���� 
	  	case 1 : casd 2 : case 3: 
	  	 System.out.println(" ���̽� 1 2 3 �� ���� ��� : ") ;
	  	default : 
	  	 System.out.println("1 2 3 �̿��� ��� : " );
	  	 
	  break; ���ϴ� case�� ������ case�� �´� ������ ������ �� 
	  ���α׷��� �����ϱ� ���� �� ��� 
	  case�� ���õ� ����� �����ϱ����� break�� ȣ���ϸ� ������ �߻��� 
	  
	  break�� return
	  break�� ��� swith�� for�� while������ ���
	  �ش��ϴ� case �ܸ̿� ������
	   
	  return�� ��𼭵��� ��밡��
	  ���� ��ȯ�Ҽ��ְ� , �޼��峪 �Լ��� ������ �ߴ��ϰ� ȣ���� ������ ���� ����
	  �޼��峪 �Լ� ������ return ���� ����Ǹ� �� ���� �ڵ�  
	  
	 * */
	public static void main(String[] args) {
		 
		int day =3;
		String dayString;
		
		switch(day) {
			//���ǿ� �ش��ϴ� case�� �ۼ� 
		case 1 : 
			dayString="�Ͽ���";
			
		case 2: 
			dayString="������";
			
		case 3:
			dayString="ȭ����";
		
		case 4:
			dayString="������";
			break;
		default : 
			dayString="�߸��� �Է� �Դϴ�.";
		}
		
		System.out.println("�Է��� ���ڴ� "+dayString + "�Դϴ�.");

	}

}
