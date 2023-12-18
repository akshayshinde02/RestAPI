package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.Product;
import com.apidevlop.entities.Reviews;

public interface ReviwsRepository  extends JpaRepository<Reviews, Integer>{
	
	public Reviews findById(int id);
}