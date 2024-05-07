package com.kh.ineritance.ex;

public class 핸드폰확인 {
public static void main(String[] args) {
	
		//스마트폰 중에서 아이폰을 확인하자
	
	 //	스마트폰 p1= new 아이폰();
	 아이폰 p1=new 아이폰();	
	  p1.set화면("레티나 디스플레이");
	  
	  System.out.println("p1.화면은"+p1.get화면());
	  //스마트폰 그릇에 아이폰을 가지고오면
	  //부모의 기능은 가져올 수 있지만 자식의 기능은 가져올 수 없음 
	  
	  p1.set통신사("KH");
	  System.out.println("p1.통신사는 "+p1.get통신사());
	  p1.set성능("최신");
	  System.out.println("p1.성능은"+p1.get성능());
	  
	  //부모의 기능을 자식을 호출하면
	  //모두 사용 가능 
	  아이폰 p2= new 아이폰();
	  p2.set화면("사과");
	  p2.set통신사("KH");
	  p2.set성능("초고속");
	   
	  p2.setIOS(1);
	  System.out.println(p2.toString());
	  
	  갤럭시 s1=new 갤럭시();
	  s1.set성능("빠름");
	  s1.set통신사("skt");
	  s1.set화면("안드로이2드");
	  s1.set안드로이드(2);
	  System.out.println(s1.toString());
	  
	  // 갤럭시 클래스에 있는 g1. 안드로이드를 가지고 와서 사용원함
	  //다운캐스팅 : 강제로 형변환을 진행해준 후 불러올 수 있도록 해줌
	  
	  갤럭시 s2=(갤럭시)s1;
	  s2.set안드로이드(4);// s1을 s2dp다가 담아서 사용할수 있도록 해줌
	  
	  System.out.println(s2.toString());
}
}
