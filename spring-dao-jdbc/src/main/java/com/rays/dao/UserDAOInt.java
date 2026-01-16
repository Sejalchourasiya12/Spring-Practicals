package com.rays.dao;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long nextPK();

	public long add(UserDTO dto);
	
	public void delete(UserDTO dto);
	
	public void update(UserDTO dto);
	
	public UserDTO findByLogin(String login);
	
	public List<UserDTO> search();

}
