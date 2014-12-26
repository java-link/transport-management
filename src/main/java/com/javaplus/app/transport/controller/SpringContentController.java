package com.javaplus.app.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringContentController {
	@Autowired UserDetails userDetails;
	@RequestMapping(value="/springcontent**",
			method=RequestMethod.GET,produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	UserDetails getUser() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(501);
		userDetails.setUserName("Shishir Jain");
		userDetails.setEmailId("jainshi@gmail.com");
		return userDetails;
	}
	
	@RequestMapping(value = "/welcomePage", method = RequestMethod.GET)
	public ModelAndView adminPage() {
 
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("secured/welcomePage");
 
		return model;
 
	}
	
    @RequestMapping(value = "/logoutPage", method = RequestMethod.GET)
    public String logoutPage() {
        return "logoutPage";
    }
	
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "loginPage";
    }
	
}
