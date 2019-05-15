package com.ssm.dao;


import com.ssm.Entity.User;

public interface UserMapper {
	
	public User findUserById(Integer id);
	public User findUserByName(String username);
}
