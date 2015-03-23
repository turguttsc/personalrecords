package com.trgt.service;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trgt.entity.User;
import com.trgt.repository.UserRepository;




@Service
@Transactional
public class UserService  {

	@Autowired
	private UserRepository userRepository;

	public User save(User user) {
	//	user.setId(UUID.randomUUID().toString());
		return userRepository.save(user);	
	}
		
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	public void delete(User user){
		userRepository.delete(user);
	}
	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	

	
}
