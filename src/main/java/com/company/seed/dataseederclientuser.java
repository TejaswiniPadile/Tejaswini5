package com.company.seed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.company.entity.client;
import com.company.entity.clientuser;
import com.company.entity.user;
import com.company.repository.clientrepository;
import com.company.repository.clientusersrepository;
import com.company.repository.userrepository;

import java.time.LocalDateTime;

@Component
public class dataseederclientuser implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(dataseederclientuser.class);

    @Autowired
    private clientrepository clientRepository;

    @Autowired
    private userrepository userRepository;

    @Autowired
    private clientusersrepository clientUserRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        try {
            // Find or create clients and users
            client client1 = clientRepository.save(new client("Client 1", null, null));
            client client2 = clientRepository.save(new client("Client 2", null, null));
            
            user user1 = userRepository.save(new user("John Doe", "john@example.com", "123456"));
            user user2 = userRepository.save(new user("Jane Smith", "jane@example.com", "654321"));

            // Populate client users
            clientUserRepository.save(new clientuser(client1, user1, LocalDateTime.now(), LocalDateTime.now(), null, true));
            clientUserRepository.save(new clientuser(client1, user2, LocalDateTime.now(), LocalDateTime.now(), null, true));
            clientUserRepository.save(new clientuser(client2, user1, LocalDateTime.now(), LocalDateTime.now(), null, true));
            clientUserRepository.save(new clientuser(client2, user2, LocalDateTime.now(), LocalDateTime.now(), null, true));
            
            logger.info("Client user data seeded successfully.");
        } catch (Exception e) {
            logger.error("Error seeding client user data: {}", e.getMessage());
            throw e;
        }
    }
}
