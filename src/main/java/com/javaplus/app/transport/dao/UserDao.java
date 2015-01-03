package com.javaplus.app.transport.dao;

import java.util.List;

import com.javaplus.app.transport.model.User;

public interface UserDao {
	
	List<User> list();
	User findUser(String userId);
}
