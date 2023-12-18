package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.*;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
	
	public Feedback findById(int id);
}
