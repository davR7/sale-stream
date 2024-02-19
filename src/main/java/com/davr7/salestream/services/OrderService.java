package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Order;
import com.davr7.salestream.repositories.OrderRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepo;
	
	public Order findOrderById(String id) {
		Optional<Order> data = orderRepo.findById(id);
		return data.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public List<Order> findAllOrders() {
		return orderRepo.findAll();
	}
}
