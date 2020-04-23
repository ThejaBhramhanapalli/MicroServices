package com.bank.user.controller;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.user.domain.UserEntity;
import com.bank.user.exception.UserNotFoundException;
import com.bank.user.model.UserResponse;
import com.bank.user.service.UserService;

@RestController
public class UserController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;

	@PostMapping(value = "/create-user")
	public UserResponse createUser(@RequestBody UserEntity userEntity) {

		UserResponse userResponse = userService.createUser(userEntity);
		LOGGER.debug("This is a debug message");
		LOGGER.info("This is an info message");
		LOGGER.warn("This is a warn message");
		LOGGER.error("This is an error message");

		return userResponse;
	}
	
	@GetMapping(value = "/get-user/{id}")
	public UserResponse getUser(@PathVariable Long id) throws UserNotFoundException {

		UserResponse userResponse = userService.getUser(id);
		LOGGER.debug("This is a debug message");
		LOGGER.info("This is an info message");
		LOGGER.warn("This is a warn message");
		LOGGER.error("This is an error message");

		return userResponse;
	}
}
