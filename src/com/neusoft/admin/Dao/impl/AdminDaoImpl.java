package com.neusoft.admin.Dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.admin.Dao.AdminDao;
import com.neusoft.admin.entity.Admin;
import com.neusoft.student.entity.Student;

//ʵ����
public class AdminDaoImpl implements AdminDao {
	
	//��½---���� ���ݿ�
	@Override
	public Admin login(String ad_username,String ad_password){
		//��ʼ��ʵ�������
		Admin ad = null;
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
			String sql = "select * from admininfo where admin_name ='"+ad_username+"'  and admin_pwd='"+ad_password+"'";
			//������������󣬽��ս��
			ResultSet rs = st.executeQuery(sql);
			//�ж��Ƿ�����������
			if(rs.next()){
				ad = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getString(4),rs.getString(5),rs.getString(6),
									rs.getString(7));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	return ad;
	}
	
	//�����û�---���� ���ݿ�
	@Override
	public int add(Student stu){
		int count = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8","root","123456");
			//����Stateme����,ִ��sql���
			String sql = "insert into studentinfo(" +
		               "stu_number,stu_name,stu_pwd,stu_sex," +
		               "stu_age,stu_phone,stu_class,stu_address,stu_path)" +
		               " values(?,?,?,?,?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setInt(1, stu.getStu_number());
		            ps.setString(2, stu.getStu_name());
		            ps.setString(3, stu.getStu_pwd());
		            ps.setString(4, stu.getStu_sex());
		            ps.setInt(5, stu.getStu_age());
		            ps.setString(6, stu.getStu_phone());
		            ps.setString(7, stu.getStu_class());
		            ps.setString(8, stu.getStu_address());
		            ps.setString(9, stu.getStu_path());
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	
	//��ѯ�û�---���� ���ݿ�
	@Override
	public List<Student> showAll_stu(){
		List<Student> stuList = new ArrayList<Student>();
		//�������ݿ�����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","123456");
			//����Stateme����,ִ��sql���
			Statement st = conn.createStatement();
			//����sql���
			String sql = "select * from studentinfo";
			//������������󣬽��ս��
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				Student student = new Student(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),
							rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),
							rs.getString(9),rs.getString(10));
				stuList.add(student);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return stuList;
	}
	
}
