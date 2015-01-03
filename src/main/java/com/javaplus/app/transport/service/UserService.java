package com.javaplus.app.transport.service;

import java.util.List;

import com.javaplus.app.transport.model.User;

public interface UserService {

	List<User> getAllUsers();
	User getUserById(String userId);
}
