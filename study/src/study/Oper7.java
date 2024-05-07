package study;

public class Oper7 {

	public static void main(String[] args) {
		//논리 연산자
		// 논리 연산자는 boolean 형인 true,false를 비교하는데 사용한다.
		// && (And,그리고): 두 피연산자가 모두 참이면 참을 반환 , 둘중 하나라도 거짓이면 거짓을 반환 
		//|| (또는 or ) : 두 피연산자 중 하나라도 참이면 참을 반환 , 둘다 걱짓이면 거짓을 반환
		// ! (부정 negative) : 피연산자의 논리적 부정을 반환 , 즉 ,참이면 거짓을 , 거짓이면 참을 반환 
		
		System.out.println("&& : AND 연산");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false&&false);
		
		System.out.println("|| : OR연산");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false||false);
		
		System.out.println("! 연산");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println( "변수 활용");
		boolean a= true;
		boolean b= false;
		System.out.println(a && b);// false
		System.out.println(a||b);//둘중 하나만 참이면 되니까 이거는 True
		System.out.println(!a);//a는 true 부정을 반환 반전술식으로 false가 나올거임
		System.out.println(!b);//b는 false 이것도 반전술식 쳐맞아서 True가 나옴 
	}

}
