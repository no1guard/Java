package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	//메소드
	public void practice11() {
		//비밀번호는 정해진게 아니라 입력해서 정해야함
		
		/*
		정수를 이용해서 4자리 비밀번호를 만들려고 하는데
		이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
		중복 값이 있으면 ‘중복 값 있음‘
		자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
		단, 제일 앞자리 수의 값은 1~9 사이 정수
		 */
		
		Scanner sc= new Scanner(System.in);
		
		//비밀번호를 우리가 만족할때 까지 출력(반복한다는의미)
		while(true) {
			System.out.println("비밀번호 4자리를 입력해주세요 (1000~9999)");
		int pw=sc.nextInt();
		//입력된 정수가 4자리인지 확인 
		if(pw<1000||pw>9999) {
			System.out.println("4자리가 아닙니다.");
			System.out.println("자리 수 안맞음");
			continue;
		}
		
		//자리값
		int[] digits=new int[4];//4자리만 허용 0~3
		digits[0]=pw/1000;//천의자리
		digits[1]=(pw/100)%10;//백의자리
		digits[2]=(pw/10)%10;//십의자리
		digits[3]=pw%10;//일의자리
		
		//중복여부 
		boolean isTrue=true;
		//length : 크기
		for(int i=0; i<digits.length; i++) {
			for(int j=i+1; j<digits.length; j++) {
				if(digits[i]==digits[j]) {
					isTrue=true;
					break;
				}
			}
			if(!isTrue) {
				break;
			}
			//중복 여부에 따른 메세지 출력
			if(!isTrue) {
				System.out.println("중복값이 있음");
			}else {
				System.out.println("비밀번호 생성 성공");
				break;
			}
		}
		}
		
		//Run
			
		 
		
		
	}
}