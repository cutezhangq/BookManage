package com.neusoft.admin.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.admin.service.AdminService;
import com.neusoft.admin.service.impl.AdminServiceImpl;
import com.neusoft.student.entity.Student;


public class stu_ShowAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminService adService = new AdminServiceImpl();
		List<Student> stuList = adService.showAll_stu();
		//将数据存放到request作用域中
		request.setAttribute("stuList",stuList);
//		System.out.println(request.getAttribute("stuList"));
		//将数据转发到JSP
		request.getRequestDispatcher("manager_user.jsp").forward(request, response);
	}

}
