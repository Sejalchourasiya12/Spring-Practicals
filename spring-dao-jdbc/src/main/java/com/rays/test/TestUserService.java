package com.rays.test;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;
import com.rays.service.UserServiceInt;

@Component("testUserService")
public class TestUserService {
	
	@Autowired
	public UserServiceInt service = null;
	
	public static void main(String[] args) throws Exception{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestUserService test = (TestUserService) context.getBean("testUserService");
		
		//test.testAdd();
		//test.testUpdate();
		//test.testDelete();
		//test.testfindByLogin();
		test.testSearch();
	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setId(3);
		dto.setFirstName("Miya");
		dto.setLastName("jain");
		dto.setLogin("siya@gmail.com");
		dto.setPassword("siya123");
        long pk = service.add(dto);
        System.out.println("Data Inserted.....pk = " +pk);
		
	}
	
	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("siya");
		dto.setLastName("jaina");
		dto.setLogin("siya@gmail.com");
		dto.setPassword("siya123");
		service.update(dto);	
		System.out.println("Data Updated Successfully");
		}
	
     public void testDelete() {
		UserDTO dto = new UserDTO();
		dto.setId(3);
		System.out.println("Data Deleted Successfully");
		
	}
     
     public void testfindByLogin() {
    	 UserDTO dto = service.findByLogin("sejal@gmail.com");
    	 System.out.println(dto.getId());
    	 System.out.println(dto.getFirstName());
 		System.out.println(dto.getLastName());
 		System.out.println(dto.getLogin());
 		System.out.println(dto.getPassword());
 		System.out.println("findby login");
		
		
    	 
     }
     
     private void testSearch() {
    	 UserDTO dto = new UserDTO();
    	 
    	 int pageNo = 1;
    	 int pageSize = 5;
    	 
    	 dto.setFirstName("sejal");
    	List<UserDTO> list = service.search(dto, pageNo, pageSize);
 		Iterator<UserDTO> it = list.iterator();
 		while(it.hasNext()) {
 			dto = it.next();
 			System.out.println(dto.getId());
 			System.out.println(dto.getFirstName());
 			System.out.println(dto.getLastName());
 			System.out.println(dto.getLogin());
 			System.out.println(dto.getPassword());
 			
 				
 			}
 		}
 		
 	}
     
	
	
	
	
	


