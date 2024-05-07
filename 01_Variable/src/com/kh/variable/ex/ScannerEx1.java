package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
	 /*
	  Scanner 클래스 
	  사용자로부터 키보드 입력을 받기 위해 
	  Java에서 제공하는 클래스 
	  
	  기본으로 구성되어있는 것은 아님 
	  import Java.util 패키지 표시를 해준 후 사용할 수 있음 
	  import 정확한 표기 법: import java.util.Scanner;
	  여기서 import란 포함한다는 의미 (가져온다라는의미 )
	  
	  Scanner.next() : 공백없이 단어 (String) 1개 입력 가능 Ex cat is를 치면 cat만 출력 이유는 cat다음에 스페이스바 공백을 쳐띄어서 사라진거 
	  
	  Scanner.nextLine(): 공백포함해서 문자열(String) 1개 입력 가능 * 뭘써도됌 다만 엔터치면끝 
	  
	  Scanner.nexInt() : int형 정수 1개 입력  : 쓰임새는 회원가입할때 휴대폰번호나 나이입력등에 사용가능할듯
	  Scanner.nextLong() : long 형 정수 1개 입력 : 쓰는곳이있나이거
	  Scanner.nextDuble(): 실수 1개 입력 : 쓰임새 대충 예상해보면 몸무게등 적을때 소숫점 자리가 필요하니까 쓸때가 좀 있을거같음 
	  
	  이외에 Scanner 클래스 안에는 여러가지 기능이 존재함 
	  그리고 스캐너는 불러온 다음 close를 사용해서 공간을 닫아주는 표시를 해주는게 좋음 (필수는아님) 
	  */
		
	// Scanner 사용 하기
	
		
		// 1. 클래스 위에 import 구문이 생겨야함 
		 
		// 2. Scanner 객체 사용
		
		System.out.println(10111);
		
		Scanner sc= new Scanner(System.in);
			
		// 3. System.in 키보드로 입력하는 값을 받을 수 있도록 함 
		System.out.print("정수입력 1 : ");
		int num1=sc.nextInt(); // 다음에 입력된 정수를 가져와 num1에 대입해라 
		
		System.out.print("정수 입력 2 : ");
		int num2=sc.nextInt(); // 다음에 입력된 정수를 가져와 num2에 대입 
		
		
		//실수 입력 nextDouble을 사용해서 num3 값에 실수 입력 만들기
		//단어 입력 2개하기 next  사용해서 변수명 word1 word2 
		
		
		System.out.print("실수 입력 : ");
		Double num3= sc.nextDouble();
		
		System.out.print("단어 입력 1 : ");
		String word1 = sc.next();
		// Scanner를 이용해서 입력을 진행할 경우
		// System.out.print를 이용해서 제대로 값이 입력됐는지 
		// 문제는 없는지 확인 출력을 해주는 습관을 주는 것이 좋음
		System.out.print("단어 입력 2: ");
		String word2 =sc.next();
		
		//************************************* << 여기서부터 뭐가 달라진다는 표시 
		//- next() / nextInt()/ nextDouble()등을 작성한 이후 
		//nextLine()을 작성해야되는 상황이 오면 
		//nextLine()을 미리 한번 작성하고 사용하기 ? ? 
		
	//next() 뒤에 남아있는 버퍼값을 Line안에 넣어준거 (쓸떼없는 공백 한개를 얘가 대신 받아준거 그래서 밑에 문장입력은 문제없이될거임 ) 
		//그런데 버퍼값은 우리가 눈으로 보거나 저장을 해야할 이유가 없기 때문에 
		//앞에 자료형이나 변수명을 사용해서 버퍼를 넣어 저장해야할 이유가없음 걍쓸때없는 데이터라서 
		//sc.nextLine();으로 없앤거
		
		// 즉 sc.nextLine();을 호출해서 남아있던 엔터를 제거한거임 
		sc.nextLine(); 
		
		System.out.print("문장 입력 : ");
		String str= sc.nextLine();
		
		 
		
		// 4. System.out 이용해서 키보드에 작성된 내용 출력하기
		System.out.println("정수 1의 값 : " + num1);
		System.out.println("정수 2의 값 : " + num2);
		System.out.println("실수 값 : " + num3);
		System.out.println("단어들: " + word1 +","+word2);
		System.out.println("추가된 문장 : " + str);
		
		 
		 //5. System close 사용해서 닫아주기 
		 
		sc.close();
		// Scanner 사용을 다 했다면 공간을 차지하지 않기 위해서 
		//Scanner를 종료하는 close 를 사용해서 닫아주기 
		 
		 
		 

	}

}
