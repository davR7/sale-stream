package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.dtos.OrderDTO;
import com.davr7.salestream.entities.Order;
import com.davr7.salestream.entities.mappers.OrderMapper;
import com.davr7.salestream.repositories.OrderRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepo;
	
	public OrderDTO findOrderById(String id) {
		Optional<Order> data = orderRepo.findById(id);
		return OrderMapper.INSTANCE.toOrderDTO(data.orElseThrow(
				() -> new ResourceNotFoundException(id)));
	}
	
	public List<OrderDTO> findAllOrders() {
		List<Order> list = orderRepo.findAll();
		return list.stream()
				.map(o -> OrderMapper.INSTANCE.toOrderDTO(o))
				.collect(Collectors.toList());
	}
}
