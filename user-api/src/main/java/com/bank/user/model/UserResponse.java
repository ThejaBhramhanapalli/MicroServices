package com.bank.user.model;

public class UserResponse {

	private Long userId;
	private String userName;
	private StatusEnum userStatus;

	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserResponse(Long userId, String userName, StatusEnum userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userStatus = userStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public StatusEnum getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(StatusEnum userStatus) {
		this.userStatus = userStatus;
	}

	

}
