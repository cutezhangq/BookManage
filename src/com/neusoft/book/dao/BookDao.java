package com.neusoft.book.dao;

import java.util.List;

import com.neusoft.book.entity.Book;

public interface BookDao {
	//添加图书
	public int add(Book book);
	//列表查询
	public List<Book> showAll();
	//分页查询
	public List<Book> pageList(int index,int size);
	//查询总条数
	public int count();
	//模糊查询
	public List<Book> findByName(String name);
	//删除
	public void delete(int id);
	//修改---找到对应的数据(根据唯一主键进行查询)进行修改(修改这个对象)
	public Book findById(int id);
	public void update(Book b);
}
