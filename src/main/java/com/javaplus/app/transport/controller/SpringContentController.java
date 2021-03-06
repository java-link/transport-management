package com.javaplus.app.transport.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javaplus.app.transport.dao.UserInfoDao;
import com.javaplus.app.transport.model.User;
import com.javaplus.app.transport.service.UserService;

@Controller
public class SpringContentController {
	
	private UserInfoDao userDao;
	private UserService userService;
	
	@Autowired
	public SpringContentController(UserInfoDao userDao, UserService service) {
		this.userDao = userDao;
		this.userService = service;
	}
	
	/*@Autowired UserDetails userDetails;
	@RequestMapping(value="/springcontent**",
			method=RequestMethod.GET,produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	UserDetails getUser(final Principal principal) {
		final String userId = principal.getName();
		return userDao.getUserDetails(userId);
	}*/
	
	
	@Autowired UserDetails userDetails;
	@RequestMapping(value="/springcontent**",
			method=RequestMethod.GET,produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	User getUser(final Principal principal) {
		final String userId = principal.getName();
		return userService.getUserById(userId);
	}
}
