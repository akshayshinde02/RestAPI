package com.apidevlop.entities;

import jakarta.persistence.*;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int feedback_id;
	
	private int customer_id;
	
	
	
	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
	 private Company company;

	 @ManyToOne
	 @JoinColumn(name = "product_id", nullable = false)
	 private Product product;
	 
	
	 private String feedback_description;
	 
	 private int rating;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int feedback_id, int customer_id, Company company, Product product, String feedback_description,
			int rating) {
		super();
		this.feedback_id = feedback_id;
		this.customer_id = customer_id;
		this.company = company;
		this.product = product;
		this.feedback_description = feedback_description;
		this.rating = rating;
	}

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
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

	public String getFeedback_description() {
		return feedback_description;
	}

	public void setFeedback_description(String feedback_description) {
		this.feedback_description = feedback_description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	 
	 
	 
	 
	 
}
