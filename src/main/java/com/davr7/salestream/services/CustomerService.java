package com.davr7.salestream.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.davr7.salestream.repositories.CustomerRepository;

public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;	

}
