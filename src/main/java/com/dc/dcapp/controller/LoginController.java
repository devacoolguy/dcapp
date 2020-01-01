package com.dc.dcapp.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dc.dcapp.dao.ADUserRepository;
import com.dc.dcapp.model.ADUser;

@RestController
public class LoginController {
	
	@Autowired
	ADUserRepository adUserRepo;
	
	private Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping(path="/getUser/{email}")
	public ADUser getUsers(@PathVariable String email){
		log.info("Id " + email);
		return adUserRepo.findByEmail(email);
	}

}
