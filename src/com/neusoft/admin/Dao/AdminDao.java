package com.neusoft.admin.Dao;

import java.util.List;

import com.neusoft.admin.entity.Admin;
import com.neusoft.student.entity.Student;

//�ӿڷ���
public interface AdminDao {
	//����Ա��½
	public Admin login(String ad_username,String ad_password);
	
	//����û�
	public int add(Student stu);
	
	//�û���ѯ
	public List<Student> showAll_stu();
}
