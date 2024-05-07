package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
 //필드
	private EmployeeController ssm= new EmployeeController();
//메서드
	//생성자 : 기본
	//void
	public void printResult() {
		System.out.println(" name " +" subject "+ " score ");
		for (Employee abc : ssm.printEmployee() ) {
			System.out.println(abc.inform());
			
		}
		System.out.println("점수의 합계는"+ssm.sumScore());
		System.out.println("점수의 평균은"+ssm.avgScore());
		System.out.println("합격은"+  (ssm.avgScore() > ssm.CUT_LINE));
	}
	
}
