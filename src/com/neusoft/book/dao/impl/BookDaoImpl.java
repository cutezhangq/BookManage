package com.neusoft.book.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.book.dao.BookDao;
import com.neusoft.book.entity.Book;
import com.neusoft.util.BaseDao;

public class BookDaoImpl extends BaseDao implements BookDao {
	//查询图书
	@Override
	public List<Book> showAll(){
		List<Book> bookList = new ArrayList<Book>();
		//加载数据库驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","123456");
			//创建Stateme对象,执行sql语句
			Statement st = conn.createStatement();
			//创建sql语句
			String sql = "select * from bookinfo";
			//创建结果集对象，接收结果
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
							rs.getDate(4),rs.getInt(5),rs.getString(6),rs.getString(7));
				bookList.add(book);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return bookList;
	}
	
	//添加图书
	@Override
	public int add(Book book){
		int count = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksystem?useUnicode=true&characterEncoding=UTF-8","root","123456");
			//创建Stateme对象,执行sql语句
			String sql = "insert into bookinfo(" +
		               "book_name,book_author,book_time,book_price," +
		               "book_press,book_path)" +
		               " values(?,?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setString(1, book.getBook_name());
		            ps.setString(2, book.getBook_author());
		            ps.setDate(3, book.getBook_time());
		            ps.setInt(4, book.getBook_price());
		            ps.setString(5, book.getBook_press());
		            ps.setString(6, book.getBook_path());
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	
	//分页查询
	@Override
	public List<Book> pageList(int index,int size){
		List<Book> bookList = new ArrayList<Book>();
		String sql = "select * from bookinfo limit ?,?";
		//这里的query是继承的BaseDao中的
		super.query(sql,(index-1)*size,size);
		//循环结果集
		try {
			while(rs.next()){
				Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getDate(4),rs.getInt(5),rs.getString(6),rs.getString(7));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	//查询总条数
	@Override
	public int count(){
		int count = 0;
		String sql = "select count(1) from bookinfo";
		super.query(sql);
		try {
			if(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	//模糊查询
	@Override
	public List<Book> findByName(String name){
		List<Book> bookList = new ArrayList<Book>();
		String sql = "select * from bookinfo where book_name like ?";
		super.query(sql, "%"+name+"%");
		try {
			while(rs.next()){
				Book book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getDate(4),rs.getInt(5),rs.getString(6),rs.getString(7));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bookList;
	}
	
	//删除
	@Override
	public void delete(int id){
		String sql = "delete from bookinfo where book_id=?";
		super.update(sql, id);
	}
	
	//修改_查询对应数据
	@Override
	public Book findById(int id){
		Book book = null;
		String sql = "select * from bookinfo where book_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				book = new Book(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getDate(4),rs.getInt(5),rs.getString(6),rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//修改_修改
	@Override
	public void update(Book b){
		//自增的话,mysql就不用将id字段再列出来了。oracle需要
		String sql = "update bookinfo set book_name=?,book_author=?,"
        + "book_time=?,book_price=?,book_press=?,book_path=? "
        + "where book_id=?";
		super.update(sql, b.getBook_name(),b.getBook_author(),b.getBook_time(),
							b.getBook_price(),b.getBook_press(),b.getBook_path(),b.getBook_id());
		
	}
}
