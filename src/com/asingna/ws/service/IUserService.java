package com.asingna.ws.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.asingna.ws.entity.User;

@WebService
@SOAPBinding(style =SOAPBinding.Style.RPC)
public interface IUserService {
	public User getUserByName(@WebParam(name = "name") String name);

	public void setUser(User user);
}
