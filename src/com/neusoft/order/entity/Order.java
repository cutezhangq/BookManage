package com.neusoft.order.entity;

import java.sql.Date;

import com.neusoft.book.entity.Book;
import com.neusoft.student.entity.Student;

public class Order {
	
	public Order(int order_id, int stu_id, int book_id, Date order_time, Date order_returnTime, String order_ceil,
			Student stu, Book book) {
		super();
		this.order_id = order_id;
		this.stu_id = stu_id;
		this.book_id = book_id;
		this.order_time = order_time;
		this.order_returnTime = order_returnTime;
		this.order_ceil = order_ceil;
		this.stu = stu;
		this.book = book;
	}
	private int order_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public Date getOrder_returnTime() {
		return order_returnTime;
	}
	public void setOrder_returnTime(Date order_returnTime) {
		this.order_returnTime = order_returnTime;
	}
	public String getOrder_ceil() {
		return order_ceil;
	}
	public void setOrder_ceil(String order_ceil) {
		this.order_ceil = order_ceil;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	private int stu_id;
	private int book_id;
	private Date order_time;
	private Date order_returnTime;
	private String order_ceil;//±¸×¢
	private Student stu = new Student(book_id, book_id, order_ceil, order_ceil, order_ceil, book_id, order_ceil, order_ceil, order_ceil, order_ceil);
	private Book book = new Book(book_id, order_ceil, order_ceil, order_returnTime, book_id, order_ceil, order_ceil);
}
