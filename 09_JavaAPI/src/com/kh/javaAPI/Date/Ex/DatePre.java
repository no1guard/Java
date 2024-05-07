package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		
		
		//1.yyyy-MM-dd
		SimpleDateFormat 년월일 = new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		String 년월일1 = 년월일.format(new Date());
		System.out.println("yyyy-MM-dd: "+년월일1);
		//2.HH:mm:ss
		SimpleDateFormat 시분초= new SimpleDateFormat("HH:mm:ss");
		Date date2=new Date();
		String 시분초1= 시분초.format(date);
	 
		System.out.println("HH:mm:ss : "+시분초1);
		//3.yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 년월일시분초1= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date3=new Date();
		String 합계= 년월일시분초1.format(date);
		 
		System.out.println("yyyy-MM-dd HH:mm:ss : "+합계);
		
		//4. 4. SimpleDateFormat 날짜 3=E를 사용해서 요일 나타내기 
		SimpleDateFormat 날짜4= new SimpleDateFormat("E");
		String 글자로데이터변경4=날짜4.format(date);
		
		System.out.println(글자로데이터변경4);
		
      System.out.println(date);
	}

}
