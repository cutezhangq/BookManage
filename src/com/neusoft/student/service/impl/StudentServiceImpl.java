package com.neusoft.student.service.impl;

import com.neusoft.student.Dao.StudentDao;
import com.neusoft.student.Dao.impl.StudentDaoImpl;
import com.neusoft.student.entity.Student;
import com.neusoft.student.service.StudentService;
//implements��һ����ʵ��(�̳�)һ���ӿ��õ� �ؼ���
public class StudentServiceImpl implements StudentService {
	//����dao��ʵ�������
	private StudentDao stuDao = new StudentDaoImpl();
	
	@Override
	public Student login(String username, String password) {
		Student stu = stuDao.login(username,password);
		//��������Ϊ����ֵ����
		return stu;
	}
	

}
