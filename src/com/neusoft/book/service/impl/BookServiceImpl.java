package com.neusoft.book.service.impl;

import java.util.List;

import com.neusoft.book.dao.BookDao;
import com.neusoft.book.dao.impl.BookDaoImpl;
import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;

public class BookServiceImpl implements BookService {
	//创建Dao层实现类对象
	private BookDao bkDao = new BookDaoImpl();
	
	//查询所有图书
	@Override
	public List<Book> showAll(){
		List<Book> bookList = bkDao.showAll();
		return bookList;
	} 
	
	//添加图书
	@Override
	public int add(Book book){
		int count = bkDao.add(book);
		return count;
	}
	
	//分页查询
	@Override
	public List<Book> pageList(int index,int size){
		List<Book> bookList = bkDao.pageList(index, size);
		return bookList;
	}
	
	//查询总条数
	@Override
	public int count(){
		int count = bkDao.count();
		return count;
	}		
	
	//模糊查询
	@Override
	public List<Book> findByName(String name){
		List<Book> bookList = bkDao.findByName(name);
		return bookList;
	}
	
	//删除
	@Override
	public void delete(int id){
		bkDao.delete(id);
	}
	
	//修改_查询对应的数据(根据唯一主键进行查询)
	@Override
	public Book findById(int id){
		Book b = bkDao.findById(id);
		return b;
	}
	
	//修改_修改
	@Override
	public void update(Book b){
		bkDao.update(b);
	}
	
}
