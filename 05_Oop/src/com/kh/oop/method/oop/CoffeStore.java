package com.kh.oop.method.oop;

public class CoffeStore {
	//필드 
	//커피 만드는 파일을 가져와서 각각의 가게에 커피 만드는 방법을 다르게 작성 
	private CoffeMaker maker;
	private String storeName;//가게이름
	private String location;//가게위치

//메서드
	//setter
	public void setMaker(CoffeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//getter
	public CoffeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	
	//생성자 : 기본
	public CoffeStore(){
		
	}
	//생성자 : 필수 // 커피 제조방법 가게명 지역 
	public CoffeStore(CoffeMaker maker,String storeName ,String location) {
		this.maker=maker;
		this.storeName=storeName;
		this.location=location;
		
		
	}
	//void 커피 주문 메서드 
	public void orderCoffe() {
		System.out.println("지역 :"+location);
		System.out.println(storeName+"에 주문한 커피 정보");
		maker.makeCoffe();
	}
	
}
