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
		//����service
		BookService bookService = new BookServiceImpl();
		//��ȡҳ�����
		String indexStr = request.getParameter("index");
		//��ʼ������
		int index = 1;
		if(indexStr!=null&&indexStr.length()>0){
			//ǿ������
			index = Integer.parseInt(indexStr);
		}
		int size = 5;
		List<Book> bookList = bookService.pageList(index, size);
		//��ȡ�ܼ�¼��,��bookService�з���ֵcount
		int count = bookService.count();
		//������ҳ��	ȡ��
		int total = count%size==0?count/size:count/size+1;
		//���������򣬿ͻ��˿���ͨ�����������̨������
		HttpSession session = request.getSession();
//		System.out.println(bookList);
		session.setAttribute("bookList", bookList);
		session.setAttribute("index", index);
		session.setAttribute("total", total);
		//ת�����ݵ�ָ��ҳ��
		request.getRequestDispatcher("page.jsp").forward(request, response);
	}

}
