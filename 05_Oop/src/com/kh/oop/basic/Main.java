package com.kh.oop.basic;

public class Main {
	
	//생성자 (필수로 값을 넣어야 하거나 또는 초기에 담을 공간을 생성하는 메서드)
	public Main() {
		
	}
	
	
	
	//내가 만든 파일중에서 최종적으로 출시할 파일만 실행
	
	
	public static void main(String[] args) {
		//public static void practice2(){}
		//무조건 메모리공간에 고정으로 있어야하지만
		//현재 static이 아니라 담을 공간 
		Main main =new Main();
		main.practice2();
	
	}
	public void practice1() {
		// 쿠키클래스에 객체 생성
		쿠키 mycookie=new 쿠키();
		
		//쿠키의 크기와 모양을 설정 
		//객체의 속성 설정 
		mycookie.size="라지";
		mycookie.shape="동그라미";
		
		//쿠키에 대한 정보 출력
		System.out.println("쿠키의 크기 : " +mycookie.size);
		System.out.println("쿠키의 모양 : " + mycookie.shape);
		
		
		
		쿠키 카페판매용쿠키= new 쿠키();
		카페판매용쿠키.size="아담함";
		카페판매용쿠키.shape="별모양";
		
		System.out.println("쿠키의 크기 : "+카페판매용쿠키.size);
		System.out.println("쿠키의 모양 : "+카페판매용쿠키.shape);
	}
	public void practice2() {
		/* Main 최종 메인 메서드에 
		이름 나이 서열 주민번호를 입력하고 
		이름 : 홍길동
		나이 : 55세
		성별 : F
		주민번호 : 550101-234567 ;
		출력한 다음 
		speakKorean 메서드 출력하기 */
		
		Nation 주민 =new Nation();
		주민.age=55;
		주민.name="홍길동";
		주민.gender='F';
		주민.jumin="550101-234567";
		 
		
		System.out.println("이름 : "+주민.name);
		System.out.println("나이 : "+주민.age);
		System.out.println("성별 : "+주민.gender);
		System.out.println("주민번호: "+주민.jumin);
		 
		주민.speakKorean();
		주민.wlfare();
		
		Nation 국민2= new Nation();
		국민2.name="신짱구";
		국민2.age=5;
		국민2.gender='여';
		System.out.println("이름"+국민2.name);
		System.out.println("나이"+국민2.age);
		System.out.println("성별"+국민2.gender);
		
		//홍길동 신짱구 납세의 의무 
		주민.납세의의무();
		국민2.납세의의무();
	}
	
}
