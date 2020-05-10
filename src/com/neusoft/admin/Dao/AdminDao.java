package com.neusoft.admin.Dao;

import java.util.List;

import com.neusoft.admin.entity.Admin;
import com.neusoft.student.entity.Student;

//接口方法
public interface AdminDao {
	//管理员登陆
	public Admin login(String ad_username,String ad_password);
	
	//添加用户
	public int add(Student stu);
	
	//用户查询
	public List<Student> showAll_stu();
}
