package com.tcs.RetailBank.Bean;

public class LoginBean {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

}
