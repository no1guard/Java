package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	public static void main(String[] args) {
		//원본이미지 pigs.jpg  pigs_cute.jpg 가로=400 세로 =200
		String 원본이미지 = "src/com/kh/imageEx/pig.jpg";
		String 사이즈조정이미지="src/com/kh/imageEx/pig_cute.jpg";
		//이미지 가로 세로 크기 설정
		int 세로크기= 200;
		int 가로크기=400;
		
		
		try {
			//버퍼이미지를 통해서 이미지 불러오기
			BufferedImage 원본이미지데이터=ImageIO.read(new File(원본이미지));
			//새로운 크기의 이미지 생성
			BufferedImage 이미지버퍼=new BufferedImage(가로크기,세로크기,BufferedImage.TYPE_INT_RGB);
			//이미지 크기를 조정해서 새로운 이미지에 그리기 시작하자 
			Image 이미지그리기=원본이미지데이터.getScaledInstance(가로크기, 세로크기, Image.SCALE_SMOOTH);
			
			이미지버퍼.createGraphics().drawImage(이미지그리기,0,0,null);
			//새로 만든 이미지를 파일로 저장하기
			ImageIO.write(이미지버퍼, "jpg", new File(사이즈조정이미지));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	}

	
	 