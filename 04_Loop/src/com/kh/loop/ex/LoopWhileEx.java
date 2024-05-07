package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {
	/*
	 while문을 사용해서 4번을 누르면 프로그램을 종료하는 코드를 작성하기
	 메서드명은 method1(){}
	 * */
	public static void method1() {
		
		Scanner sc =new Scanner(System.in);
		
		 
		while(true) {
			 
			System.out.println("1.아메리카노 2.카페라떼 3.녹차 4.주문취소 : ");
			System.out.println("메뉴를 입력해주세요");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: System.out.println("아메리카노.");
			break;
			case 2 : 
				System.out.println("카페라떼.");
				break;
			case 3 : 
				System.out.println("녹차.");
				break;
			case 4 : 
				System.out.println("주문취소.");
				return;
			default : System.out.println("!!잘못된 번호입니다 번호를 다시 입력해주세요!!");

			}
		}
		
	}

    public static void kh카페(){
   Scanner sc = new Scanner(System.in);
   
  
   while(true){
   System.out.println("kh카페에 오신걸 환영합니다. ^^* \n"
   					+ "원하는 메뉴를 입력해주세요. \n"
   					+ "1.아메리카노 2.카페라떼 3.녹차 4.흑당버블티 5.주문취소");
   String menu=sc.next();
   
   switch (menu){
   	 case "1": case "아메리카노":
   	  	System.out.println("아메리카노 주문 추가되었습니다.");
   	 	break;
   	 case "2": case "카페라떼":
    	  	System.out.println("아메리카노 주문 추가되었습니다.");
    	 	break;
   	 case "3": case "녹차":
    	  	System.out.println("아메리카노 주문 추가되었습니다.");
    	 	break;
   	 case "4": case "흑당버블티":
    	  	System.out.println("아메리카노 주문 추가되었습니다.");
    	 	break;
   	 case "5" : case "주문취소":
   	  	System.out.println("주문이 취소되었습니다. 다음에 방문해주세요");
   	  	return;
   	 default : 
   	 	System.out.println("번호를 잘못 입력했습니다 ");
   	 	}
   }
   }
    public static void getmoney() {
    	//커피값 100원 가진돈 300원
    	int coffe=10;
    	int money=300;
    	
    	//만약에 돈이 0보다 많다면 커피를 구매하고
    	//커피가 다 소진되면 판매를 중지한다.
    	while (money>0) {
    		System.out.println("돈을 받았으니 커피를 제공");
    		//커피가 10잔인데 1잔 제공받았으면 -1
    		coffe--;
    		System.out.println("남은 커피의 양은"+coffe+"잔 입니다.");
    		//커피가 모두 소진됐다면 판매를 중지하자
    		if(coffe==0) {
    			System.out.println(" 커피가 다 소진되었습니다.");
    			return;
    		}
    		
    	}
    	
    }
    public static void allNumber() {
    	int num=1;
    	while(num<=5) {
    		System.out.println(num);
    		num++;
    	}
    }
    public static void tree() {
    	int hit=0;
    	
    	while(hit<10) {
    		System.out.println("현재 나무를"+hit+"번 찍었습니다.");
    		hit++;
    		 
    	if(hit==10) {
    		System.out.println("나무가 10번 찍어서 넘어갔습니다.");
    		
    	}
    	}
    }
	public static void method2() {
		/*사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력 
		 * 단 입력한 수를 1도카 크거나 같아야함 
		 * 만약에 1 미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주새요 출력하기
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 정수를 입력해주세요");
		int num=sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			System.out.println("1부터 "+num+"까지의 숫자들");
			int abc=1;
			while(abc<=num) {
				System.out.println(abc);
				abc++;
				 
				 
				
			}
		}
		
	}
	public static void getcoffe() { 
	//커피가 100원 돈이 없으면 커피를 구매하지못하는경우
	 Scanner sc = new Scanner(System.in);
	 int price=100;

	 System.out.print("카페에 온걸 환영합니다 보유 금액을 입력해주세요 : ");
	 int money=sc.nextInt();
	 	 while(money>=100) {
	 		 System.out.println("커피 한잔의 가격은 100원입니다.");
	 		 System.out.println("커피 한잔 구매하였습니다.");
	 		 int sum=money-price;
	 		
	 		 System.out.println("남은금액은"+sum+"원 입니다.");
	 		 
	 		 return;
	 	 }if (money<price) {
	 		 System.out.println("돈이 부족합니다 커피를 구매하기 위해 더 많은 돈을 넣어주세요");
	 		 System.out.println("현재 보유중인 금액을 입력해주세요");
	 		 int num2=sc.nextInt();
	 		 int sum2=price-num2;
	 		 System.out.println("커피를 사기위해 필요한 금액은 "+sum2+"원 입니다.");
	 	 }
	 
	}
	public static void abc() {
		Scanner sc =new Scanner(System.in);
	int tang=10000;
	
	System.out.print("보유하고 있는 금액을 입력해주세요 : ");
	int money=sc.nextInt();
	
	if(money<tang) {
		System.out.println("잔액이 부족합니다 다시 입력해주세요");
	}while(money>=tang) {
		int ag=money-tang;
		int hg=ag/tang;
		System.out.println("주문이 완료되었습니다");
		System.out.println("현재 남은 금액은 "+ag+"원 입니다.");
		System.out.println("남은 금액으로 주문할수있는 탕수육 갯수는"+hg+"개 입니다.");
	
		return;
	}
	
	}
	public static void main(String[] args) {
		abc();
	}

}
