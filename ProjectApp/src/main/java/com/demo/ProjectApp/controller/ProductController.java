package com.demo.ProjectApp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProjectApp.models.Product;
import com.demo.ProjectApp.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
     
	 @Autowired
	 private ProductService productService;
	 
	 @GetMapping
	 public List<Product> getAllProducts(){
		 return productService.getAllProducts();
	 }
	
	 
	 @GetMapping("/category")
	 public List<Map<String, Object>> getCategoryProducts() {
		   return Arrays.asList(
				   Map.of("name","product 1","price",234),
				   Map.of("name","product 2","price",2234));
}
}
