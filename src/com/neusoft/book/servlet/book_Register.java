package com.neusoft.book.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;


public class book_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		//创建实例对象
		Book book = new Book(0, null, null, null, 0, null, null);
		BookService bkService = new BookServiceImpl();
		//接收页面参数
		String name = request.getParameter("book_name");
		String author = request.getParameter("book_author");
		System.out.println(request.getParameter("book_time"));
		String time = request.getParameter("book_time");
		System.out.println("----------");
		System.out.println(request.getParameter("book_price"));
		Integer price = Integer.parseInt(request.getParameter("book_price"));
		String press = request.getParameter("book_press");
		String path = request.getParameter("book_path");
		//将获取的数据，通过set方法，放到对象中
		book.setBook_name(name);
		book.setBook_author(author);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		try{
			book.setBook_time(new java.sql.Date(sdf.parse(time).getTime()));
		}catch(ParseException e){
			e.printStackTrace();
		}
		book.setBook_price(price);
		book.setBook_press(press);
		book.setBook_path(path);
		//调用方法，得到count
		int count = bkService.add(book);
		//将对象存储到request作用域中
		request.setAttribute("new_book", book);
		if(count > 0){
			request.getRequestDispatcher("book_registerSuccesss.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("book_register.jsp").forward(request, response);
		}
	}
}
