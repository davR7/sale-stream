package com.davr7.salestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davr7.salestream.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

}
