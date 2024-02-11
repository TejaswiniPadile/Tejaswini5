package com.company.repository;


import com.company.entity.clientuser;
import com.company.entity.company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface clientusersrepository extends JpaRepository<clientuser, Long> {
}