package com.kh.variable.ex;

public class VariableEx4 {
    // 메인 메서드 : 자바 프로그램 실행하는 구문 
	public static void main(String[] args) {
      // 상수 : 한 번 값을 기록하면 값을 바꿀수 없는 변수 
	  // 상수 키워드 : final
	
	  // 상수명 작성 : 대문자로 작성 , 연결되는 단어 사이는 _ 구분
	  // 상수를 대문자로 표기하는 것은 자바에서 개발자간의 규칙 ? ?ㅇㅋ 
		final double PI=3.14159265338;
		System.out.println("상수로 표기한 PI : " + PI);
		
		//MIN 가장 최소값
		final int MIN= 0;
		final int MAX= 100; // 쇼핑몰 재고를 예시로 들수잇음 
		
		//상수로 지정된 값을 변경할려면 에러가 발생 
		// ex Min=1;은 할수가 없ㅇ
		//상수 final을 사용해서 String으로 hello world출력해보기
		
		final String ex ="hello world ";
		System.out.println(ex);
		
		 
	
 
	}

}
