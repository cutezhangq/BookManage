package com.neusoft.order.service;

import java.util.List;

import com.neusoft.order.entity.Order;

public interface OrderService {
	public int add(Order o);
	public List<Order> showOrder(int id);
}
