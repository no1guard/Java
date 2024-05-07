package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

/*
 - Audition[] sArr = new Audition[5]
+ CUT_LINE : int = 60
+ AuditionController()
+ printAudition() : Audition[]

+ sumScore() : int
+ avgScore() : double[]
+ printPass() : void
 * */
public class AuditionController {
	// 필드
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;

	// 생성자
	public AuditionController() {
		sArr[0] = new Audition("김영희", "발라드", 100);
		sArr[1] = new Audition("박영희", "힙합", 50);
		sArr[2] = new Audition("이연이", "뮤지컬", 85);
		sArr[3] = new Audition("정영히", "댄스", 60);
		sArr[4] = new Audition("홍영희", "팝", 20);
	}

	public Audition[] printAudition() {
		return sArr;
	}

	public int sumScore() {
		int sum = 0;
		for (Audition zz : sArr) {
			zz.getScore();
		}
		return sum;
	}

	public double avgScore() {
		double qq = sumScore() / sArr.length;
		return qq;
	}

	public void printPass() { //한사람씩 모두 합 불 체크
		/*
		 * sArr[0]("김영희","발라드",100); sArr[1]("박영희","힙합",50); sArr[2]("이연이","뮤지컬",85);
		 * sArr[3]("정영히","댄스",60); sArr[4]("홍영희","팝",20);
		 */
		for (Audition oo : sArr) {
			oo.setPassed(oo.getScore() >= CUT_LINE);
			System.out.println(oo.getName() + " 학생은 " + (oo.isPassed() ? "통과" : "불합격") + "입니다.");
		}

	}
}
