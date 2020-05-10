package com.neusoft.order.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.order.entity.Order;
import com.neusoft.order.service.OrderService;
import com.neusoft.order.service.impl.OrderServiceImpl;


public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		//接受页面参数
		String stu_idS = request.getParameter("stu_id");
		String book_idS = request.getParameter("book_id");
		//初始化参数
		int stu_id = 0;
		int book_id = 0;
		//非空判断
		if(stu_idS!=null&&stu_idS.length()>0) {
			//赋值
			stu_id = Integer.parseInt(stu_idS);
		}
		if(book_idS!=null&&book_idS.length()>0) {
			book_id = Integer.parseInt(book_idS);
		}
		String order_ceil = request.getParameter("order_ceil");
		//调业务层方法
		OrderService orderService = new OrderServiceImpl();
		Order o = new Order(book_id, book_id, book_id, null, null, order_ceil, null, null);
		o.setStu_id(stu_id);
		o.setBook_id(book_id);
		o.setOrder_ceil(order_ceil);
		int count = orderService.add(o);
		if(count>0){
			request.getRequestDispatcher("orderSuccess.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("order.jsp").forward(request, response);
		}		
		
	}

}
