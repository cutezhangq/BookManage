package com.neusoft.admin.service;

import java.util.List;

import com.neusoft.admin.entity.Admin;
import com.neusoft.student.entity.Student;

//ҵ������
public interface AdminService {
	//��½����
	public Admin login(String ad_username,String ad_password);
	
	//����û�
	public int add(Student stu);
	
	//�û���ѯ
	public List<Student> showAll_stu();
}
