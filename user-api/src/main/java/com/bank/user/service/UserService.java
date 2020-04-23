package com.bank.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bank.user.domain.UserEntity;
import com.bank.user.exception.UserNotFoundException;
import com.bank.user.model.StatusEnum;
import com.bank.user.model.UserResponse;
import com.bank.user.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public UserResponse createUser(UserEntity userEntity) {
		userEntity.setStatus("ACTIVE");
		UserEntity userEntity1 = userRepo.save(userEntity);
		UserResponse userResponse = new UserResponse(userEntity1.getUserId(), userEntity1.getUserName(), StatusEnum.ACTIVE);
		return userResponse;
	}

	public UserResponse getUser(Long id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional<UserEntity> userEntity1 = userRepo.findById(id);
		
		if(userEntity1.isEmpty()) throw new UserNotFoundException("User Id does not exist!!");
			new UserResponse(userEntity1.get().getUserId(), userEntity1.get().getUserName(), StatusEnum.valueOf(userEntity1.get().getStatus()));
		
		return new UserResponse(userEntity1.get().getUserId(), userEntity1.get().getUserName(), StatusEnum.valueOf(userEntity1.get().getStatus()));
	}
}
