package com.felypeganzert.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felypeganzert.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
