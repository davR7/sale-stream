package com.davr7.salestream.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepo;
}
