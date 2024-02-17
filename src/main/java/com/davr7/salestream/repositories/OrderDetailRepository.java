package com.davr7.salestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davr7.salestream.entities.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>{

}
