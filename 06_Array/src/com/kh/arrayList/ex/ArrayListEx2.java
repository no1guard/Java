package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
//메서드
	//기본 생성자 ,깡통 
	public ArrayListEx2() {
		
	}
	public void method1() {
		//딸기 바나나 사과 
		ArrayList<String> list=new ArrayList<>();
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get 0 1 2 사용해서 각 index 자리에 값 출력하기 
		for(int i=0; i<list.size(); i++) {
			System.out.println("lits"+i+" : "+list.get(i));
		}
		//set(수정) 바나나 -> 키위수정
		list.set(1, "키위");
		//size를 이용해서 크기 확인 
		//size() 숫자를 넣지 않음 size()사용 
		System.out.println(list.size()); 
		//remove를 사용해서 키위 삭제 
		list.remove(1);
		//Empty() 비어있는지 확인
		System.out.println("장바구니 비어 있나요 ? :"+list.isEmpty());
		
		System.out.println(list.get(1));
		System.out.println("==========");
		//앞으로 사용할 for 문
		//앞으로 사용할 for 문 
		for (String 과일:list) {
			
			System.out.println(과일);
		}
		
	}
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//add 사자 호랑이 고양이 강아지
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size()동물이 몇마리 있는지 확인
		System.out.println("현재 동물은"+animal.size()+"마리 있습니다.");
		//get으로 동물 확인
		System.out.println(animal.get(0) ); 
		System.out.println(animal.get(1) ); 
		System.out.println(animal.get(2) ); 
		System.out.println(animal.get(3) ); 
		System.out.println("===========");
		//set 고양이 ->토끼로 변경 
		animal.set(2, "토끼");
		//remove로 강아지 삭제
		animal.remove("강아지");
		//for문을 사용해서 get 출력 
		for(String 동물:animal) {
			System.out.println("동물 ! :"+동물);
		}
		//clear 사용해서 모두 삭제
		animal.clear();
		//isEmpty 모두 삭제됐는지 확인
		System.out.println(animal.isEmpty());
	 
	}
	public void method3() {
		//피자가게
		ArrayList<String>pizza=new ArrayList<>();
		
		//add 고구마 포테이토 페페로니
		pizza.add("고구마피자");
		pizza.add("포테이토피자");
		pizza.add("페페로니피자");
		
		System.out.println("==피자메뉴==");
		
		//get을 활용해서 출력
	 System.out.println(pizza.get(0));
	 System.out.println(pizza.get(1));
	 System.out.println(pizza.get(2));
	 System.out.println("--------------");
		//set 활용해서 페페로니 피자를 -> 파인애플 피자로 변경 
		pizza.set(2, "파인애플피자");
		//remove 파인애플 삭제
		pizza.remove("파인애플피자");//pizza.remove(2)도 사용가능
				
		//for 문 활용해서 출력 
		for(String 피자가게:pizza) {
			
			System.out.println(피자가게);
		}
		
		System.out.println("피자가게가 사라질 예정입니다.");
		//메뉴 모두 삭제 
		pizza.clear();
		//메뉴 모두 삭제 되었는지 확인 isEmpty();
		System.out.println(pizza.isEmpty());
		
	}
	 
	 
	public static void main(String[] args) {
		ArrayListEx2 ae=new ArrayListEx2();
		ae.method3();
	}
}

