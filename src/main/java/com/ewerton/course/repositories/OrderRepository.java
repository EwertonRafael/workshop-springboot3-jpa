package com.ewerton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewerton.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
