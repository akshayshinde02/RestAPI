package com.apidevlop.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Orders {

	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int order_id;
	
	private int order_count;
	
	private String transport_requirement;
	
	private Date date;
	
	private String order_Address;
	
	private int phone_no;
	
	private String order_payment_details;
	
	private String order_confirmation;
	
	 @ManyToOne
	 @JoinColumn(name = "company_id", nullable = false)
	 private Company company;

	 @ManyToOne
	 @JoinColumn(name = "product_id", nullable = false)
	 private Product product;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int order_id, int order_count, String transport_requirement, Date date, String order_Address,
			int phone_no, String order_payment_details, String order_confirmation, Company company, Product product) {
		super();
		this.order_id = order_id;
		this.order_count = order_count;
		this.transport_requirement = transport_requirement;
		this.date = date;
		this.order_Address = order_Address;
		this.phone_no = phone_no;
		this.order_payment_details = order_payment_details;
		this.order_confirmation = order_confirmation;
		this.company = company;
		this.product = product;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_count() {
		return order_count;
	}

	public void setOrder_count(int order_count) {
		this.order_count = order_count;
	}

	public String getTransport_requirement() {
		return transport_requirement;
	}

	public void setTransport_requirement(String transport_requirement) {
		this.transport_requirement = transport_requirement;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrder_Address() {
		return order_Address;
	}

	public void setOrder_Address(String order_Address) {
		this.order_Address = order_Address;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getOrder_payment_details() {
		return order_payment_details;
	}

	public void setOrder_payment_details(String order_payment_details) {
		this.order_payment_details = order_payment_details;
	}

	public String getOrder_confirmation() {
		return order_confirmation;
	}

	public void setOrder_confirmation(String order_confirmation) {
		this.order_confirmation = order_confirmation;
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
		return "Orders [order_id=" + order_id + ", order_count=" + order_count + ", transport_requirement="
				+ transport_requirement + ", date=" + date + ", order_Address=" + order_Address + ", phone_no="
				+ phone_no + ", order_payment_details=" + order_payment_details + ", order_confirmation="
				+ order_confirmation + ", company=" + company + ", product=" + product + "]";
	}
	 
	 
	 
	 
	 
	
	
	
	
}
