package com.bank.user;

import com.bank.user.domain.UserEntity;
import com.bank.user.model.StatusEnum;
import com.bank.user.model.UserResponse;

public class TestConfigurations {

	public static UserResponse createUserResponse() {
		
		UserResponse userResponse = new UserResponse();
		userResponse.setUserId(1L);
		userResponse.setUserName("AAA");
		userResponse.setUserStatus(StatusEnum.ACTIVE);
		return userResponse;
	}

	public static UserEntity createUserRequest() {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		userEntity.setUserName("AAA");
		userEntity.setStatus(StatusEnum.ACTIVE.name());
		userEntity.setPwd("AAA");
		return userEntity;
	}
}
