package com.neusoft.book.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;
import com.neusoft.book.service.impl.BookServiceImpl;

public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    
		request.setCharacterEncoding("utf-8");    
		response.setCharacterEncoding("utf-8");
		//引入service
		BookService bookService = new BookServiceImpl();
		//获取页面参数
		String indexStr = request.getParameter("index");
		//初始化参数
		int index = 1;
		if(indexStr!=null&&indexStr.length()>0){
			//强制类型
			index = Integer.parseInt(indexStr);
		}
		int size = 5;
		List<Book> bookList = bookService.pageList(index, size);
		//获取总记录数,拿bookService中返回值count
		int count = bookService.count();
		//计算总页数	取余
		int total = count%size==0?count/size:count/size+1;
		//创建作用域，客户端可以通过作用域共享后台的数据
		HttpSession session = request.getSession();
//		System.out.println(bookList);
		session.setAttribute("bookList", bookList);
		session.setAttribute("index", index);
		session.setAttribute("total", total);
		//转发数据到指定页面
		request.getRequestDispatcher("page.jsp").forward(request, response);
	}

}
