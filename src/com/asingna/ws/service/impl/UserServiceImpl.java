package com.asingna.ws.service.impl;

import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.asingna.ws.entity.User;
import com.asingna.ws.service.IUserService;

/**
 * <b>function:</b> WebService传递复杂对象，如JavaBean、Array、List、Map等
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserServiceImpl implements IUserService {
	public User getUserByName(@WebParam(name = "name") String name) {
		User user = new User();
		user.setId(new Date().getTime());
		user.setName(name);
		user.setAddress("china");
		user.setEmail(name + "@test.com");
		return user;
	}

	public void setUser(User user) {
		System.out.println("############Server setUser###########");
		System.out.println("setUser:" + user);
	}
}
