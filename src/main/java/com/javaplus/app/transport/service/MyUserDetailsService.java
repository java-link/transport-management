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

public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	@Qualifier(value="userDao")
	private UserDao userDao;
	//private EntityManager entityManager;
    
	/*@PersistenceContext
    public void setEntityManager(EntityManager newEm){
        this.entityManager = newEm;
    }
*/
    public UserDetails loadUserByUsername(String username){
    	com.javaplus.app.transport.model.User user = userDao.findUser(username);
    	
    	if (user == null) {
    		return null;
    	}
    	GrantedAuthority role = new GrantedAuthority() {
			
			@Override
			public String getAuthority() {
				// TODO Auto-generated method stub
				return "ROLE_USER";
			}
		};
    	List<GrantedAuthority> roles = new ArrayList<>();
    	roles.add(role);
    	return new User(user.getUserId(), user.getPassword(), roles);
        /*// assuming that you have a User class that implements UserDetails
        return entityManager.createQuery(" from User where userId = :username", User.class)
                            .setParameter("userId", username)
                            .getSingleResult();*/

    }
}
