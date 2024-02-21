package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.dtos.CustomerDTO;
import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.entities.mappers.CustomerMapper;
import com.davr7.salestream.repositories.CustomerRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	
	public CustomerDTO findCustomerById(String id) {
		Optional<Customer> data = customerRepo.findById(id);
		return CustomerMapper.INSTANCE.toCustomerDTO(data.orElseThrow(
				() -> new ResourceNotFoundException(id)));
	}
	
	public List<CustomerDTO> findAllCustomers() {
		List<Customer> list = customerRepo.findAll();
		List<CustomerDTO> listDTO = list.stream()
				.map(c -> CustomerMapper.INSTANCE.toCustomerDTO(c))
				.collect(Collectors.toList());
		return listDTO;
	}
}
