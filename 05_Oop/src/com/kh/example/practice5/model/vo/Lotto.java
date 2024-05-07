package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {
	Random a=new Random();
	//필드 생성 
	private int []lotto = new int[6];
	int i
	for (int i1= 0; i <6; i++){
	 lotto[i] = a.nextInt(45)+1;
		for (int j=0; j<i; j++){
	if(lotto[i]==lotto[j]) {
	 i--;
	break;
	}
	
	
	
	//생성자 선언
	public Lotto() {
		
	}
	public void information() {
		
	}
	public static void main(String[] args) {
		 

	}

}
