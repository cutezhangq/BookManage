package com.neusoft.admin.service.impl;

import java.util.List;

import com.neusoft.admin.Dao.AdminDao;
import com.neusoft.admin.Dao.impl.AdminDaoImpl;
import com.neusoft.admin.entity.Admin;
import com.neusoft.admin.service.AdminService;
import com.neusoft.student.entity.Student;

public class AdminServiceImpl implements AdminService {
	//����dao��ʵ�������
	private AdminDao adDao = new AdminDaoImpl();
	
	//����Ա��½
	@Override
	public Admin login(String ad_username,String ad_password){
		Admin ad = adDao.login(ad_username, ad_password);
		return ad;
	}
	
	//����û�
	// @Override�����Լ�����Ƿ���ȷ�ĸ�д�˸��������еķ���
	@Override
	public int add(Student stu){
		int count = adDao.add(stu);
		return count;
	}
	
	//��ѯ�û�
	@Override
	public List<Student> showAll_stu(){
		List<Student> stuList = adDao.showAll_stu();
		return stuList;
	}
}
