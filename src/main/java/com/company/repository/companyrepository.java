package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.company;

public interface companyrepository extends JpaRepository<company, Long> {
}