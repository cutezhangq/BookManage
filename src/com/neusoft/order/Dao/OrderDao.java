package com.neusoft.order.Dao;

import java.util.List;
import com.neusoft.order.entity.Order;

public interface OrderDao {
	//借阅书籍--添加
	int add(Order o);
	//查询订单--用户查自己的订单，如果是管理员查的话，直接select *即可
	public List<Order> showOrder(int stu_id);
	//归还书籍
	
}
