package com.neusoft.admin.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.admin.service.AdminService;
import com.neusoft.admin.service.impl.AdminServiceImpl;
import com.neusoft.student.entity.Student;

public class ad_RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		request.setCharacterEncoding("utf-8");		
		response.setCharacterEncoding("utf-8");
		//����ʵ������
		Student stu = new Student(0, 0, null, null, null, 0, null, null, null, null);
		AdminService adService = new AdminServiceImpl();
		//����ҳ�����
		//request.getparameter��ȡǰ̨����������������String���͵ģ�������Ҫǿת
//		System.out.println(request.getParameter("stu_number"));
		Integer number = Integer.parseInt(request.getParameter("stu_number"));
//		int number = Integer.parseInt(request.getParameter("stu_number"));
		String name = request.getParameter("stu_name");
		String pwd = request.getParameter("stu_pwd");
		String sex = request.getParameter("stu_sex");
		int age = Integer.parseInt(request.getParameter("stu_age"));
		String phone = request.getParameter("stu_phone");
		String stu_calss = request.getParameter("stu_class");
		String address = request.getParameter("stu_address");
		String path = request.getParameter("stu_path");
		//����ȡ�����ݣ�ͨ��set�������ŵ�������
		stu.setStu_number(number);
		stu.setStu_name(name);
		stu.setStu_pwd(pwd);
		stu.setStu_sex(sex);
		stu.setStu_age(age);
		stu.setStu_phone(phone);
		stu.setStu_class(stu_calss);
		stu.setStu_address(address);
		stu.setStu_address(path);
		//���÷������õ�count
		int count = adService.add(stu);
//		System.out.println(number);
		//������洢��request��������
		request.setAttribute("new_stu", stu);
		if(count > 0){
			request.getRequestDispatcher("registerSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

}

