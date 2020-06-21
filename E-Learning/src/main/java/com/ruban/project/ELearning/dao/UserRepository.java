package com.ruban.project.ELearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ruban.project.ELearning.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserName(String userName); 
	
}
