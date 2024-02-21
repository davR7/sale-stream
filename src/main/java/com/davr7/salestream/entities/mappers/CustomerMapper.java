package com.davr7.salestream.entities.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.davr7.salestream.dtos.CustomerDTO;
import com.davr7.salestream.entities.Customer;

@Mapper
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
	CustomerDTO toCustomerDTO(Customer customer);
}
