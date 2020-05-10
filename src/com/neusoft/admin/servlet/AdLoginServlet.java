package com.neusoft.admin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.admin.entity.Admin;
import com.neusoft.admin.service.AdminService;
import com.neusoft.admin.service.impl.AdminServiceImpl;


public class AdLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		//接收页面参数
		String ad_username = request.getParameter("ad_username");
		String ad_password = request.getParameter("ad_password");
		//引用业务层方法，创建实例对象
		AdminService adService = new AdminServiceImpl();
		Admin ad = adService.login(ad_username,ad_password);
		//将对象存储到request作用域中
		request.setAttribute("ad", ad);
		//判断是否存在这个对象，进行不同的页面跳转
		if(ad!=null){
			request.getRequestDispatcher("adLoginSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("adLogin.jsp").forward(request, response);
		}
	}

}
