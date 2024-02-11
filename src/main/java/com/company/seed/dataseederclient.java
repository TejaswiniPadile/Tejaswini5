package com.company.seed;


import com.company.entity.client;
import com.company.repository.clientrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dataseederclient implements CommandLineRunner {

    @Autowired
    private clientrepository clientRepository;

    @Override
    public void run(String... args) throws Exception {
        // Populate clients
        clientRepository.save(new client("Tejaswini", "tejaswini@example.com", "1234567890"));
        clientRepository.save(new client("Apeksha", "apeksha@example.com", "9876543210"));
    }
}
