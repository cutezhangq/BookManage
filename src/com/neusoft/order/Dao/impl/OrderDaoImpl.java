package com.neusoft.order.Dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.book.entity.Book;
import com.neusoft.order.Dao.OrderDao;
import com.neusoft.order.entity.Order;
import com.neusoft.student.entity.Student;
import com.neusoft.util.BaseDao;

public class OrderDaoImpl extends BaseDao implements OrderDao {
	@ Override
	public int add(Order o){
		int count = 0;
		String sql = "insert into orderinfo(stu_id,book_id,order_time,order_ceil) values(?,?,SYSDATE(),?)";
		count = super.update(sql, o.getStu_id(),o.getBook_id(),o.getOrder_ceil());
		return count;
	}
	
	@Override
	public List<Order> showOrder(int stu_id) {
		List<Order> orders = new ArrayList<Order>();
		String sql = "SELECT s.stu_name ,b.book_name,o.*" + 
					 " from bookinfo b,studentinfo s,orderinfo o" + 
					 " where b.book_id = o.book_id and o.stu_id = s.stu_id and s.stu_id=?";
		//���ø���ķ�����������stu_id
		super.query(sql,stu_id);
		try {
			//���������
			while(rs.next()){
				//���ڶ������,�����Ĺ�����---Student,Book
				Student stu = new Student(rs.getString(1));
				Book book  = new Book(rs.getString(2));
				//��3�ֶο�ʼ��ǰ���1,2�ֶ���������ȡ�����Ҫ�Ž�ȥstu��book
				Order o = new Order(rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getDate(6),rs.getDate(7),rs.getString(8),stu,book);
			orders.add(o);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orders;
	}
}
