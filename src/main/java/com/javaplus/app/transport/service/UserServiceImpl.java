package com.javaplus.app.transport.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaplus.app.transport.dao.UserDao;
import com.javaplus.app.transport.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDao.list();
	}

	@Override
	@Transactional
	public User getUserById(final String userId) {
		return userDao.findUser(userId);
	}

}
