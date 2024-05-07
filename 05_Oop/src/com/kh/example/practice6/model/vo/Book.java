package com.kh.example.practice6.model.vo;

public class Book {
/*
 title : String
publisher : String
author : String
price : int 
discountRate : double
*/
public String title;
public String publisher;
public String author;
public int price;
public double discountRate;

/* Book()
+  Book(title:String, publisher:String, author:String)
+  Book(title:String, publisher:String, author:String, 
           price:int, discountRate:double)
*/

public Book() {
	
}
public Book(String title,String publisher, String author) {
	this.title=title;
	this.publisher=publisher;
	this.author=author;
}

public Book(String title,String publisher , String author,int price,double discountRate) {
	this.title=title;
	this.publisher=publisher;
	this.author=author;
	this.price=price;
	this.discountRate=discountRate;
}
//메서드
public void inform() {
	System.out.println("제목은 : "+title);
	System.out.println("출판사는 :"+publisher);
	System.out.println("저자는 : "+ author);
	System.out.println("가격은 : "+price);
	System.out.println("할인율은 : "+discountRate);
	System.out.println("==============");
	
}



}
