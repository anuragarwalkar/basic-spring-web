package com.basic.spring.basicspring.services;

import com.basic.spring.basicspring.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
