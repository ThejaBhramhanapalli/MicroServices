package com.bank.user.domain;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_USER")
public class AuthUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "PWD")
	private String pwd;
	@Column(name = "ROLE")
	private String role;

	public AuthUser(Long id, String userName, String pwd, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AuthUser [id=" + id + ", userName=" + userName + ", pwd=" + pwd + ", role=" + role + ", getId()="
				+ getId() + ", getUserName()=" + getUserName() + ", getPwd()=" + getPwd() + ", getRole()=" + getRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
