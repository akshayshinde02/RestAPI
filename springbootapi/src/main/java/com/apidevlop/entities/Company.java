package com.apidevlop.entities;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int company_id;
	
	private String company_name;
	
	private String company_address;
	
	private String owner_name;
	
	private int office_no;
	
	private int mobile_no;
	
	private int overall_rating;
	
	private String open_close;
	
	 @Lob
	 @Column(name = "logo", columnDefinition = "LONGBLOB")
	 private byte[] logo;
	 
	 private String description;
	 
	 private int totalproduct;
	 
	 private String transportavailability;
	 
	 private String wholeseller;
	 
	 private int employee_count;
	 
	 private String speciality;
	 
	 private int transport_charges;
	 
	 @OneToOne(mappedBy = "company")
	 @JsonBackReference
	private Product product;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	public Company(int company_id, String company_name, String company_address, String owner_name, int office_no,
			int mobile_no, int overall_rating, String open_close, byte[] logo, String description, int totalproduct,
			String transportavailability, String wholeseller, int employee_count, String speciality,
			int transport_charges, Product product) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.company_address = company_address;
		this.owner_name = owner_name;
		this.office_no = office_no;
		this.mobile_no = mobile_no;
		this.overall_rating = overall_rating;
		this.open_close = open_close;
		this.logo = logo;
		this.description = description;
		this.totalproduct = totalproduct;
		this.transportavailability = transportavailability;
		this.wholeseller = wholeseller;
		this.employee_count = employee_count;
		this.speciality = speciality;
		this.transport_charges = transport_charges;
		this.product = product;
	}





	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getOffice_no() {
		return office_no;
	}

	public void setOffice_no(int office_no) {
		this.office_no = office_no;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getOverall_rating() {
		return overall_rating;
	}

	public void setOverall_rating(int overall_rating) {
		this.overall_rating = overall_rating;
	}

	public String getOpen_close() {
		return open_close;
	}

	public void setOpen_close(String open_close) {
		this.open_close = open_close;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalproduct() {
		return totalproduct;
	}

	public void setTotalproduct(int totalproduct) {
		this.totalproduct = totalproduct;
	}

	public String getTransportavailability() {
		return transportavailability;
	}

	public void setTransportavailability(String transportavailability) {
		this.transportavailability = transportavailability;
	}

	public String getWholeseller() {
		return wholeseller;
	}

	public void setWholeseller(String wholeseller) {
		this.wholeseller = wholeseller;
	}

	public int getEmployee_count() {
		return employee_count;
	}

	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getTransport_charges() {
		return transport_charges;
	}

	public void setTransport_charges(int transport_charges) {
		this.transport_charges = transport_charges;
	}
	
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", company_address="
				+ company_address + ", owner_name=" + owner_name + ", office_no=" + office_no + ", mobile_no="
				+ mobile_no + ", overall_rating=" + overall_rating + ", open_close=" + open_close + ", logo="
				+ Arrays.toString(logo) + ", description=" + description + ", totalproduct=" + totalproduct
				+ ", Transportavailability=" + transportavailability + ", wholeseller=" + wholeseller
				+ ", employee_count=" + employee_count + ", speciality=" + speciality + ", transport_charges="
				+ transport_charges + "]";
	}
	 
	 
	 
	 
	

}
