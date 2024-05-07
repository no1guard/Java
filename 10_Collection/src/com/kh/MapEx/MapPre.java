package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	//기본생성자 ctrl space enter 
	public MapPre() {
	 
	}
	//void 메서드 생성
	public void practice1() {
		Map<Integer,String> map =new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	public void pracrice2() {
	//									<> 자료형 넣어도 되고 안 넣어도 됌 
		Map<String,String>map=new HashMap<String,String>();
	// map.put을 활용해서  	학원-서울시 강남구 , 등산-서울시 관악구 , 롯데타워 서울시 송파구 )
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		
		// 전체출력 System.out.println();
		System.out.println(map);
		
		//get 이용해서 롯데타워가 어디 있는지 출력
		System.out.println("롯데타워의 위치는"+map.get("롯데타워"));
			
		// remove 활용해서 등산 삭제하기
		map.remove("등산");
			
		// for-each keySet()을 활용해서 전체 목록 출력하기 
		
		for(String map1 : map.keySet()) {
			String 명칭=map.get(map1);
			System.out.println(명칭+"-"+map1);
			
		}
	}
	
	public void practiec3() {
		//특정 값이 존재하는지 확인
		//String Integer 과일 -가격
		Map<String,Integer> map= new HashMap<>();
		map.put("사과",100 );
		map.put("바나나",200 );
		map.put("체리",300 );
		//200원 짜리 과일이 존재하는가?
		System.out.println("200원 과일이 존재하는가? : "+map.containsValue(200));
		//체리 과일이 존재하는가?
		System.out.println("체리가 있나요 ? :"+map.containsKey("체리"));
		//containsValue와 containsKey 모두 true false 값으로 보여짐
		
	    //크기 조회
		System.out.println("현재 map의 크기:"+map.size());
	}

	public void practice4() {
		//변수명 map
		Map<Integer,String> map=new HashMap<>();
		//put을 이용해서 1-에그마요 2-로티세리 바베큐 3- 스테이크앤치즈 4- 스파이시쉬림프
		map.put(1, "에그마요");
		map.put(2, "로티세리 바베큐");
		map.put(3, "스테이크 앤 치즈");
		map.put(4, "스파이시 쉬리프");
		//get을 이용해서 3번에 뭐가 들어있는지 확인
		System.out.println(map.get(3));
		//size() 를 이용해서 총 메뉴가 몇개있는지 확인
		System.out.println(map.size());
		//remove 활용해서 4번을 지워줌 
		map.remove(4);
		//isEmpty() map이 비어있는지 확인
		System.out.println(map.isEmpty());
		//keySet을 이용해서 for-each 모두 보기
		for(Integer a : map.keySet()) {
			String 메뉴=map.get(a);
			System.out.println(a+"-"+메뉴);
			
		}
		//Map.Enrty 키- 값을 동시에 가져오는 방법 뒤에는 변수명 .entrySet()
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println(e.getKey()+e.getValue());
		}
		//clear() 모두 삭제 
		map.clear();
		System.out.println(map);
	}
 
	
	
	//최종 메인메서드 
	public static void main(String[] args) {
		MapPre mp=new MapPre();
		mp.practice4();
	}
	
}
