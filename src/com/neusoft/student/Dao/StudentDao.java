package com.neusoft.student.Dao;

import com.neusoft.student.entity.Student;

public interface StudentDao {
	/*
	 * ��½
	 * 1.��Ҫ2������ȥ����ҳ�洫�ݵĲ���
	 * 2.������������̨���������ݿ��ѯ
	 * 3.��ѯ����Ƕ���--->
	 * */
	//�û���½
	public Student login(String username,String password);
	

}
