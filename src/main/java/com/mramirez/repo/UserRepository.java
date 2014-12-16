package com.mramirez.repo;

import org.springframework.data.repository.CrudRepository;

import com.mramirez.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
}