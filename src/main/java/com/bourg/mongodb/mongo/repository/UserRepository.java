package com.bourg.mongodb.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bourg.mongodb.mongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
