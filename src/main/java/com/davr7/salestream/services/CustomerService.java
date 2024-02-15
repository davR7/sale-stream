package com.davr7.salestream.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}
}
