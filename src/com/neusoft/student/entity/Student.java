package com.neusoft.student.entity;

public class Student {
	/*
	 * Entity（PO）每个属性基本上都对应数据库表里面的某个字段。
	 * 完全是一个符合Java Bean规范的纯Java对象，没有增加别的属性和方法
	 * 
	 * 成员变量都是私有的
	 * 成员变量的数据类型一定要和数据库匹配
	 * 
	 * */
	public Student(int stu_id, int stu_number, String stu_name, String stu_pwd, String stu_sex, int stu_age,
			String stu_phone, String stu_class, String stu_address, String stu_path) {
		super();
		this.stu_id = stu_id;
		this.stu_number = stu_number;
		this.stu_name = stu_name;
		this.stu_pwd = stu_pwd;
		this.stu_sex = stu_sex;
		this.stu_age = stu_age;
		this.stu_phone = stu_phone;
		this.stu_class = stu_class;
		this.stu_address = stu_address;
		this.stu_path = stu_path;
	}
	//多表连接后加上的构造器
	//订单管理中会查询到stu_name，所以单独加上
	public Student(String stu_name){
		super();
		this.stu_name = this.stu_name;
	}
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public int getStu_number() {
		return stu_number;
	}
	public void setStu_number(int stu_number) {
		this.stu_number = stu_number;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_pwd() {
		return stu_pwd;
	}
	public void setStu_pwd(String stu_pwd) {
		this.stu_pwd = stu_pwd;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public int getStu_age() {
		return stu_age;
	}
	public void setStu_age(int stu_age) {
		this.stu_age = stu_age;
	}
	public String getStu_phone() {
		return stu_phone;
	}
	public void setStu_phone(String stu_phone) {
		this.stu_phone = stu_phone;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stu_class) {
		this.stu_class = stu_class;
	}
	public String getStu_address() {
		return stu_address;
	}
	public void setStu_address(String stu_address) {
		this.stu_address = stu_address;
	}
	public String getStu_path() {
		return stu_path;
	}
	public void setStu_path(String stu_path) {
		this.stu_path = stu_path;
	}
	private int stu_id;
	private int stu_number;
	private String stu_name;
	private String stu_pwd;
	private String stu_sex;
	private int	stu_age;
	private String stu_phone;
	private String stu_class;
	private String stu_address;
	private String stu_path;
}
