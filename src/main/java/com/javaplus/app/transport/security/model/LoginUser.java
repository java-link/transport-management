package com.javaplus.app.transport.security.model;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.javaplus.app.transport.security.constants.RoleType;

@Entity
@Table(name = "LOGIN_USER")
public class LoginUser {

	private String userId;
	private String password;
	private Set<RoleType> roles;
	
	@Id
	@Column(name = "USER_ID")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ElementCollection(targetClass = RoleType.class, fetch=FetchType.EAGER)
	@CollectionTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_ID"))
	@Column(name = "ROLE_ID", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	public Set<RoleType> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<RoleType> roles) {
		this.roles = roles;
	}
}
