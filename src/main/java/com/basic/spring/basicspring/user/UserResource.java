package com.basic.spring.basicspring.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;


    // RetrieveAllUsers
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // Get one user
    @GetMapping("/user/{id}")
    public User retrieveOneUser(@PathVariable int id) {
        return service.findOne(id);
    }

    // Create 
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User savedUser = service.save(user);
    }

}
