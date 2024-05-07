package study;

public class OperatorAdd2 {

	public static void main(String[] args) {

		// ++a << 증감 연산자를 피연산자 앞에 둘수있다 . 이것을 앞에 있다고해서 전위(Prefix)증감 연산자라한다.
		 //a++ : 증감 연산자를 피연산자 뒤에 둘수있다 . 이것을 뒤에있다고해서 후위(postfix)증감 연산자라 한다.

		// 전위 증감 연산자 이용 
		int a= 1;
		int b= 0;
		b=++a; //a의 값을 먼저 증가시키고 그 결과를 b에 대입 
		
		System.out.println("a = "+ a +  " ,b= "+ b);// a= 2 , b=2 
		
		//후위 증감자를 위해 값 초기화 
		
		a=1; // a의 값을 다시 1로 지정
		b=0; // b의 값을 다시 0으로 지정 
		
		b=a++;
		
		System.out.println("a = "+ a +  " ,b= "+ b);	

	}

}
