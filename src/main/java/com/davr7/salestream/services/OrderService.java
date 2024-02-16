package com.davr7.salestream.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Order;
import com.davr7.salestream.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepo;
	
	public List<Order> findAllOrders() {
		return orderRepo.findAll();
	}
}
