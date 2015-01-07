package com.javaplus.app.transport.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.javaplus.app.transport.model.User;
import com.javaplus.app.transport.security.model.LoginUser;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	 
    public UserDaoImpl() {
    }
 
    @SuppressWarnings("unchecked")
	@Override
    @Transactional
    public List<User> list() {
    	return entityManager.createQuery(" from " + User.class.getName()).getResultList();
    }
   
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public User findUser(final String userId) {
		List<User> list = entityManager
				.createQuery("SELECT OBJECT(u) FROM User u WHERE u.userId = :userId")
				.setParameter("userId", userId)
				.getResultList();
		
		return list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public LoginUser findLoginUser(String userId) {
		@SuppressWarnings("unchecked")
		List<LoginUser> loginUserList = entityManager
				.createQuery("SELECT OBJECT(u) FROM LoginUser u WHERE u.userId = :userId")
				.setParameter("userId", userId).getResultList();
		return loginUserList.size() > 0 ? loginUserList.get(0) : null;
	}
}
