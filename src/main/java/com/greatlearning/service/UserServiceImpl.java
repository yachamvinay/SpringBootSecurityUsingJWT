package com.greatlearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.greatlearning.entity.User;
import com.greatlearning.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User savecontact(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

}
