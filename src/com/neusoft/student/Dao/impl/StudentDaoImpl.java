package com.neusoft.student.Dao.impl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.*;
import com.neusoft.student.Dao.StudentDao;
import com.neusoft.student.entity.Student;

public class StudentDaoImpl implements StudentDao {
	//Dao��ָData Access Object����д�������ݷ�֪�ʶ�����һ�����ģʽ��
	//���ṩ���ݵ���ɾ�Ĳ�Ĺ���
	
	//��½---���� ���ݿ�
	@Override
	public Student login(String username, String password) {
		//��ʼ��ʵ�������
		Student stu = null;
		//�������ݿ�����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8","root","123456");
			//����Stateme����,ִ��sql���
			Statement st = conn.createStatement();
			//����sql���
			String sql = "select * from studentinfo where stu_name ='"+username+"'  and stu_pwd='"+password+"'";
			//������������󣬽��ս��
			ResultSet rs = st.executeQuery(sql);
			//�ж��Ƿ�����������
			if(rs.next()){
				stu = new Student(rs.getInt(1),rs.getInt(2),rs.getString(3),
									rs.getString(4),rs.getString(5),rs.getInt(6),
									rs.getString(7),rs.getString(8),rs.getString(9),
									rs.getString(10));
			}
					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return stu;
	}
	
	

}
