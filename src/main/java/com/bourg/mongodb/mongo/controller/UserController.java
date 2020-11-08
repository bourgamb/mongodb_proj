package com.bourg.mongodb.mongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bourg.mongodb.mongo.model.User;
import com.bourg.mongodb.mongo.repository.UserRepository;

@RestController
@RequestMapping(value="/")
public class UserController {

	private final Logger log = LoggerFactory.getLogger(getClass());
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping(value = "")
	public List<User> getAllUsers(){
		log.info("Getting all users...");
		
		return userRepository.findAll();
	}
	
	@PostMapping(value = "/create")
	public User addNewUsers(@RequestBody User user) {
		log.info("Saving user.");
		return userRepository.save(user);
	}

}