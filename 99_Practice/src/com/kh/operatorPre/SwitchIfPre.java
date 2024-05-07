package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	public static void pra8() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호를 - 포함해서 입력해주세요 : ");
		String idNumber=sc.next();
		
		//990101-1234567
		//990101-2345678
		//주민번호 뒷자리의 첫 번째 숫자를 가지고 옵니다.
		//주민번호를 - 제외하고 주민번호 숫자만 입력한다면  6번째 자리에 있는 값을 가지고 와야함
		
		char genderCode =idNumber.charAt(7); // - 포함해서 7자리
		 
		//주민번호 뒷자리 첫번째 숫자로 성별을 판별 
		String gender;//나중에 여자인지 남자인지 확인해주는 결과 보여주기 
		//만약에 1이나 3이 들어온다면 남자 
		// ""String ''char char를 사용해서 숫자값을 가져오기 때문에 ''사용
		if(genderCode=='1'||genderCode=='3') {
			gender="남자";
		}else if(genderCode=='2'||genderCode=='4') {
			gender="여자";
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
			
			return;
		}System.out.println("입력한 주민번호는 "+ gender + " 입니다.");
		//1. gender= " 올바른 주민번호가 아닙니다." or return;사용가능 
		//2. else에서 돌려보내는 return
		
	}
	public static void castingPractice1() {
		Scanner sc=new Scanner(System.in);
		System.out.println( "문자를 입력하세요 : ");
		char inputChar=sc.next().charAt(0);
		
		//유니코드 출력
		int unicode = inputChar;
		
		 
		System.out.println("입력한 문자 "+inputChar+"의 유니코드는"+unicode+"입니다.");
		
	}
	public static void castingPractice3() {
		//주어진 코드에 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int iNum1 =10;
		int iNum2 = 4;
		float fNum =3.0f;
		double dNum= 2.5;
		int unicode;
		unicode=75;
		char ch='A';
		System.out.println(iNum1/iNum2); //결과는 정수끼리 나눈거라 답은 2
		System.out.println((int)dNum); 
		System.out.println((double)iNum2*dNum);
		System.out.println((int)fNum);
		System.out.println((int)(iNum1/fNum));// 3// 나누기를해서 몫이 3이나오게 
		// int와 float은 같은 크기의 byte정수인지 실수인지 표기
	
		//float은 소숫점 이하 6자리 까지만 보여줌 기본으로 
		System.out.println(iNum1/fNum );
		System.out.println((double)iNum1/fNum);
		System.out.println(ch);
		System.out.println((int)ch);//유니코드로 숫자변경 65나옴
		System.out.println(ch + iNum1); //75 >> 'A'값이 (int)ch를 통해 65 int가 4바이트 char이 1바이트라 먹힘 즉 정수로 변환되서 60 + 15
		System.out.println((char)(ch+iNum1));// 75의 유니코드 는 K
		System.out.println(unicode);
	}
	public static void cafe() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		//메뉴 번호 입력받기 
		System.out.println("메뉴 번호를 입력하세요");
		int num1=sc.nextInt();
		
		switch (num1) {
		case 1 : 
			System.out.println("입력메뉴 입니다.");
		break;
		case 2: 
			System.out.println("수정메뉴 입니다.");
		break;
		case 3: 
			System.out.println("조회메뉴 입니다.");
			break;
		case 4: 
			System.out.println("삭제메뉴 입니다.");
			break;
		case 7: 
			System.out.println("종료메뉴 입니다.");
			break;
		default : 
			System.out.println("잘못 입력했습니다");
		
		
		
		}
	}
	public static void controlParctice10() { 
		Scanner sc =new Scanner(System.in);
		
		System.out.println("1. 메뉴출력 ");
		System.out.println("2.짝수/ 홀수 ");
		System.out.println("3.합격/ 불합격 ");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print(" 실행할 기능을 선택하세요 : ");
		int num1= sc.nextInt();
		
		String num2;
		switch (num1) {
		
		case 1 : 
			num2="1. 메뉴출력을 선택했습니다. ";
		break;
		case 2: 
			num2="2. 짝수/ 홀수를 선택했습니다";
			break;
		case 3: 
			num2="3.합격/ 불합격을 선택했습니다" ;
			break;
		case 4: 
			num2="4. 계절을 선택했습니다";
			break;
		case 5: 
			num2="5.로그인을 선택했습니다";
			break;
		case 6 : 
			num2="6. 권한 확인을 선택했습니다";
			break;
		case 7: 
			num2="7. BMI를 선택했습니다";
			break;
		case 8: 
			num2="8. 계산기를 선택했습니다";
			break;
		case 9: 
			num2="9. P/F 선택했습니다";
			break;
		default : 
		  System.out.println("잘못입력했습니다.");
		   return;
		}System.out.println("입력하신 숫자는"+num1+"이며"+"출력 결과는"+num2+"입니다.");
	}
	public static void id() {
	Scanner sc= new Scanner(System.in);
	String id = "asd24679";
	String pw = "1111";
	
	System.out.print("아이디 : ");
	String id1 = sc.nextLine();
	System.out.print("비밀번호 :");
	String pw1 = sc.nextLine();
	
	//! 특정 조건을 부정하는데 사용
	//id.equals(id1):id와 id1이 일치하는지 확인 일치하면 참
	//!id.equals(id1) : id와 id1이 일치하지않으면 참 
	
	
	
	}
	public static void ex1() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("관리자, 회원, 비회원");
        System.out.print("권한을 확인하고자 하는 회원 등급을 입력해주세요 : ");

        String input = scanner.next().toLowerCase(); // 입력을 소문자로 변환

        switch (input) {
            case "관리자":
                System.out.println("관리자는 회원관리 \n"
                		+ " 게시글 관리 \n"
                		+ " 게시글 작성 \n"
                		+ " 게시글 조회 \n"
                		+ " 댓글 작성이 가능합니다.");
                break;
            case "회원":
                System.out.println("회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능합니다.");
                break;
            case "비회원":
                System.out.println("비회원은 게시글 조회만 가능합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
		
		}
	
	}
	public static void ex2() {
		/*
		 * 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 * 연산결과 출력
		 * (두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우 
		 * "잘못 입력했습니다. 로 출력하게하기 ) 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 b를 입력해주세요 : ");
		int num2 = sc.nextInt();
		System.out.println("원하시는 연산 기호를 입력해주세요 (ex : + ,-,*,%)");
		String sum1=sc.next();
		
		int result;
		if (num1>=0&&num2>=0) {
		
		
		switch(sum1) {
		
		case "+" :
			result=num1+num2;
			break;
		case "-" : 
			result=num1-num2;
			break;
		case "*" : 
			result=num1*num2;
			break;
		 
		case "%" :
			result=num1%num2;
		default : 
			System.out.println("연산기호를 잘못 입력하였습니다. ");
			return;
		
		
		}System.out.println("입력하신 정수 a는"+num1+"입력하신 정수 b는"+num2+"희망하시는 연산기호는\n"
				+sum1+"로 확인되어 결과는 "+result+"입니다.");
		}else {
			System.out.println("양수를 입력해주세요");
		}
		
		
		
	}
	public static void main(String[] args) {
		
		ex2();

	}

}
