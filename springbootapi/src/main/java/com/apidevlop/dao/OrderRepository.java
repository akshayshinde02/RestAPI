package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.*;

public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
	public Orders findById(int id);
}
