package com.kh.practice.snack.controller;

import object.oriented.programming.Snack;

public class SnackController {
	//snack 객체 생성
	private Snack s = new Snack();
	//기본생성자
	public SnackController() {
		
	}
	
	//return 메소드를 saveData
	public String saveData(String kind,String name,String flavor,int numof,int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumof(numof);
		s.setPrice(price);
		return" 저장 완료 " ;
	}
	//return 메소드 confirmData
public String confirmData(){
	return s.information();}
}
