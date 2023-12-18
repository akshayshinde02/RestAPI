package com.apidevlop.entities;

import java.util.Arrays;

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
@Table(name="reviws")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int review_id;
	
	private String review_text;
	
	 @Lob
	 @Column(name = "review_img", columnDefinition = "LONGBLOB")
	 private byte[] review_img;
	 
	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
	 private Company company;

	 @ManyToOne
	 @JoinColumn(name = "product_id", nullable = false)
	 private Product product;

	public Reviews(int review_id, String review_text, byte[] review_img, Company company, Product product) {
		super();
		this.review_id = review_id;
		this.review_text = review_text;
		this.review_img = review_img;
		this.company = company;
		this.product = product;
	}

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public String getReview_text() {
		return review_text;
	}

	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}

	public byte[] getReview_img() {
		return review_img;
	}

	public void setReview_img(byte[] review_img) {
		this.review_img = review_img;
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

	@Override
	public String toString() {
		return "Reviews [review_id=" + review_id + ", review_text=" + review_text + ", review_img="
				+ Arrays.toString(review_img) + ", company=" + company + ", product=" + product + "]";
	}
	 
	 
	 

}
