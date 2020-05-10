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
		//����ҳ�����
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//����ҵ��㷽��������ʵ������
		StudentService stuService = new StudentServiceImpl();
		Student stu = stuService.login(username,password);
		//������洢��request��������
		//request.setAttribute("stu", stu);
		//����½��session����ŵ���������
		HttpSession session = request.getSession();
		session.setAttribute("stu", stu);
		
		//�ж��Ƿ����������󣬽��в�ͬ��ҳ����ת
		if(stu!=null){
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
