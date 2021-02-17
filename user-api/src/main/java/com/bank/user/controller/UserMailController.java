package com.bank.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.user.domain.UserEntity;
import com.bank.user.exception.UserNotFoundException;
import com.bank.user.model.Mail;
import com.bank.user.model.UserResponse;
import com.bank.user.service.MailService;
import com.bank.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserMailController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	MailService mailService;
	
	@PostMapping(value = "/send-mail")
	public void sendMail(@RequestBody Mail mail) throws UserNotFoundException {
		//Mail mail = new Mail();
		/*
		 * mail.setMailFrom("theja.b505@gmail.com");
		 * mail.setMailTo("btheja123@gmail.com");
		 * mail.setMailSubject("Spring Boot - Email Example"); mail.
		 * setMailContent("Learn How to send Email using Spring Boot!!!\n\nThanks\n");*/
		 mailService.sendEmail(mail);
		 
        log.info(mail.toString());
		//UserResponse userResponse = userService.getUser(userEntity.getUserId());
		log.debug("This is a debug message");
		log.info("This is an info message");
		log.warn("This is a warn message");
		log.error("This is an error message");

	}
}
