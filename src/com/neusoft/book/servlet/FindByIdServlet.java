package com.neusoft.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;

public class FindByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    
		request.setCharacterEncoding("utf-8");    
		response.setCharacterEncoding("utf-8");
		//获取前台Id
		Integer id = Integer.parseInt(request.getParameter("id"));
		BookService bookService = new BookServiceImpl();
		Book b = bookService.findById(id);
		HttpSession session = request.getSession();
		session.setAttribute("b",b);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

}
