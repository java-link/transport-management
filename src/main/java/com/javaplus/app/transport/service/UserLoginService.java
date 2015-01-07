package com.javaplus.app.transport.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.javaplus.app.transport.dao.UserDao;
import com.javaplus.app.transport.security.constants.RoleType;
import com.javaplus.app.transport.security.model.LoginUser;

public class UserLoginService implements UserDetailsService{
	
	@Autowired
	@Qualifier(value="userDao")
	private UserDao userDao;

	public UserDetails loadUserByUsername(String username){
    	LoginUser user = userDao.findLoginUser(username);
    	
    	if (user == null) {
    		return null;
    	}
    	
    	return new User(user.getUserId(), user.getPassword(), populateRoles(user));
    }
	
	@SuppressWarnings("serial")
	List<GrantedAuthority> populateRoles(final LoginUser user) {
		final List<GrantedAuthority> roles = new ArrayList<>();
		for (final RoleType role : user.getRoles()) {
			roles.add(new GrantedAuthority() {
				
				@Override
				public String getAuthority() {
					return role.getName();
				}
			});
		}
		return roles;
	}
	
}
