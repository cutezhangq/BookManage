package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;	//返回的结果集
	static {
		//2.1  加载数据库驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	protected  void open(){
		try {
			//2.2  创建数据库连接
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
			//2.3  创建对象，获取返回值
			ps = conn.prepareStatement(sql);
			//2.4 循环遍历数组
			for(int i=0;i<params.length;i++){
				ps.setObject(i+1, params[i]);
			}
			//2.5获取返回值count
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
			//2.3  执鎵цSQL锛岃幏寰楃粨鏋滈泦
			ps = conn.prepareStatement(sql);
			//2.4缁欏崰浣嶇璧嬪?值
			for(int i=0;i<params.length;i++){
				ps.setObject(i+1, params[i]);
			}
			//2.5 执鎵ц
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
