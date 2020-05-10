package com.neusoft.book.service.impl;

import java.util.List;

import com.neusoft.book.dao.BookDao;
import com.neusoft.book.dao.impl.BookDaoImpl;
import com.neusoft.book.entity.Book;
import com.neusoft.book.service.BookService;

public class BookServiceImpl implements BookService {
	//����Dao��ʵ�������
	private BookDao bkDao = new BookDaoImpl();
	
	//��ѯ����ͼ��
	@Override
	public List<Book> showAll(){
		List<Book> bookList = bkDao.showAll();
		return bookList;
	} 
	
	//���ͼ��
	@Override
	public int add(Book book){
		int count = bkDao.add(book);
		return count;
	}
	
	//��ҳ��ѯ
	@Override
	public List<Book> pageList(int index,int size){
		List<Book> bookList = bkDao.pageList(index, size);
		return bookList;
	}
	
	//��ѯ������
	@Override
	public int count(){
		int count = bkDao.count();
		return count;
	}		
	
	//ģ����ѯ
	@Override
	public List<Book> findByName(String name){
		List<Book> bookList = bkDao.findByName(name);
		return bookList;
	}
	
	//ɾ��
	@Override
	public void delete(int id){
		bkDao.delete(id);
	}
	
	//�޸�_��ѯ��Ӧ������(����Ψһ�������в�ѯ)
	@Override
	public Book findById(int id){
		Book b = bkDao.findById(id);
		return b;
	}
	
	//�޸�_�޸�
	@Override
	public void update(Book b){
		bkDao.update(b);
	}
	
}
