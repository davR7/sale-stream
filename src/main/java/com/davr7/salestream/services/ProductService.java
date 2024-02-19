package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Product;
import com.davr7.salestream.repositories.ProductRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	public Product findProductById(String id) {
		Optional<Product> data = productRepo.findById(id);
		return data.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public List<Product> findAllProducts() {
		return productRepo.findAll();
	}
}
