package com.neusoft.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;


public class FindByNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    
		request.setCharacterEncoding("utf-8");    
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("book_name");
		BookService bookService = new BookServiceImpl();
		List<Book> bookList = bookService.findByName(name);
		request.setAttribute("bookList", bookList);
		request.getRequestDispatcher("findMoHu.jsp").forward(request, response);
	}

}
