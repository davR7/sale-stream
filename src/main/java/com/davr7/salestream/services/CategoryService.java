package com.davr7.salestream.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Category;
import com.davr7.salestream.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public List<Category> findAllCategories() {
		return categoryRepo.findAll();
	}
}
