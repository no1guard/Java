package com.kh.FileEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 StringBuilder : 속도가 빠름 
 */
public class BuilderWriterEx {
	public static void main(String[] args) {
		// 파일생성
		String 파일이름 = "줄.txt";

		// StringBuilder를 사용해서 파일에 쓸 내용 작성
		StringBuilder 빌더 = new StringBuilder();
		빌더.append("첫 번째 줄이어라.\n");
		빌더.append("두 번째 줄이어라.\n");
		빌더.append("세 번째 줄이어라.\n");

		// FileWriter 객체를 생성해서 파일에 쓰기 모드로 열기
		// BufferedWriter 를 사용해서 더 빨리 가져올 수 있도록 함

		try {
			BufferedWriter 버퍼글쓰기 = new BufferedWriter(new FileWriter(파일이름));
			// 파일내용 작성
			/*
			 * System.nanoTime() : 2024.04.25 09:00:00부터
			 * 
			 * 1ms 1/1000 초 1us 1/1000 ms ins 1/1000 us(1/10억 초)
			 * 
			 */
			long 시작시간 = System.nanoTime();

			버퍼글쓰기.write(빌더.toString());

			long 종료시간 = System.nanoTime();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
