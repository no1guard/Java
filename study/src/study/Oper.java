package study;

public class Oper {
       
	public static void main(String[]args) {
		//º¯¼ö ÃÊ±âÈ­ 
		int a= 5;
		int b =2;
		
		//µ¡¼À 
		int sum =a+b;
		System.out.println("a+b =" + sum);
		
		//»¬¼À 
		int diff=a-b;
		System.out.println("a-b = " +diff);
		
		//°ö¼À
		int multi= a*b;
		System.out.println("a * b =" + multi);
		
		//³ª´°¼À 
		int div =a/b;
		System.out.println("a / b =  "+ div);
		
		//³ª¸ÓÁö 
		
		int mod = a%b; //¸òÀº 2 ³ª¸ÓÁö´Â 1 
		System.out.println("a % b = "+mod);
		
		int z= 10/0;
	}

}
