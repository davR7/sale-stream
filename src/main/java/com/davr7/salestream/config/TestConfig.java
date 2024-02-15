package com.davr7.salestream.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.entities.Order;
import com.davr7.salestream.entities.enums.OrderStatus;
import com.davr7.salestream.repositories.CustomerRepository;
import com.davr7.salestream.repositories.OrderRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Customer customer1 = new Customer(null, "Davi Melo", "dav12", "davi@test.com", "81977775555", "122345");
		Customer customer2 = new Customer(null, "Maria Clara", "ma78", "maria@test.com", "81977774444", "122345");
		
		Order order1 = new Order(null, Instant.parse("2024-01-15T19:53:07Z"), OrderStatus.PAID, customer1);
		Order order2 = new Order(null, Instant.parse("2024-01-15T19:55:07Z"), OrderStatus.WAITING_PAYMENT, customer1);
		Order order3 = new Order(null, Instant.parse("2024-01-15T19:58:07Z"), OrderStatus.WAITING_PAYMENT, customer2);
		
		customerRepo.saveAll(Arrays.asList(customer1, customer2));
		orderRepo.saveAll(Arrays.asList(order1, order2, order3));
	}

}
