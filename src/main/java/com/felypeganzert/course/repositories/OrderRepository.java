package com.felypeganzert.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felypeganzert.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
