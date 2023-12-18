package com.apidevlop.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cart_id;
	
	private int customer_id;
	
	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
	 private Company company;
	 
	 

	 @ManyToOne
	 @JoinColumn(name = "product_id", nullable = false)
	 private Product product;
	 
	 private Date date;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cart_id, int customer_id, Company company, Product product, Date date) {
		super();
		this.cart_id = cart_id;
		this.customer_id = customer_id;
		this.company = company;
		this.product = product;
		this.date = date;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	 
	 

}
