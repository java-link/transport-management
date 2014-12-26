package com.javaplus.app.transport.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javaplus.app.transport.dao.UserDao;

@Controller
public class SpringContentController {
	@Autowired UserDetails userDetails;
	@RequestMapping(value="/springcontent**",
			method=RequestMethod.GET,produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	UserDetails getUser(Principal principal) {
		String userId = principal.getName();
		UserDao dao = new UserDao();
		return dao.getUserDetails(userId);
	}
	
}
