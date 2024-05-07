package com.kh.practice.Audition.model.vo;
/*
 - name : String // 이름
- vlaue: String // 분야
- score: int // 점수
- passed: boolean //합격유무


+ Audition()
+ Audition(name:String, vlaue:String, score:int)
+ setter() / getter()
+ inform() : String
 */
public class Audition {
	//필드
	private String name;
	private String vlaue;
	private int score;
	private boolean passed;
	
	//Getter
	public void setName(String name) {
		this.name = name;
	}
	public void setVlaue(String vlaue) {
		this.vlaue = vlaue;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	//Setter
	public String getName() {
		return name;
	}
	public String getVlaue() {
		return vlaue;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}
	//생성자
	public Audition() {
		
	}
	//필수 생성자 
	public Audition(String name,String vlaue,int score  ) {
		this.name=name;
		this.vlaue=vlaue;
		this.score=score;
		 
		}
	public String inform() {
		return "이름 "+name+" 분야 "+vlaue+" 점수"+score;
	}
	 

}
 