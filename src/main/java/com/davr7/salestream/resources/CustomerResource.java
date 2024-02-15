package com.davr7.salestream.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.services.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerResource {
	
	@Autowired
	CustomerService customerServ;
	
	@GetMapping
	public ResponseEntity<List<Customer>> handlerFindAllCustomers() {
		List<Customer> list = customerServ.findAllCustomers();
		return ResponseEntity.ok().body(list);
	}
}
