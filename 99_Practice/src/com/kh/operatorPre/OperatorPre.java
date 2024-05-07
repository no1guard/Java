package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치 
public class OperatorPre {
	public static void pre1() {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("인원수를 입력하세요 : ");
		 int people = sc.nextInt();
		 System.out.print("사탕의 갯수를 입력하세요 : ");
		 int candy = sc.nextInt();
		 System.out.println("현재 인원은"+people + "명이 있으며"+" 사탕은"+candy+"개가 있습니다.");
		 int candy1 =candy/people ;
		int candy2 =candy%people;
		System.out.println("1인당 동일하게 나눠가질 갯수는 "+ candy1 + "개이며" + " 남은 사탕의 갯수는 "+ candy2 +"개 입니다.");
		 
		
	}
    public static void pre2() {
      //키보드로 정보 입력받기+남 여 확인 
    	//Scanner 활용해서 키보드 입력받는 창 만들어주기 ;
    	Scanner sc=new Scanner(System.in);
    	//이름 입력받기 
    	System.out.print("이름 : ");
    	String name = sc.nextLine();
    	//학년 입력 받기
    	System.out.print("학년(숫자만) : ");
    	int grade = sc.nextInt();
    	//반 입력 받기
    	System.out.print("반(숫자만)");
    	int classNum=sc.nextInt();
    	//번호 입력받기 
    	System.out.print("번호(숫자만) : ");
    	int num=sc.nextInt();
    	// 성별 입력 받기 String -> char로 받는 방법이 있음 
    	// 스캐너로 char 값을 입력받고자 할 경우에는 
    	// charAt을 사용해서 문자열 위치를 읽어오는 작업을 진행해야합니다.
    	// charAt 스캐너 - next - charAt
    	
    	// charAt 메서드는 문자열에서 특정 위치의 문자를 리턴한다.Hello Java 문자열에서 J는 여섯번째 인덱스에 위치한 문자이다. 인덱스 6으로 문자 J를 리턴받으려면 다음과 같이 charAt을 사용한다.
    	
    	// Ex  : Table = 5글자 
    	// charAT(0) : 맨앞글자를 볼수있음 
    	
    	System.out.print("성별(M/F) : ");
    	
    	char gender = sc.next().charAt(0);
    	//어떤 글자가 들어오든 관계없이 맨 앞에있는 글자만 필요하기 때문에0으로 작성한것
    	//성적 입력 받기 ( 소수점 둘째 자리 까지만 입력받음 )
     
    	
    	System.out.println(" 점수 : ");
    	double score =sc.nextDouble();//전체자리 입력받음
    	//성별에 따라 출력 문자열 설정 
    	//삼항 연산자 출력 문자열 설정 
    	System.out.println("이름 : " + name );
    	System.out.println("학년 : " + grade);
    	System.out.println( "반 : "+ classNum);
    	System.out.println("번호 : " + num);
    	System.out.println("성별 : "+ gender);
    	//System.out.println("성적 :  "+score);
    	System.out.printf("성적 : %.2f" , score);
		 // printf로 %f 를 출력할 때는 소수점 자리를 지정해줘도 되고
    	//지정해주지 않아도 된다 . 
    	//다만 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면 
    	//%  . 출력을 원하는 소숫점 위치자리 값을 정리하고 f를 누르면됌 
    	//ex "성적 : %.3f , score를 진행하면 소숫점 3자리까지 출력이됌 만일 숫자가 1이라면 한자리수까지만 출력이됌 
    	/*
    	 
    	 System.out.print("줄바꿈 없이 가로로 출력")
    	           .println("다 출력한 다음에 다음줄에서 작성하기 엔터 " )
    	           .printf("서식이 지정된 문자열을 출력할 때 사용") 대표적으로 %d랑 %f가 %s %c %b %x %o
    	           %d : 10진수정수 
    	           %f : 소숫점 수를 출력하는 친구 
    	           %s : 문자열 출력 
    	           %c : 문자 하나 출력 
    	           %b : true인지 false인지 출력
    	           %x : 16진수 정수
    	           %o : 8진수 정수 
    	 
    	 
    	 */
    }
	public static void pre3() {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kuk = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng= sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math =sc.nextInt();
		
		int sum = kuk+eng+math;
		double sum1= (double) sum/3;
		System.out.println("국어점수 : "+kuk +"점");
		System.out.println("영어점수 : " +eng+"점");
		System.out.println("수학점수 : " + math+"점");
		System.out.println("세과목의 점수 합계는 "+sum+"이며");
		System.out.println("세 과목의 평균 점수는 "+sum1 + "입니다.");
	}
    public static void pre4() {
    	//2개의 수를 키보드로 입력 받은 수가 모두 같으면 
    	//true 아니면 false 출력 
    	Scanner sc=new Scanner(System.in);
    	//첫번째 수 입력받기 
    	System.out.print("첫번째 수를 입력하세요 : ");
    	int num1 = sc.nextInt();
    	System.out.print("두번째 수를 입력하세요 : ");
    	int num2 = sc.nextInt();
    	/*
    	 ==true == 양쪽에 있는 값이 같으면 true
    	 3==5 는 false라고 표현 
    	 5==5 는 true라고 표현 
    	 
    	 * */
    	boolean a = num1==num2;
    	System.out.println("a와 b는" + a +"입니다.");
    	
    	
    	
    }
	public static void pre4_1() {
		//2개의 수를 키보드 입력 받아 입력 받은 수가 모두 다르면 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("a의 수를 입력해주세요 : ");
		int num1 =sc.nextInt();
		System.out.print("b의 수를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		boolean sum1 = (num1!=num2);
		
		System.out.println("a와 b의 결과는 " + sum1+ "입니다");
	}
    public static void pre5() {
    	//practice5
    	//3개의 수를 키보드로 입력 받아
    	//입력 받은 수가 모두 같으면 true,아니면 false를 출력 
    	 Scanner sc= new Scanner(System.in);
    	 System.out.print("num1의 값을 입력해주세요 : ");
    	 int num1 =sc.nextInt();
    	 System.out.print ("num2의 값을 입력해주세요 : ");
    	 int num2 =sc.nextInt();
    	 System.out.print("num3의 값을 입력해주세요 : ");
    	 int num3=sc.nextInt();
    	 
    	 //                                ┌ true ┐
    	 //               num1이랑 num2가 같을때 && num2랑 num3가 같을때 
    	 boolean result =(num1!=num2) && (num2==num3);
    	 
    	 //  || vertical bar or 
    	 // 구분1 or 구분2
    	 // (true) or (false)= true
    	 // (false) or (true) = true
    	 // (true) or (true)= true
    	 // (false) or (false)= false
    	 boolean isOR = (num1==num2) || (num2 ==num3);
    	 
    	 System.out.println("num1: " + num1 + ", num2 : "+ num2 + ", num3 : "+ num3);
    	 System.out.println("result의 값은? : "+result);
    	 System.out.println("isor:" + isOR);
    	 
    	 //&& ampersand and 
    	 //   구분1 && 구분2 = true
    	 // (true) && (true) = true
   
    	 
    	 
    }
	public static void main(String[] args) {
		 pre5();

	}

}
