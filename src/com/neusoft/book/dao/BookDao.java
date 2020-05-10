package com.neusoft.book.dao;

import java.util.List;

import com.neusoft.book.entity.Book;

public interface BookDao {
	//���ͼ��
	public int add(Book book);
	//�б��ѯ
	public List<Book> showAll();
	//��ҳ��ѯ
	public List<Book> pageList(int index,int size);
	//��ѯ������
	public int count();
	//ģ����ѯ
	public List<Book> findByName(String name);
	//ɾ��
	public void delete(int id);
	//�޸�---�ҵ���Ӧ������(����Ψһ�������в�ѯ)�����޸�(�޸��������)
	public Book findById(int id);
	public void update(Book b);
}
