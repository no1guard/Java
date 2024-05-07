package study;

public class Oper5 {

	public static void main(String[] args) {
	 int a=0;
	 
	 a= a+1;
	 System.out.println("a = " + a);//1
	 
	 a= a+1;
	 System.out.println("a = "+ a );//2
	 
	 // 실무에서 많이써서 증감 연산자라는걸 제공 
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 ++a; // a= a+1
	 System.out.println("a="+a);
	 
	 --a; 
	 System.out.println("a=" + a);
	 // ++a << 증감 연산자를 피연산자 앞에 둘수있다 . 이것을 앞에 있다고해서 전위(Prefix)증감 연산자라한다.
	 //a++ : 증감 연산자를 피연산자 뒤에 둘수있다 . 이것을 뒤에있다고해서 후위(postfix)증감 연산자라 한다.
	 

	}

}
