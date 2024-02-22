package com.davr7.salestream.dtos;

import java.time.Instant;
import java.util.List;

import com.davr7.salestream.entities.OrderDetail;
import com.davr7.salestream.entities.Payment;

public record OrderDTO(String id, Instant orderDate, String orderStatus, CustomerDTO customer, List<OrderDetail> items, Double total, Payment payment) {
}
