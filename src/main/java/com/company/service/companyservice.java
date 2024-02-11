package com.company.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.company;
import com.company.repository.companyrepository;

@Service
public class companyservice {
   
	 @Autowired
	    private companyrepository companyRepository;

	    public List<company> getAllCompanies() {
	        return companyRepository.findAll();
	    }
	}

