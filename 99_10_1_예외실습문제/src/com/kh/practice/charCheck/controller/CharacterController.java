package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	
	//문자열이 비어있을 때 예외상황 문구 만들기
	
	public int countAlpha(String s)throws CharCheckException{
		
		if(s==null || s.isEmpty()) {
			throw new CharCheckException("입력된 문자열이 비어 있습니다.");
		}
		
		int count =0;
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if( (c>='a'&&c<='z')||(c >='A' && c<='Z')         ) {
				count++;
			}
		}
		
		return count;
		
	}

}
