package com.rays.dao;

import com.rays.dto.UserDTO;

public interface UserDAOInt {
	
	public long nextPK();

	public long add(UserDTO dto);

}
