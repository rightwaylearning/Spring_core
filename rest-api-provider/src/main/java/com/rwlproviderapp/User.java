package com.rwlproviderapp;

public class User {

	private String userName;
	private Integer userId;
	
	public User() {}

	
	public User(String userName, Integer userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + "]";
	}
	
	
}
