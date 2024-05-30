package com.ewerton.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewerton.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
