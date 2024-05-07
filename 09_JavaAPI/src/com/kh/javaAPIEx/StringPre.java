package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substing 메서드를 사용해서 Today만 추출 
		String 문제1="Today is a beautiful day.";
		System.out.println(문제1.substring(0,5));
	 
		//toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2="Programming is fun and  challenging";
		System.out.println(문제2.toUpperCase());
		 
		//toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3="Learning new things is exciting";
		System.out.println(문제3.toLowerCase());
		 
		// split 활용해서 문자열을 " " 로 구분하기
		String 문제4= "A good mmedicine tastes bitter";
		String[] 문제4_1=문제4.split(" ");
		for(String 스플릿 :문제4_1) {
			System.out.println(스플릿);
			 
		// replace 활용해서 more 을 less로 변환
		String 문제5= "The more,the better";
	    String 변경=문제5.replace("more", "less");
	    System.out.println(변경);
	    
		// charAt 사용해서 6번째 글자를 가져오기
		String 문제6= "Walls have ears";
		char ch=문제6.charAt(6);
		System.out.println(ch);
	 
		// substing 메서드를 사용해서 his부터 끝까지 추출
		String 문제7= "Every dog has his day";
		System.out.println(문제7.substring(14,21));
	}

}
}