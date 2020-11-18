package com.felypeganzert.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felypeganzert.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
