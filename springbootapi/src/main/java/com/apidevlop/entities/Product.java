package com.apidevlop.entities;

import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int product_id;
	
	@OneToOne(cascade= CascadeType.ALL)  // cascade - First Author Table will create then book will create
	@JsonManagedReference                // 
	private Company company;
	
	private String product_name;
	
	 @Lob
	 @Column(name = "product_image", columnDefinition = "LONGBLOB")
	 private byte[] product_image;
	 
	 private String product_type;
	 
	 private String product_ingredients;
	 
	 private int rating;
	 
	 private String product_description;
	 
	 private int available_stock;
	 
	 private Date manufacturing_date;
	 
	 private Date expiry_data;
	 
	 private int product_price;
	 
	 private int product_measurement;
	 
	 private int discount;
	 
	 private String details;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, Company company, String product_name, byte[] product_image, String product_type,
			String product_ingredients, int rating, String product_description, int available_stock,
			Date manufacturing_date, Date expiry_data, int product_price, int product_measurement, int discount,
			String details) {
		super();
		this.product_id = product_id;
		this.company = company;
		this.product_name = product_name;
		this.product_image = product_image;
		this.product_type = product_type;
		this.product_ingredients = product_ingredients;
		this.rating = rating;
		this.product_description = product_description;
		this.available_stock = available_stock;
		this.manufacturing_date = manufacturing_date;
		this.expiry_data = expiry_data;
		this.product_price = product_price;
		this.product_measurement = product_measurement;
		this.discount = discount;
		this.details = details;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public byte[] getProduct_image() {
		return product_image;
	}

	public void setProduct_image(byte[] product_image) {
		this.product_image = product_image;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getProduct_ingredients() {
		return product_ingredients;
	}

	public void setProduct_ingredients(String product_ingredients) {
		this.product_ingredients = product_ingredients;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public int getAvailable_stock() {
		return available_stock;
	}

	public void setAvailable_stock(int available_stock) {
		this.available_stock = available_stock;
	}

	public Date getManufacturing_date() {
		return manufacturing_date;
	}

	public void setManufacturing_date(Date manufacturing_date) {
		this.manufacturing_date = manufacturing_date;
	}

	public Date getExpiry_data() {
		return expiry_data;
	}

	public void setExpiry_data(Date expiry_data) {
		this.expiry_data = expiry_data;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_measurement() {
		return product_measurement;
	}

	public void setProduct_measurement(int product_measurement) {
		this.product_measurement = product_measurement;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", company=" + company + ", product_name=" + product_name
				+ ", product_image=" + Arrays.toString(product_image) + ", product_type=" + product_type
				+ ", product_ingredients=" + product_ingredients + ", rating=" + rating + ", product_description="
				+ product_description + ", available_stock=" + available_stock + ", manufacturing_date="
				+ manufacturing_date + ", expiry_data=" + expiry_data + ", product_price=" + product_price
				+ ", product_measurement=" + product_measurement + ", discount=" + discount + ", details=" + details
				+ "]";
	}
	 
	 

}
