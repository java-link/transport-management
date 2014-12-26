package com.javaplus.app.transport.controller;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDetails {

	private String loginId;
	private String userName;
	private String emailId;
	private int id;

	public UserDetails() {

	}

	public UserDetails(int id, String loginId, String userName, String emailId) {
		this.id = id;
		this.loginId = loginId;
		this.userName = userName;
		this.emailId = emailId;
	}

	@XmlAttribute
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlAttribute
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlAttribute
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

}
