package com.company.service;


import com.company.entity.clientuser;


import com.company.repository.clientusersrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clientuserservice {

    @Autowired
    private clientusersrepository clientUserRepository;

    public clientuser createUser(clientuser clientUser) {
        return clientUserRepository.save(clientUser);
    }

    public List<clientuser> getAllClientUsers() {
        return clientUserRepository.findAll();
    }

    public Optional<clientuser> getClientUserById(Long id) {
        return clientUserRepository.findById(id);
    }

    public clientuser updateUser(clientuser clientUser, Long id) {
        Optional<clientuser> existingClientUserOptional = clientUserRepository.findById(id);
        if (existingClientUserOptional.isPresent()) {
            clientuser existingClientUser = existingClientUserOptional.get();
            existingClientUser.setClient(clientUser.getClient());
            existingClientUser.setUser(clientUser.getUser());
            // Set other fields if needed
            return clientUserRepository.save(existingClientUser);
        } else {
            // Handle not found case
            return null;
        }
    }

    public void deleteUser(Long id) {
        clientUserRepository.deleteById(id);
    }
}
