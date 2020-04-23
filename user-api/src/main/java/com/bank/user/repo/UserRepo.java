package com.bank.user.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.user.domain.UserEntity;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long>{

}
