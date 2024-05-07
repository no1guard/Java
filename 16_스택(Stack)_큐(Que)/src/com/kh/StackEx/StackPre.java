package com.kh.StackEx;

import java.util.Stack;

//main 메인메서드 에서 작성

	// Stack 을 활용해서 10 30 50 40 20 을 넣고 push 사용 
	// 맨 위 값을 지우고 반환해서 확인 
	// 현재 맨 위 값 확인
	// 비어있는지 확인
	// 크기는 몇인지 확인 

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> 스택=new Stack<>();
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		
		int 맨위= 스택.pop();
		System.out.println(맨위);
		
		int 확인 =스택.peek();
		System.out.println(확인);
		
		boolean check=스택.isEmpty();
		System.out.println(check);
		
		System.out.println(스택.size());
		
	
	}
	 

}
