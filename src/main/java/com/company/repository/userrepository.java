package com.company.repository;

import com.company.entity.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<user, Long> {

	List<user> findByUsername(String username);

	

	
}