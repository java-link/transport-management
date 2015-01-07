package com.javaplus.app.transport.dao;

import java.util.List;

import com.javaplus.app.transport.model.User;
import com.javaplus.app.transport.security.model.LoginUser;

public interface UserDao {
	
	List<User> list();
	User findUser(String userId);
	
	LoginUser findLoginUser(String userId);
}
