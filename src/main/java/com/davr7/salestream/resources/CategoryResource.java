package com.davr7.salestream.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.entities.Category;
import com.davr7.salestream.services.CategoryService;

@RestController
@RequestMapping("category")
public class CategoryResource {
	
	@Autowired
	CategoryService categoryServ;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> handleFindCategoryById(@PathVariable String id) {
		Category obj = categoryServ.findCategoryById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> handleFindAllCategories() {
		List<Category> list = categoryServ.findAllCategories();
		return ResponseEntity.ok().body(list);
	}
}
