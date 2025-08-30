package com.wipro.userms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.userms.dto.Token;
import com.wipro.userms.entity.User;
import com.wipro.userms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity save(@RequestBody User user) {
		return userService.save(user);
		
	}
	
	@GetMapping
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("/login/{id}")
	public User findById(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@PutMapping("/login/{id}")
	public ResponseEntity updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.update(id, user);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteUser(@PathVariable int id) {
		return userService.delete(id);
	}
	
	@GetMapping("/menu/{id}") /// need clarification 
	public User userMenu(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@PostMapping("/login")
	public Token login(@RequestBody User user) {
		return userService.login(user);
	}
	
	@GetMapping("/logout/{userId}")
	public void logout(@PathVariable int userId) {
		System.out.println("user id is"+userId);
		
		userService.logout(userId);
	}

}
