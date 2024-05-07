package com.kh.oop.method.oop;

public class CoffeeRun {
	//최종 출력 메인 메서드
	public static void main(String[]args) {
		//커피제조하기
		CoffeMaker cm= new CoffeMaker("아메리카노",1,false);
		//커피 가게작성 
		CoffeStore cs= new CoffeStore(cm,"꺼삐빈","서울시 강남구");
		//주문 및 제조 
		cs.orderCoffe();
		
	}

}
