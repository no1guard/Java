package com.kh.oop.basic;

public class Bank {
	
	//1. 필드
	// 이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agreel;
	//2. 생성자 메서드 
	//2-1) 필수가 아닌 생성자 =클래스명과 같아야함
	public Bank() {
		
	}
	//2. 필수인 생성자 
	public Bank(String 이름,String 계좌번호,int 금액,String 비밀번호 ) {
		this.name=이름;
		this.accountNumber=계좌번호;
		this.balance=금액;
		this.password=비밀번호;
		
		
		
	}
	//3. 출력 생성자 (메서드)
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("잔액 : "+balance);
		System.out.println("비밀번호 : "+password);
		System.out.println("마케팅수신동의 : "+agreel);
		System.out.println();
	 
	}
	//4. 최종 메인 출력 메섣,
	public static void main(String[]args) {
		
		//1. 조 씨 은행 통장 
	Bank customer1=new Bank( );
	customer1.name="Jor";
	customer1.accountNumber="111-222-3333";
	customer1.balance=123;
	customer1.password="0000";
	customer1.agreel=true;
	
	customer1.info();
	
	Bank customer2=new Bank();
	customer2.name="dan";
	customer2.accountNumber="111-110-1234";
	customer2.balance=1000;
	customer2.password="1234";
	//수신동의를 해야하는데 수신동의를 안하고 바쁘다고 먼저감
	//boolean의 기본값은 false라서 딱히 안적었어도 false라고 나옴 

	customer2.info();
	
	Bank customer3=new Bank("마이클","123-444-5555",1000,"1234");
	 customer3.agreel=true;
	 
	 customer3.info();
	 

	}
}
