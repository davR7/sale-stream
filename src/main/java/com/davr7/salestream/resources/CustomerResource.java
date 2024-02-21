package com.davr7.salestream.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.dtos.CustomerDTO;
import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerResource {
	
	@Autowired
	CustomerService customerServ;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Customer> handleFindCustomerById(@PathVariable String id) {
		Customer obj = customerServ.findCustomerById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<CustomerDTO>> handleFindAllCustomers() {
		List<CustomerDTO> list = customerServ.findAllCustomers();
		return ResponseEntity.ok().body(list);
	}
}
