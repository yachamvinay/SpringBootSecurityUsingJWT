package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Contact;
import com.greatlearning.entity.User;
import com.greatlearning.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user)
	{
		return userService.savecontact(user);
	}
}
