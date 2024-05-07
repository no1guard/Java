package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Person;

public class Student extends Person{
//필드
	//학년 전공
	private int grade;
	private String major;
//메서드
	//Setter
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	//Getter
	public int getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}
	//생성자 : 기본
	public Student() {
		
	}
	//생성자 : 필수 String name, int age, double height, double weight
	//super()안에다가 추가 

	public Student(int grade, String major,String name, int age, double height, double weight) {
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}
	
	//@Override toString
	@Override
	public String toString() {
		return"학생[이름="+getName()+", 나이="+getAge()+", 키="+getHeight()+",몸무게 ="+getWeight()+", 학년="+grade+",전공="+major+"]";
	}
 

}
