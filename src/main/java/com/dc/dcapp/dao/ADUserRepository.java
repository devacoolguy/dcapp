package com.dc.dcapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc.dcapp.model.ADUser;

public interface ADUserRepository extends JpaRepository<ADUser, Long> {
	
	ADUser findByEmail(String email);
}
