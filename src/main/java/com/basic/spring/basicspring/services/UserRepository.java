package com.basic.spring.basicspring.services;

import com.basic.spring.basicspring.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
