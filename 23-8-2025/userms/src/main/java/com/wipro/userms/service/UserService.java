package com.wipro.userms.service;

import java.util.List;

import com.wipro.userms.entity.User;

public interface UserService {
	
	List<User> findAll();
	User findById(int id);
	void save(User user);
	void deleteById(int id);
	String login(User user);

}
