package com.kh.practice.token.controller;

public class TokenController {
	//기본생성자
	public TokenController() {
		
	}
	//입력된 문자열의 첫 글자를 대문자로 변환 후 반환
	// 예를 들어 " java"라는 문자열이 입력되면 자동으로 JAVA로 변경되게 만들어줌
	//subString(처음 시작하는 인덱스 값,끝나는 인덱스 값)
	//subString(처음시작하는인덱스값)-> 실수로하나만 쓴다면 내가 원하는 숫자부터 끝까지보기 즉 첫글자부터 끝까지 대문자로 바꿔줌
	//toUpperCase = 문자를 모두 대문자로 변경하는 것 
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() +input.substring(1);		
	}
	/*
	public int findChar(String input, char one) {
		
	}*/
	 
}
