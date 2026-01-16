package com.rays.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;


@Repository
public class UserDAOJdbcImpl implements UserDAOInt {

	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource = null;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public long nextPK() {
		String sql = "select max(id) from st_user";
		Long maxId = jdbcTemplate.queryForObject(sql, Long.class);
		if(maxId== null) {
			return 1;
		}
		return maxId+1;
	}

	public long add(UserDTO dto) {
		String sql = "insert into st_user values(?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, dto.getId(),dto.getFirstName(),dto.getLastName(),dto.getLogin(),dto.getPassword());
		
		return i;
	}

	public void update(UserDTO dto) {
		String sql = "update st_user set firstName = ?, lastName = ?, loginId = ?, password = ? where id = ?";
		int i = jdbcTemplate.update(sql, dto.getFirstName(),dto.getLastName(),dto.getLogin(), dto.getPassword(),dto.getId());
		}
	
	

	public void delete(UserDTO dto) {
		String sql = "delete from st_user where id = ?";
		int i = jdbcTemplate.update(sql, dto.getId());
	}
	
	
	

	
	public UserDTO findByLogin(String login) {
		String sql = "select * from st_user where loginId = ?";
		
		Object[] params = { login };
		UserDTO dto =jdbcTemplate.queryForObject(sql,params, new UserMapper());
		return dto;
	}

	public List<UserDTO> search() {
		StringBuffer sql = new StringBuffer("select * from st_user where 1= 1");
		
		List<UserDTO> list= jdbcTemplate.query(sql.toString(), new UserMapper());
		return list;
	}

	
		
		
	}
	
	
	


