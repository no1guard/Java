package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;
import com.kh.practice.student.model.vo.Student;

/*
 Employee[] sArr = new Employee[5]
+ CUT_LINE : int = 60
+ EmployeeController()
+ printEmployee() : Employee[]
+ sumScore() : int
+ avgScore() : double[]* 
 */
public class EmployeeController {
	//필드생성 
	private Employee[] sArr =new Employee[5]; //이거는 이름 , 과목 점수 붕어빵틀을 5개 만든거임 
	public static final int CUT_LINE=60;
	//생성자
	public EmployeeController() {
		sArr[0]=new Employee("김길동","자바",100);
		sArr[1]=new Employee("박길동","디비",50);
		sArr[2]=new Employee("이길동","화면",85);
		sArr[3]=new Employee("정길동","서버",60);
		sArr[4]=new Employee("홍길동","자바",20);
	}
	
	public Employee[] printEmployee() {
		return sArr;
	}
	public int sumScore() {
		 int sum=0;
		 for(Employee a:sArr) {
			sum+= a.getScore();
		 }return sum;
		
	}
	
	public double avgScore() {
		double  a = sumScore() / sArr.length;
		return a;
		
	}
}
