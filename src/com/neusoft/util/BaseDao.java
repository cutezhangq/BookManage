package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;	//���صĽ����
	static {
		//2.1  �������ݿ�����
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	protected  void open(){
		try {
			//2.2  �������ݿ�����
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=utf-8",
					"root", "123456");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int update(String sql, Object... params){
		int count=0;

		try {
			open();
			//2.3  �������󣬻�ȡ����ֵ
			ps = conn.prepareStatement(sql);
			//2.4 ѭ����������
			for(int i=0;i<params.length;i++){
				ps.setObject(i+1, params[i]);
			}
			//2.5��ȡ����ֵcount
			count = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			close();
		}
		return count;		
	}

	public ResultSet query(String sql, Object... params){

		try {
			open();
			//2.3  ִ执行SQL，获得结果集
			ps = conn.prepareStatement(sql);
			//2.4给占位符赋�?ֵ
			for(int i=0;i<params.length;i++){
				ps.setObject(i+1, params[i]);
			}
			//2.5 ִ执行
			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;		
	}

	public void close(){
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(ps!=null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
