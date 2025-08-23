package com.wipro.userms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.userms.entity.User;
import com.wipro.userms.repo.UserRepo;
import com.wipro.userms.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		
		Optional<User>optUser = userRepo.findById(id);
		if(optUser.isPresent()) {
			return optUser.get();
		}else {
		return null;
		}
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);

	}

	@Override
	public String login(User user) {
		// TODO Auto-generated method stub
		
		User userData = userRepo.findByEmailAndPassWord(user.getUserEmail(), user.getPassWord());
		if(userData!=null) {
			return "Sucess";
		}
		return null;
	}

}
