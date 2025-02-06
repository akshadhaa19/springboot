package com.demo.ProjectApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ProjectApp.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{


	}
	


