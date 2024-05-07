package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

/*
 - AuditionController ac
 
= new AuditionController()
+ AuditionMenu ()
 */
public class AuditionMenu {
//필드
	private AuditionController ac = new AuditionController();

//메서드
	// void
	public void printResult() {
		System.out.println("name       vlaue          score");
		for (Audition kak : ac.printAudition()) {
			System.out.println(kak.inform());

		}
		ac.printPass();

	}
}
