package com.gl.srs.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.srs.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("Select u from User u where u.username = ?1")
	User getUserByUsername(String username);

}
