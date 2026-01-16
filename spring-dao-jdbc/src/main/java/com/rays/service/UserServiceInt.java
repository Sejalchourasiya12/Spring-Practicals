package com.rays.service;

import java.util.List;

import com.rays.dto.UserDTO;


public interface UserServiceInt {
	
    public long nextPK(UserDTO dto);
    
	public long add(UserDTO dto);

	public void update(UserDTO dto);
	
	public void delete(UserDTO dto);

	public UserDTO findByLogin(String login);

	public List<UserDTO> search(UserDTO dto, int pageNo, int pageSize);
	
	 

}
