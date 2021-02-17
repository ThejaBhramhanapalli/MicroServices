package com.bank.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_ENTITY")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PWD")
	private String pwd;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "MSG")
	private int msg;
	

	/*
	 * public UserEntity() { // TODO Auto-generated constructor stub }
	 * 
	 * public UserEntity(Long userId, String userName, String pwd, String status,
	 * int msg) { super(); this.userId = userId; this.userName = userName; this.pwd
	 * = pwd; this.status = status; this.msg=msg; }
	 * 
	 * public Long getUserId() { return userId; }
	 * 
	 * public void setUserId(Long userId) { this.userId = userId; }
	 * 
	 * public String getUserName() { return userName; }
	 * 
	 * public void setUserName(String userName) { this.userName = userName; }
	 * 
	 * public String getPwd() { return pwd; }
	 * 
	 * public void setPwd(String pwd) { this.pwd = pwd; }
	 * 
	 * public String getStatus() { return status; }
	 * 
	 * public void setStatus(String status) { this.status = status; }
	 * 
	 * public int getMsg() { return msg; }
	 * 
	 * public void setMsg(int msg) { this.msg = msg; }
	 */
	
	

}
