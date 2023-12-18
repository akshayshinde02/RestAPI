package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.Cart;
import com.apidevlop.entities.Company;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	public Cart findById(int id);
}
