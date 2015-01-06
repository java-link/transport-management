package com.javaplus.app.transport.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.javaplus.app.transport.controller.UserDetails;

@Component(value="userInfoDao")
public class UserInfoDao {
	
	private static Map<String, UserDetails> userDetailsMap = new HashMap<>();
	
	static {
		UserDetails shishir = new UserDetails(501, "jainnshi", "Shishir Jain", "jainshi@gmail.com");
		UserDetails sachin = new UserDetails(502, "survesac", "Sachin Surve", "survesachin@gmail.com");
		UserDetails kiran = new UserDetails(503, "patilkir", "Kiran Patil", "patilkiran@gmail.com");
		
		userDetailsMap.put("jainnshi", shishir);
		userDetailsMap.put("survesac", sachin);
		userDetailsMap.put("patilkir", kiran);
	}
	
	public UserDetails getUserDetails(String loginId) {
		return userDetailsMap.get(loginId);
	}
	
}
