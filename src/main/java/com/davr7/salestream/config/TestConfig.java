package com.davr7.salestream.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.repositories.CustomerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1 = new Customer(null, "Davi Melo", "dav12", "davi@test.com", "81977775555", "122345");
		Customer customer2 = new Customer(null, "Maria Clara", "ma78", "maria@test.com", "81977774444", "122345");
		customerRepo.saveAll(Arrays.asList(customer1, customer2));
	}

}
