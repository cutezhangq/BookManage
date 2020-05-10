package com.neusoft.admin.entity;

public class Admin {
	
	public Admin(int admin_id, String admin_name, String admin_pwd, String admin_sex, String admin_phone,
			String admin_type, String admin_path) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_pwd = admin_pwd;
		this.admin_sex = admin_sex;
		this.admin_phone = admin_phone;
		this.admin_type = admin_type;
		this.admin_path = admin_path;
	}
	private int admin_id;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public String getAdmin_sex() {
		return admin_sex;
	}
	public void setAdmin_sex(String admin_sex) {
		this.admin_sex = admin_sex;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public String getAdmin_type() {
		return admin_type;
	}
	public void setAdmin_type(String admin_type) {
		this.admin_type = admin_type;
	}
	public String getAdmin_path() {
		return admin_path;
	}
	public void setAdmin_path(String admin_path) {
		this.admin_path = admin_path;
	}
	private String admin_name;
	private String admin_pwd;
	private String admin_sex;
	private String admin_phone;
	private String admin_type;
	private String admin_path;
}
