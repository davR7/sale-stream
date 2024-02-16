package com.davr7.salestream.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.entities.Order;
import com.davr7.salestream.services.OrderService;

@RestController
@RequestMapping("order")
public class OrderResource {
	
	@Autowired
	OrderService orderServ;
	
	@GetMapping
	public ResponseEntity<List<Order>> handlerFindAllOrders() {
		List<Order> list = orderServ.findAllOrders();
		return ResponseEntity.ok().body(list);
	}
}