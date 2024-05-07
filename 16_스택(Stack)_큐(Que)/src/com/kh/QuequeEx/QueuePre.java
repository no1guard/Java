package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
	public static void main(String[] args) {
		Queue<Integer> 큐 = new LinkedList<>();
		큐.offer(80);
		큐.offer(60);
		큐.offer(30);
		큐.offer(20);
		
		//poll 데이터 확인 및 제거 
		int 확인 = 큐.poll();
		System.out.println(확인);
		
		int 재확인=큐.peek();
		System.out.println(재확인);
		
		boolean check=큐.isEmpty();
		System.out.println(check);
		
		System.out.println(큐.isEmpty());
		
	}

}
