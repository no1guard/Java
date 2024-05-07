package com.kh.interfaceEx;

public class 중학생계산기 implements 계산기,기계 {

	//기계부터 
	@Override
	public void 전원켜기() {
		System.out.println("중학생계산기 전원을 킵니다");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생계산기 전원을 끕니다.");
	}
	@Override
	public  int 합(int j,int d) {
		return j+d;
	}
	@Override
	public  int 차(int c,int d) {
		return c-d;
	}
	@Override
	public  int 곱(int c,int d) {
		return c*d;
	}
	@Override
	public  double 몫(int c,int d) {
		return c/d;
	}
	@Override
	public  int 나머지(int c,int d) {
		return c%d;
	}
	
	
}
