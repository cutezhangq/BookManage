package com.neusoft.order.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.order.entity.Order;
import com.neusoft.order.service.OrderService;
import com.neusoft.order.service.impl.OrderServiceImpl;


public class ShowOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    
		request.setCharacterEncoding("utf-8");    
		response.setCharacterEncoding("utf-8");
		//��ҵ��㷽��
		OrderService orderService = new OrderServiceImpl();
		//����id���ܵ�ǰ�Ѿ���¼�˵��û�id�����ڵײ�����ѯ����
		int id = Integer.parseInt(request.getParameter("stu_id"));
		List<Order> orders = orderService.showOrder(id);
		HttpSession session = request.getSession();
		session.setAttribute("orders",orders);
		request.getRequestDispatcher("orderShow.jsp").forward(request, response);
	}

}
