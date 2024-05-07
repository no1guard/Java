package com.kh.practice.book.view;

import java.util.Date;
import java.util.Scanner;

public class BookMenu {
	//기본 생성자
	public BookMenu() {
		
	}
	 
	Scanner sc=new Scanner(System.in);
	public void mainMenu() {
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		int choice =sc.nextInt();
		switch(choice) {
		
		case 1: //도서 추가 저장 
			break;
		case 2 : //저장 도서 출력
			break;
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			return;
		default: 
			System.out.println("잘못 입력하였습니다 다시 입력해주세요.");
		
		}
	
	
	}

	/*
	 *  private String title;
 

private String author;
 private int price;
 private Date Calendar;
 private double discount;*/
	
	//도서추가 
	public void fileSave() {
		System.out.print("도서명 :");
		String title=sc.nextLine();
		System.out.print("저자 : ");
		String author=sc.nextLine();
		System.out.print("도서가격 : ");
		int price=sc.nextInt();
		/*System.out.println("출판 날짜(yyyy-mm-dd)");
		Date calander =sc.nextDa*/
		System.out.print("할인율 : ");
		double discount=sc.nextDouble();
	}
}
