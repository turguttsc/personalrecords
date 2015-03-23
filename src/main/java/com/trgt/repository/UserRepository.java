package com.trgt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trgt.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User , String > {

	
}
