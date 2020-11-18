package com.felypeganzert.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felypeganzert.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
