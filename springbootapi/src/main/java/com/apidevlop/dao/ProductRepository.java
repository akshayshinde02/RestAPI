package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.apidevlop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public Product findById(int id);
}
