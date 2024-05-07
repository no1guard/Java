package com.kh.arrayList.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx2 {
	//기본 생성자 
	public ArraysEx2() {
		
	}
	
	public void method1() {
		//숫자 배열 생성하기 
		int[] num= {6,4,2,3,5,7,9};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//num 배열을 abc 변수에 복사하기 ,Arrays.copyOf(num,num.length)
		int[] abc=Arrays.copyOf(num,num.length);
		
		//num과 abc가 같은지 비교하기 Arrays.equals(num,abc);
		System.out.println(Arrays.equals(num, abc));
		
		//int[] 채우기=new int[3];
		int [] 채우기=new int[3];
		Arrays.fill(채우기, 6);
		
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(채우기));
		
	 
	}
	public void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달 가능 없으면 없는 치킨입니다.
	String[] chickenMenu = {"양념치킨"	,"후라이드치킨","간장치킨"};
	
	//사용자로부터 치킨 이름 입력 받기
	Scanner sc = new Scanner(System.in);
	System.out.print("치킨 이름을 입력하세요 : ");
	String inputChic =sc.next();
	
	//배열에 사용자가 입력한 치킨이 있는지 검색
	boolean found = false;
	
	//
	 
	for(String menu:chickenMenu ) {
		 
		if(menu.equals(inputChic)) {
			found=true;
			break;
		}
		
	}
	if(found) {
		System.out.println(inputChic+"배달 가능!");
	}else {
		System.out.println(inputChic+"은 없는 메뉴입니다");
	}
	//for -each 문을 사용해서 치킨이 있는지 확인하는 작업 
	//만약에 치킨이 존재한다면 found = true ; break
		
	}
 public static void main(String[] args) {
	ArraysEx2 ae= new ArraysEx2();
	ae.practice17();
}	
}
