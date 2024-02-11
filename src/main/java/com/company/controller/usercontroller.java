package com.company.controller;


import com.company.entity.user;

import com.company.service.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class usercontroller {

    @Autowired
    private userservice userService;

    @PostMapping
    public user createUser(@RequestBody user user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<user> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public user updateUser(@RequestBody user user, @PathVariable Long id) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    
}
