package com.davr7.salestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davr7.salestream.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
