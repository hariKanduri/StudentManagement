package com.student.service.impl;

import java.util.List;

import com.student.model.User;

public interface IUserService {

	public List<User> findAllUsers();
	public User findById(long id);
	public boolean isUserExist(User user);
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUserById(long id);
	public void deleteAllUsers();
	
}
