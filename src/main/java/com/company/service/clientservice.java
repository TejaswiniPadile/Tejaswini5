package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.company.repository.clientrepository;
import com.company.entity.client;


import java.util.List; // Import List class

@Service
public class clientservice {
	
    @Autowired
    private clientrepository clientRepository;

    public List<client> getAllClients() {
        return clientRepository.findAll();
    }

	public client createclient(client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getClientById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public client updateClient(client client, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		
	}


	}


