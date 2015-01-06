package com.javaplus.app.transport.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaplus.app.transport.dao.UserDao;
import com.javaplus.app.transport.model.User;

@Service
public class UserServiceImpl implements UserService/*, UserDetailsService*/ {

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

	/*@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = getUserById(username);
		new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), true, true)
	}*/

}
