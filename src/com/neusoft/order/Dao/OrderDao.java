package com.neusoft.order.Dao;

import java.util.List;
import com.neusoft.order.entity.Order;

public interface OrderDao {
	//�����鼮--���
	int add(Order o);
	//��ѯ����--�û����Լ��Ķ���������ǹ���Ա��Ļ���ֱ��select *����
	public List<Order> showOrder(int stu_id);
	//�黹�鼮
	
}
