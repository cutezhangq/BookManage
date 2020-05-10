package com.neusoft.admin.service;

import java.util.List;

import com.neusoft.admin.entity.Admin;
import com.neusoft.student.entity.Student;

//业务层代码
public interface AdminService {
	//登陆方法
	public Admin login(String ad_username,String ad_password);
	
	//添加用户
	public int add(Student stu);
	
	//用户查询
	public List<Student> showAll_stu();
}
