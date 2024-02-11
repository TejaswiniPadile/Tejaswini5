package com.company.seed;

import com.company.entity.user;
import com.company.repository.userrepository;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.stereotype.Component;

	@Component
	public class dataseeder implements CommandLineRunner {

	    @Autowired
	    private userrepository userRepository;

	    @Override
	    public void run(String... args) throws Exception {
	        // Populate users
	        userRepository.save(new user("John Doe", "john@example.com", "123456"));
	        userRepository.save(new user("Jane Smith", "jane@example.com", "654321"));
	    }

}
