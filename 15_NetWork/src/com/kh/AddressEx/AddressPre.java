package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : "+구글.getHostName());
			System.out.println("IP주소: "+구글.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 나의 컴퓨터 이름과 자리번호 확인하기 
		//get localhost
		try {
			InetAddress 컴퓨터 =InetAddress.getLocalHost();
			System.out.println(컴퓨터);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
	}

}
