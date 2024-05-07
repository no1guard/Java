package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	public void gugu() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		//종료를 하기 전까지 반복해서 출력
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해주세요 : ");
			int dan=sc.nextInt();
			int i=1;
			if(dan==0) {
				System.out.println("종료하겠습니다.");
				break;
			}
			for(; i<=9; i++) {
			System.out.println(dan + " * "+i+" = "+ (dan*i));
			}
		}
			
		
	}
    public void gugu2() {
    	//1. 스캐너로 구구단 값 입력받기
    	//2. int dan =sc.nextInt();
    	//3. for 문을 활용해서 9번부터 1번까지 출력하기 
    	//for (int a= 1;     ; a--){
    	// System.out.println("거꾸로 출력하기");
    	//종료를 원할경우 0
    	// }
    Scanner sc =new Scanner(System.in);
    
 
    while(true) { 
    	System.out.println("종료를 원할경우 숫자 0을 눌러주세요");
        System.out.println("원하는 단을 입력해주세요");
        int dan=sc.nextInt();
        if(dan==0) {
        	System.out.println("시스템을 종료합니다");
        	break;}
    for(int a=9; a>=1 ; a--) {
    	System.out.println(dan+ " *"+ a + " = "+ (dan*a));
    
    }
    }
    }
    public void gugu3() {
    	//int dan == 원하는 단만 지정해서 출력 
    	for(int dan=1; dan<=9; dan++) {
    		System.out.println("*****"+dan+"*****");
			//1단에서부터 1~9를 곱해준 값을 출력
    		for(int num1=1; num1<=9; num1++) {
    			System.out.println(dan+ " * "+num1+ " =" +(dan*num1));
    			
    		}
    		
    	}
    }
    public void gugu4() {
    	for(int num1=2; num1<=9; num1++) {
    		System.out.println("***"+num1+"***");
    	for(int num2=1; num2<=9; num2++) {
    		System.out.println(num1+ "X"+num2+" = "+(num1*num2));
    	}
    	}
    }
    public void random() {
    	//Random 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
    	Random 랜덤=new Random();
    	
    	int 랜덤숫자 = 랜덤.nextInt(5);//5를 지정하면 0~4까지의 숫자가 나옴
    	// 숫자를 셀 때 코드안에서는 -1~정수 양수 0부터 시작
    	//랜덤으로 지정한 숫자 -1
    	System.out.println(랜덤숫자);
    }
    //랜덤으로 숫자 3개 출력하기 
    public void randmFor() {
    	Random ran=new Random();
    	
    // 랜덤숫자 3개 츨력 1~10사이의 숫자
    	
    	for(int num =1; num<=3; num++) {
    		//랜덤으로 숫자를 만들어주기 
    		
    		int randomNumber=ran.nextInt(10)+1;//원래는 0에서~9였는데 +1을 해준거라 1에서 10까지로 변경된것
    		System.out.println("랜덤숫자 "+num+":"+randomNumber);
    	}
    }
	public void randomFor2() {
		Random ran1=new Random();
		
	for(int num=1; num<=6; num++) {
		int ran2=ran1.nextInt(45)+1;
		//if 랜덤 숫자가 같다면 번호를 제외하고 출력하기 
	System.out.println(num+"의 랜덤 숫자는"+ran2+"입니다.");
	}
	}
    //홀수는 odd
	public void oddNum() {
		for(int num=1; num<=10;num++) {
			//만약에 숫자가 홀수라면 출력하기 2%2=1
			 if(num%2!=0) {
				 System.out.println(num);
			 }
		}
	}
	public void even() {
		for(int num=1; num<=10;num++) {
			
			 if(num%2==0) {
				 System.out.println(num);
			 }
		}
	}
	public void squareStar() {
		int star=3;
		for(int i=0; i<star; i++) {// 한줄출력 0 1 2
		
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();//가로로 별을 출력한다음 줄바꿈
			
		}
	}
	public void fivestar() {
		int star=5;
		for(int i=0; i<star; i++) {// 한줄출력 0 1 2
		
			for(int j=0; j<star; j++) {
				System.out.print("* ");// *****
			}
			System.out.println(" ");//줄바꿈 1번 다
			//가로로 별을 출력한다음 줄바꿈
			
		}
	}
	public void numbergame() {
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	//기회는 2번
	//정답보다 작으면 숫자가 작다 , 정답보다 크면 숫자가 크다라는 힌트
	 	while(true) {
			
			System.out.println("숫자를 맞춰보세요 :");
			int guest =sc.nextInt();//게스트가 입력한 숫자 가져오기
			int ran1=ran.nextInt(3)+1;
			 for(int chance=1; chance<=2; chance++) {
				 System.out.println("기회가"+chance+"번 남았습니다.");
			 }
			
		if(guest==ran1) {
			System.out.println("축하합니다 숫자를 맞췄습니다.");
			break;
		}else if(guest>ran1){
			System.out.println("정답보다 숫자가 큽니다.");
		}else if(guest<ran1){
			System.out.println("정답보다 숫자가 작습니다.");
		} else {
			System.out.println("틀렸습니다 다시 입력해주세요");
			System.out.println("정답은"+ran1+"이였습니다..");
			continue;
		}
		}
		System.out.println("게임을 다시 시작하겠습니까? 1번: yes 2번: no");
		int selet=sc.nextInt();
		switch(selet) {
		case 1:
			return;
		case 2:
			return;
		}
	}
	public void ex1() {
		Scanner sc =new Scanner(System.in);
		while(true) {
		System.out.println("정수를 입력하세요");
		int num=sc.nextInt();
		
		for(int i=num; i>=9; i++) {
			System.out.println(i);
			
		}
		
		}
	}
	
	
	public static void main(String[] args) {
		 

	}

}
