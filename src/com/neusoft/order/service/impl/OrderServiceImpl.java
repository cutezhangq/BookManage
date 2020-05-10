package com.neusoft.order.service.impl;

import java.util.List;

import com.neusoft.order.Dao.OrderDao;
import com.neusoft.order.Dao.impl.OrderDaoImpl;
import com.neusoft.order.entity.Order;
import com.neusoft.order.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao = new OrderDaoImpl();
	@Override
	public int add(Order o) {
		int count = orderDao.add(o);
		return count;
	}
	
	@Override
	public List<Order> showOrder(int id) {
		List<Order> orders = orderDao.showOrder(id);
		return orders;
	}
}
