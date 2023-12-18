package com.apidevlop.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="wishlist")
public class Wishlist {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int wishlist_id;
	
	private int customer_id;
	
	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
	 private Company company;

	 @ManyToOne
	 @JoinColumn(name = "product_id", nullable = false)
	 private Product product;
	 
	 private Date date;

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wishlist(int wishlist_id, Company company, Product product, Date date) {
		super();
		this.wishlist_id = wishlist_id;
		this.company = company;
		this.product = product;
		this.date = date;
	}

	public int getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(int wishlist_id) {
		this.wishlist_id = wishlist_id;
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

	@Override
	public String toString() {
		return "Wishlist [wishlist_id=" + wishlist_id + ", company=" + company + ", product=" + product + ", date="
				+ date + "]";
	}
	 
	 
	 

}
