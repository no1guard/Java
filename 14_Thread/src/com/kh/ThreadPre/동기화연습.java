package com.kh.ThreadPre;

public class 동기화연습 {private static int 숫자 = 0;
	public static void main(String[] args) {
		 for(int i=0; i<8; i++) {
			 Thread t= new Thread(( )->{
				 synchronized (동기화연습.class) {
					 숫자++;
					 System.out.println("숫자들 : "+숫자);
				 }
			 });
			 t.start();
		 }
		//여러개의 스레드 생성해서 실행 8
	}
 

}
