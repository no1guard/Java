package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
	public static void main(String[] args) {
		//Hello World.txt 파일에 나는 자바가 너무 재밌다 라는 내용을 작성하고
		//파일을 저장하기 
		//헬로우월드에 자바는 정말정말재밌다. 라는 말을 이어쓰기
		String 헬로우월드="\n자바는 정말정말재밌다.";
		try {
			FileWriter 글쓰기=new FileWriter("Hello World.txt");
			글쓰기.write("나는 자바가 너무 재밌다" );
			글쓰기.write(헬로우월드);
			글쓰기.close();
			System.out.println("저장완료");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
