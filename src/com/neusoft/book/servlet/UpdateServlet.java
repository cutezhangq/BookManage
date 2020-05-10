package com.neusoft.book.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    
		request.setCharacterEncoding("utf-8");    
		response.setCharacterEncoding("utf-8");
		//获取页面参数
		Integer id = Integer.parseInt(request.getParameter("book_id"));
		String name = request.getParameter("book_name");
		String author = request.getParameter("book_author");
		//时间转换
		Date date = Date.valueOf(request.getParameter("book_time"));
		Integer price = Integer.parseInt(request.getParameter("book_price"));
		String press = request.getParameter("book_press");
		String path = request.getParameter("book_path");
		//实例化对象
		Book b = new Book(price, path, path, date, price, path, path);
		b.setBook_id(id);
		b.setBook_name(name);
		b.setBook_author(author);
		b.setBook_time(date);
		b.setBook_price(price);
		b.setBook_press(press);
		b.setBook_path(path);
		BookService bookService = new BookServiceImpl();
		bookService.update(b);
		request.getRequestDispatcher("page.do").forward(request,response);
	}

}
