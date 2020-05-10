package com.neusoft.book.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;

public class DeletServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService bookService = new BookServiceImpl();
		String idStr = request.getParameter("id");
		int id = 0;
		if(idStr !=null && idStr.length()>0){
			id = Integer.parseInt(idStr);			
		}
		bookService.delete(id);
		request.getRequestDispatcher("page.do").forward(request, response);
		
	}

}
