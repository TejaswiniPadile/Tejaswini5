package com.company.seed;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.company.entity.company;
import com.company.repository.companyrepository;

@Component
public class dataseedercompany implements CommandLineRunner {

    @Autowired
    private companyrepository companyRepository;

    @Override
    public void run(String... args) throws Exception {
        // Populate companies
        companyRepository.save(new company("Aditi", "123 Main St, City", "1234567890"));
        companyRepository.save(new company("Priya", "456 Elm St, Town", "9876543210"));
    }
}
