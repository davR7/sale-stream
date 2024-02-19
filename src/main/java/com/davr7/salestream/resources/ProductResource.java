package com.davr7.salestream.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davr7.salestream.entities.Product;
import com.davr7.salestream.services.ProductService;

@RestController
@RequestMapping("product")
public class ProductResource {
	
	@Autowired
	ProductService productServ;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> handleFindProductById(@PathVariable String id) {
		Product obj = productServ.findProductById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> handlerFindAllProducts() {
		List<Product> list = productServ.findAllProducts();
		return ResponseEntity.ok().body(list);
	}
}
