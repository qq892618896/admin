package com.zq.entity;

import java.io.Serializable;

/**
 * zhaoqiang
 * 用户
 * @author Admin
 *
 */
public class SysUser implements Serializable {

	private String username;
	private String password;
	private String realname;

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

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
}
