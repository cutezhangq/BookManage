package com.neusoft.student.Dao;

import com.neusoft.student.entity.Student;

public interface StudentDao {
	/*
	 * 登陆
	 * 1.需要2个参数去接收页面传递的参数
	 * 2.将参数传到后台，进行数据库查询
	 * 3.查询结果是对象--->
	 * */
	//用户登陆
	public Student login(String username,String password);
	

}
