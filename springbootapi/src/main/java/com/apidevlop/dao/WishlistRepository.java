package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.Reviews;
import com.apidevlop.entities.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer>{
	
	public Wishlist findById(int id);
}