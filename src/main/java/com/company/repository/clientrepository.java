package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.entity.client;

public interface clientrepository extends JpaRepository<client, Long> {
}