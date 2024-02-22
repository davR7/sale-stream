package com.davr7.salestream.entities.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.davr7.salestream.dtos.OrderDTO;
import com.davr7.salestream.entities.Order;

@Mapper
public interface OrderMapper {
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	OrderDTO toOrderDTO(Order order);
}
