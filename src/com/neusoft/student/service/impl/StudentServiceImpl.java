package com.neusoft.student.service.impl;

import com.neusoft.student.Dao.StudentDao;
import com.neusoft.student.Dao.impl.StudentDaoImpl;
import com.neusoft.student.entity.Student;
import com.neusoft.student.service.StudentService;
//implements是一个类实现(继承)一个接口用的 关键字
public class StudentServiceImpl implements StudentService {
	//创建dao层实现类对象
	private StudentDao stuDao = new StudentDaoImpl();
	
	@Override
	public Student login(String username, String password) {
		Student stu = stuDao.login(username,password);
		//将对象作为返回值返回
		return stu;
	}
	

}
