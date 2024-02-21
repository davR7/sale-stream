package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.dtos.CustomerDTO;
import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.repositories.CustomerRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public Customer findCustomerById(String id) {
		Optional<Customer> data = customerRepo.findById(id);
		return data.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public List<CustomerDTO> findAllCustomers() {
		List<Customer> list = customerRepo.findAll();
		List<CustomerDTO> listDTO = list.stream()
				.map(c -> CustomerDTO.create(c))
				.collect(Collectors.toList());
		return listDTO;
	}
}
