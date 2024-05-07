package com.kh.practice.book.model.vo;

import java.util.Date;

/*
 * - title : String // 도서명
- author : String // 저자
- price : int // 가격
- date : Calendar // 출판날짜
- discount : double // 할인율*/

public class Book {
	
//필드
 private String title;
 

private String author;
 private int price;
 private Date Calendar;
 private double discount;



//Setter
 public void setTitle(String title) {
		this.title = title;
	}

public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCalendar(Date calendar) {
		Calendar = calendar;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
 
 //Getter
	 public String getTitle() {
			return title;
		}

		public String getAuthor() {
			return author;
		}

		public int getPrice() {
			return price;
		}

		public Date getCalendar() {
			return Calendar;
		}

		public double getDiscount() {
			return discount;
		}
 
 //생성자 
 public Book() {
	 
 }
//필수생성자 

public Book(String title, String author, int price, Date calendar, double discount) {
	super();
	this.title = title;
	this.author = author;
	this.price = price;
	Calendar = calendar;
	this.discount = discount;
}
 
 

}
