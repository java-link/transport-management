package com.javaplus.app.transport.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

 
	@RequestMapping(value = {"/**",  "/welcome**"}, method = RequestMethod.GET)
	public String adminPage(Principal principal) {
		return "loginPage";
	}
	
	@RequestMapping(value = {"/secured**", "/loginPage"}, method = RequestMethod.GET)
    public String loginPage() {
        return "loginsuccess";
    }
	
}
