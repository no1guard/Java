package com.kh.ThreadPre;

public class 스레드시작 {
	public static void main(String[] args) {
		//for문으로 스레드 2개 만들기
		for(int i=0; i<5; i++) {
			스레드연습 t=new 스레드연습(i);
			t.start();
		}System.out.println("끝");
	 
		//start () 스레드 시작 
		//for문 } 닫는 중괄호 밑에 메인 메서드 종료 출력 후 출력 작성해보기
	}
}
