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
	//Dao是指Data Access Object的缩写，即数据访知问对象，是一种设计模式，
	//即提供数据的增删改查的功能
	
	//登陆---查找 数据库
	@Override
	public Student login(String username, String password) {
		//初始化实体类对象
		Student stu = null;
		//加载数据库驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8","root","123456");
			//创建Stateme对象,执行sql语句
			Statement st = conn.createStatement();
			//创建sql语句
			String sql = "select * from studentinfo where stu_name ='"+username+"'  and stu_pwd='"+password+"'";
			//创建结果集对象，接收结果
			ResultSet rs = st.executeQuery(sql);
			//判断是否存在这个对象
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
