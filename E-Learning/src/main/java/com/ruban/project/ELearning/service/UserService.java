package com.ruban.project.ELearning.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ruban.project.ELearning.entity.User;

public interface UserService extends UserDetailsService {

	public User findByUserName (String userName);
	
}
