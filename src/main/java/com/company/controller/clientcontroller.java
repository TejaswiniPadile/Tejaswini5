package com.company.controller;
import java.util.Optional;
import com.company.entity.client;
import com.company.service.clientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class clientcontroller {

    @Autowired
    private clientservice clientService;

    @PostMapping
    public client createClient(@RequestBody client newClient) {
        return clientService.createclient(newClient);
    }

    @GetMapping
    public List<client> getAllClients() {
        return clientService.getAllClients();
    }

    

    @PutMapping("/{id}")
    public client updateClient(@RequestBody client client, @PathVariable Long id) {
        return clientService.updateClient(client, id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
