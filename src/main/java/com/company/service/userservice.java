

package com.company.service;



import com.company.entity.user;
import com.company.repository.userrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userservice {

    @Autowired
    private userrepository userRepository;

    public user createUser(user user) {
        return userRepository.save(user);
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<user> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public user updateUser(user newUser, Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    user.setPhone(newUser.getPhone());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

	
	}

