package com.rays.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//this annotation is use for create service layer and also create bean
public class UserService {
	
	
	@Autowired //Autowired annotations inject dependency by type
	private UserDAOInt userDao;
	
	public void testAdd() {
		userDao.add();
	}
	
	

}
