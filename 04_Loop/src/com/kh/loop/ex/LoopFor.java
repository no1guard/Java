package com.kh.loop.ex;

public class LoopFor {
/*
  for 문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문 
  특정 조건을 만족하는 동안 { } 코드 블록을 반복해서 실행  
  반복 횟수가 일정하게 정해진 경우 많이 사용 
  
  사용 예제 
  for(초기식 ; 조건식 ; 증감식) {
   		// 조건이 맞을 경우 반복해서 실행될 코드 블록 
  }
  
  //for문에서 조건이 맞지 않으면 for문을 탈출 
   

	for-each문 
	배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문 
	조건이 반복이 처음부터 끝까지 모두 반복
	
	사용 예제
	
	for(자료형 변수명 생성 : 반복해서 보여주고자 하는 변수명) {
	// 실행하고자 하는 작업 작성 
	 System.out.println(생성된 변수명 작성);
	 





 
 */
	public static void main(String[] args) {
		 /*
		  * 
		  *for (초기 식의 값이기 때문에 i라고 작성을 해줄 수 없음
			무조건
		for ( 지정값 변수명 = 변수의 초기숫자 ; 조건식; 증감식;
		  for ( i; i<=2 ; i++){
		   System.out.println("i의 값: " +i );
		   }
		  * */
		
		for(int i=1; i<=2; i++) {
			System.out.println(i);
			
		}System.out.println("===for 3번 ====");
		for(int num=1; num<=5; num++) {
			System.out.println("num의 값은"+num);
		}System.out.println("===for 4번====");
		for(int num=2; num<=10; num+=2) {
			System.out.println(num);
		}
		int dan=5;
		for(int i =1; i<=9; i++) {
			System.out.println(dan+"단 * "+i +" = "+(dan*i));
		}
		System.out.println("===for 6번====");
		int dandan=3;
		for(int num=1; num<=9; num++) {
			System.out.println(dandan+" * "+num+" = "+(dandan*num));
		}

	}

}
