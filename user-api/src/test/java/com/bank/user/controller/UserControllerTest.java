package com.bank.user.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bank.user.TestConfigurations;
import com.bank.user.domain.UserEntity;
import com.bank.user.model.UserResponse;

@SpringBootTest
class UserControllerTest {

	@Autowired
	UserController userController;
	
	
	@Test
	void test() {
		assertTrue(true);
	}
	
	@Test
	void validate_create_user() {
		UserEntity MOCK_USER_REQUEST = TestConfigurations.createUserRequest();
		UserResponse EXPECTED_USERRESPONSE = TestConfigurations.createUserResponse();
		UserResponse ACTUAL_USERRESPONSE = userController.createUser(MOCK_USER_REQUEST);
		//assertEquals(MOCK_CREATE_USERRESPONSE, userController.createUser(MOCK_USER_REQUEST));
		
		assertNotNull(ACTUAL_USERRESPONSE);
		assertEquals(EXPECTED_USERRESPONSE.getUserId(), ACTUAL_USERRESPONSE.getUserId());
		assertEquals(EXPECTED_USERRESPONSE.getUserName(), ACTUAL_USERRESPONSE.getUserName());
		
	}

}
