package com.dbs.twitterapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbs.twitterapp.model.User;

public interface UserDao  extends CrudRepository<User, Long> {
	User findByName(String name);
	User findByPassword(String password);
}


