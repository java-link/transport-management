package com.javaplus.app.transport.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.javaplus.app.transport.model.User;

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
		return list.size() > 0 ? (User) list.get(0) : null;
	}
}
