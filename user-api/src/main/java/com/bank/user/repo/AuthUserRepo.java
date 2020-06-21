package com.bank.user.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bank.user.domain.AuthUser;
import com.bank.user.domain.UserEntity;

public interface AuthUserRepo extends CrudRepository<AuthUser, String>{

	Optional<AuthUser> findByUserName(String userName);
}
