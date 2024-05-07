package com.kh.example.practice4;

import com.kh.example.practice4.model.vo.Student;

public class run {

public static void main(String[] args) {
	Student hak1=new Student();
	hak1.setName("홍길동");
	hak1.setGrade(3);
	hak1.setClassroom(2);
	hak1.setHeight(200.5);
	hak1.getGender();
	
	hak1.information();
}

}
