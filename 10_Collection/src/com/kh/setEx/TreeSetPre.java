package com.kh.setEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
//String 으로 "키위 복숭아 참외 수박 딸기"
	public static void main(String[] args) {
		//								  set.of()를통해 한번에 넣을수있음
		TreeSet<String> 과일들=new TreeSet<>(Set.of("키위","복숭아","참외","수박"," 딸기"));
		과일들.add("키위");
		System.out.println(과일들);
		//복숭아 제거
		과일들.remove("복숭아");
		//수박이 포함 되어있는지 확인
		System.out.println("수박이 포함되있나요 :"+과일들.contains("수박"));
		//과일들이 비어있는지 확인
		System.out.println("과일이 비어있나요:"+과일들.isEmpty() ); 
		//과일들 개수
		System.out.println("과일의 갯수는"+과일들.size());
		//가장 작은 값
		System.out.println(과일들.first()); 
		//가장 큰 값
		System.out.println(과일들.last());
		//전체 제거
		과일들.clear();
		//확인하기
		System.out.println(과일들);
	}
}
