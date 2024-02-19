package com.davr7.salestream.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davr7.salestream.entities.Category;
import com.davr7.salestream.repositories.CategoryRepository;
import com.davr7.salestream.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public Category findCategoryById(String id) {
		Optional<Category> data = categoryRepo.findById(id);
		return data.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public List<Category> findAllCategories() {
		return categoryRepo.findAll();
	}
}
