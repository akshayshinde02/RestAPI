package com.apidevlop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevlop.entities.Company;
//
//import com.apidevlop.entities.Book;
//
public interface CompanyRepository extends JpaRepository<Company, Integer>{
	
	public Company findById(int id);
}
