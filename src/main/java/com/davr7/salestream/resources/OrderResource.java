package com.davr7.salestream.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.services.OrderService;

@RestController
@RequestMapping("order")
public class OrderResource {
	
	@Autowired
	OrderService orderServ;
}
