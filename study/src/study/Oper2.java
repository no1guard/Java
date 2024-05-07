package study;

public class Oper2 {

	public static void main(String[] args) {
		 
		//문자열과 문자열 더하기1
		String sum1 = "hello"+" world";
		
		System.out.println(sum1);
		
		//문자열과 문자열 더하기 2
		String s1= "string1";
		String s2= "string2";
		String result2=s1 +s2;
		System.out.println(result2);
		
		//문자열과 숫자 더하기1
		String result3="a+b = "+ 10;
		System.out.println(result3);
		
		//묹자열과 숫자 더하기2
		int num= 20;
		String str = "a+b = ";
		String result4=str+num;// 문자와숫자는 기본적으로 합쳐지지가않음 그래서 문자+숫자로하면 자바에서는 문자 + 문자로 인식해서 걍박아버림 
		System.out.println(result4); // a+b= 20
	}

}
