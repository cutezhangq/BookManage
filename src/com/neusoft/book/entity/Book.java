package com.neusoft.book.entity;

import java.sql.Date;

public class Book {
	
	public Book(int book_id, String book_name, String book_author, Date book_time, int book_price, String book_press,
			String book_path) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_time = book_time;
		this.book_price = book_price;
		this.book_press = book_press;
		this.book_path = book_path;
	}
	
	//多表连接后加上的构造器
	//订单管理中会查询到book_name，所以单独加上
	public Book(String book_name){
		super();
		this.book_name = this.book_name;
	}
	private int book_id;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public Date getBook_time() {
		return book_time;
	}
	public void setBook_time(Date book_time) {
		this.book_time = book_time;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public String getBook_press() {
		return book_press;
	}
	public void setBook_press(String book_press) {
		this.book_press = book_press;
	}
	public String getBook_path() {
		return book_path;
	}
	public void setBook_path(String book_path) {
		this.book_path = book_path;
	}
	private	String book_name;
	private	String book_author;
	private	Date book_time;
	private	int book_price;
	private String book_press;
	private	String book_path;
	
}
