package study;

public class Comp2 {

	public static void main(String[] args) {
		
		// 정수도 비교 가능하나 문자열도 비교 가능하다 문자열이 같은지 비교할때에는 ==이 아니라 .equals() 메서드를 사용해야한다. 
	  String str1 = "문자열1";
	  String str2 = "문자열2";
	  
	  boolean result1 = "hello".equals("hello");// 리터럴 비교 
	  boolean result2 = str1.equals("문자열1");//문자열변수와 리터럴 끼리 비교
	  boolean result3 = str1.equals(str2);//문자열 변수와 문자열 변수끼리 비교 
	  
	  System.out.println(result1);
	  System.out.println(result2);
	  System.out.println(result3);
	}

}
