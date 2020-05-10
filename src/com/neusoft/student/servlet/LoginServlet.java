package com.neusoft.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.student.entity.Student;
import com.neusoft.student.service.StudentService;
import com.neusoft.student.service.impl.StudentServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		//接收页面参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//引用业务层方法，创建实例对象
		StudentService stuService = new StudentServiceImpl();
		Student stu = stuService.login(username,password);
		//将对象存储到request作用域中
		//request.setAttribute("stu", stu);
		//将登陆的session对象放到作用域中
		HttpSession session = request.getSession();
		session.setAttribute("stu", stu);
		
		//判断是否存在这个对象，进行不同的页面跳转
		if(stu!=null){
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
