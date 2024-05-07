package com.kh.oop.basic;

public class Student {
	// 필드        String name  int age int grade 
	//학생인데 학생의 이름과 나이의 학년 
	public String name;
	public int age;
	public int grade;
	
	
	//생성자 메서드(필수로 작성해야하는 생성자 메서드 만들기)
		public Student(String 이름,int 나이,int 학년) {
		this.name=이름;
		this.age=나이;
		this.grade=학년 ;
		
	}
	//필수로 넣어야하는것은 이름과 나이 학년
	public void fill() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학년 : "+grade);
		System.out.println();
	}
	//출력 메서드 정보 출력 메서드
	public static void main (String[]args) {
		Student hak=new Student("김철수",108,3);
		/*hak.name="김철수";
		hak.age=18;
		hak.grade=3;*/
		
		Student hak2=new Student("박영희",20,2);
		/*hak2.name="박영희";
		hak2.age=20;
		hak2.grade=2;*/
		
		hak.fill();
		hak2.fill();
		
		 	}
	//public void info(){
		//System.out.println 이름 나이 학년 출력 
	//}
	
	//최종 메인 메서드 
	 //학생 객체 생성하기 김철수 18 3학년 / 박영희 20 2
	// Student  student1
	// Student  student2
	
	//학생 1과 학생 2 정보 출력하기
	

}
