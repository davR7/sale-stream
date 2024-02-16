package com.davr7.salestream.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davr7.salestream.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
