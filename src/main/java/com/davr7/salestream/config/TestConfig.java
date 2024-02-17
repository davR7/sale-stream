package com.davr7.salestream.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davr7.salestream.entities.Category;
import com.davr7.salestream.entities.Customer;
import com.davr7.salestream.entities.Order;
import com.davr7.salestream.entities.OrderDetail;
import com.davr7.salestream.entities.Product;
import com.davr7.salestream.entities.enums.OrderStatus;
import com.davr7.salestream.repositories.CategoryRepository;
import com.davr7.salestream.repositories.CustomerRepository;
import com.davr7.salestream.repositories.OrderDetailRepository;
import com.davr7.salestream.repositories.OrderRepository;
import com.davr7.salestream.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	OrderDetailRepository orderDetRepo;

	@Override
	public void run(String... args) throws Exception {
		Category ctg1 = new Category(null, "Electronics");
		Category ctg2 = new Category(null, "Books");
		Category ctg3 = new Category(null, "Computers");
		
		Product prod1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product prod2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product prod3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product prod4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product prod5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		categoryRepo.saveAll(Arrays.asList(ctg1, ctg2, ctg3));
		productRepo.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5));
		
		prod1.getCategories().add(ctg2);
		prod2.getCategories().add(ctg1);
		prod2.getCategories().add(ctg3);
		prod3.getCategories().add(ctg3);
		prod4.getCategories().add(ctg3);
		prod5.getCategories().add(ctg2);
		
		productRepo.saveAll(Arrays.asList(prod1, prod2, prod3, prod4, prod5));
		
		Customer customer1 = new Customer(null, "Davi Melo", "dav12", "davi@test.com", "81977775555", "122345");
		Customer customer2 = new Customer(null, "Maria Clara", "ma78", "maria@test.com", "81977774444", "122345");
		
		Order order1 = new Order(null, Instant.parse("2024-01-15T19:53:07Z"), OrderStatus.PAID, customer1);
		Order order2 = new Order(null, Instant.parse("2024-01-15T19:55:07Z"), OrderStatus.WAITING_PAYMENT, customer1);
		Order order3 = new Order(null, Instant.parse("2024-01-15T19:58:07Z"), OrderStatus.WAITING_PAYMENT, customer2);
		
		customerRepo.saveAll(Arrays.asList(customer1, customer2));
		orderRepo.saveAll(Arrays.asList(order1, order2, order3));
		
		OrderDetail od1 = new OrderDetail(order1, prod1, 2, prod1.getPrice());
		OrderDetail od2 = new OrderDetail(order1, prod3, 1, prod3.getPrice());
		OrderDetail od3 = new OrderDetail(order2, prod3, 2, prod3.getPrice());
		OrderDetail od4 = new OrderDetail(order3, prod5, 2, prod5.getPrice());
		
		orderDetRepo.saveAll(Arrays.asList(od1, od2, od3, od4));
	}
}
