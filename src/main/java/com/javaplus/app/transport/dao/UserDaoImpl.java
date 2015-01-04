package com.javaplus.app.transport.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaplus.app.transport.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	 
    public UserDaoImpl() {
    }
 
    @Override
    @Transactional
    public List<User> list() {
        @SuppressWarnings("unchecked")
        List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listUser;
    }
   
    @Override
    @Transactional
    @SuppressWarnings("unchecked")
	public User findUser(final String userId) {
    	Session session = sessionFactory.getCurrentSession();
        List<User> list = session.createQuery("from User u where u.userId = :userId")
            .setParameter("userId", userId)
            .list();
        return list.size() > 0 ?(User)list.get(0): null;
    }
}
