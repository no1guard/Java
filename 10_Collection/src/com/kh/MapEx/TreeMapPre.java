package com.kh.MapEx;

import java.util.TreeMap;

/*
	 String,String 으로
	 "apple 사과
	 바나나
	 오렌지 포도
	 수박 
	 [] for문을 활용
	 
	 전체출력 
	 get 사용해서 바나나에 해당하는 값 가져오기 
	 size 확인
	 isempty 비어있는지 확인
	 containskey 키가 존재하는지 확인  grape
	 containsvalue 값이 존재 하는지 확인 포도 
	 key set으로모두출력 
	 values() 모두 출력
	 firstKey 첫번째 키
	 lastKey()마지막키출력 
	 */
public class TreeMapPre {
	public static void main(String[] args) {
		TreeMap<String,String> tmp =new TreeMap<>();
		
		//put 사용해서 값 추가
		/*tmp.put("apple", "사과");
		tmp.put("banana", "바나나");
		tmp.put("orange", "오렌지");
		tmp.put("grape", "포도");
		tmp.put("watermelon", "수박");*/
		String[] key= {"apple","banana","orange","grape","watermelon"};
		String[] values= {"사과","바나나","오렌지","포도","수박"};
		
		for(int i=0; i<key.length; i++) {
			tmp.put(key[i], values[i]);
		}
		System.out.println(tmp);
		System.out.println(tmp.get("banana"));
		System.out.println(tmp.size());
		System.out.println("비어있는지 "+tmp.isEmpty());
		System.out.println("포도가 존재하는지"+tmp.containsKey("grape"));
		System.out.println("키 전체 호출: "+tmp.keySet());
		System.out.println("벨류 전체 호출"+tmp.values());
		System.out.println("첫번째 키 호출"+tmp.firstKey());
		System.out.println("마지막 키 호출"+tmp.lastKey());
		
		
	}
}
