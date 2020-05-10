package com.neusoft.admin.service.impl;

import java.util.List;

import com.neusoft.admin.Dao.AdminDao;
import com.neusoft.admin.Dao.impl.AdminDaoImpl;
import com.neusoft.admin.entity.Admin;
import com.neusoft.admin.service.AdminService;
import com.neusoft.student.entity.Student;

public class AdminServiceImpl implements AdminService {
	//创建dao层实现类对象
	private AdminDao adDao = new AdminDaoImpl();
	
	//管理员登陆
	@Override
	public Admin login(String ad_username,String ad_password){
		Admin ad = adDao.login(ad_username, ad_password);
		return ad;
	}
	
	//添加用户
	// @Override帮助自己检查是否正确的复写了父类中已有的方法
	@Override
	public int add(Student stu){
		int count = adDao.add(stu);
		return count;
	}
	
	//查询用户
	@Override
	public List<Student> showAll_stu(){
		List<Student> stuList = adDao.showAll_stu();
		return stuList;
	}
}
