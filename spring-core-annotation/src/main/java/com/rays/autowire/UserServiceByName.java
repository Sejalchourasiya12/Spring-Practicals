package com.rays.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceByName {
	
	@Autowired// dependency inject krta h
	@Qualifier("userDao")//bean k name likhte h vo check krna bean h ya nhi
	private UserDAOInt userDao;
	
	public void testAdd() {
		userDao.add();
	}
	
	
	
	
	

}
