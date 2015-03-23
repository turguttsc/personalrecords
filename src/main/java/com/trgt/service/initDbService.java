package com.trgt.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trgt.entity.User;
import com.trgt.repository.UserRepository;


@Service
@Transactional
public class initDbService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@PostConstruct
	public void init(){
		
		mongoTemplate.dropCollection("user");
		
		User user = new User();
		user.setName("Ali");
		user.setSurname("tyuytuytu");
		user.setPhoneNum("53754026878");
		
		
        User user2 = new User();
		user2.setName("Hasan");
		user2.setSurname("xasasa");
		user2.setPhoneNum("XXXXXXXXX");
		
        User user3 = new User();
		
		user3.setName("Mehmet");
		user3.setSurname("asdasdasd");
		user3.setPhoneNum("XXXXXXXXX");
		
		
		userRepository.save(user);
		userRepository.save(user2);
		userRepository.save(user3);
		
	}
	
	
	
}
