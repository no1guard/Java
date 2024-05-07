package study;

public class Oper6 {

	public static void main(String[] args) {
	int a=2;
	int b=3;
	
	System.out.println(a == b);// a랑 b가 달라서 false
	System.out.println(a != b);
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);// >= 이상
	System.out.println(a<=b);// <= 이하
 
    //결과를 boolean 변수에 담을수있다 
	boolean result= a==b;
	System.out.println(result);

	 // 정수도 비교 가능하나 문자열도 비교 가능하다 문자열이 같은지 비교할때에는 ==이 아니라 .equals() 메서드를 사용해야한다. 

	}

}
