package com.apidevlop.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.apidevlop.dao.*;
import com.apidevlop.entities.Cart;
import com.apidevlop.entities.Company;
import com.apidevlop.entities.Feedback;
import com.apidevlop.entities.Orders;
import com.apidevlop.entities.Product;
import com.apidevlop.entities.Reviews;
import com.apidevlop.entities.Wishlist;

@Component
public class CompanyServices {

	@Autowired
	private CompanyRepository companyrepository;
	
	@Autowired
	private ProductRepository productrepository;
	
	@Autowired
	private OrderRepository orderrepo;
	
	@Autowired
	private FeedbackRepository feedbackrepo;
	
	@Autowired
	private ReviwsRepository reviewsrepo;
	
	@Autowired
	private WishlistRepository wishlistsrepo;
	
	@Autowired
	private CartRepository cartrepo;
	
	
	// 1. get all companies
	public List<Company> getAllComapanies(){

		return this.companyrepository.findAll();
	}
	
	
	// 2. get specific id company 
	public Company getCompanyById(int id) {
		
		Company company = null;
		try {
			
			company = this.companyrepository.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return company;
	}
	
	// 3. add company
	public Company addCompany(Company b) {

		Company result = this.companyrepository.save(b);
		return result;
	}
	
	// 4. delete  company
	public void deleteCompany(int id) {
		
		this.companyrepository.deleteById(id);
	}
	
	
	// 5. update Company
	public void updateCompany(Company b,int id) {
//		
		b.setCompany_id(id);
		
		this.companyrepository.save(b);
	}
	
	
	// ********************************************************************************************************
	
	
	// 1. get all products
	public List<Product> getAllProducts(){
		
		return this.productrepository.findAll();
	}
	
	
	// 2. get specific id product 
	public Product getProductById(int id) {
		
		Product product = null;
		try {
			
			product = this.productrepository.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add product
	public Product addProduct(Product b) {
		
		Product result = this.productrepository.save(b);
		return result;
	}
	
	// 4. delete  company
	public void deleteProduct(int id) {
		
		this.productrepository.deleteById(id);
	}
	
	
	// 5. update Company
	public void updateProduct(Product b,int id) {
//		
		b.setProduct_id(id);
		
		this.productrepository.save(b);
	}
	
	
	
	
	
	// ********************************************************************************************************
	
	
	// 1. get all orders
	public List<Orders> getAllOrders(){
		
		return this.orderrepo.findAll();
	}
	
	
	// 2. get specific id product 
	public Orders getOrdersById(int id) {
		
		Orders product = null;
		try {
			
			product = this.orderrepo.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add product
	public Orders addOrders(Orders b) {
		
		Orders result = this.orderrepo.save(b);
		return result;
	}
	
	// 4. delete  company
	public void deleteOrders(int id) {
		
		this.orderrepo.deleteById(id);
	}
	
	
	// 5. update Company
	public void updateOrders(Orders b,int id) {
//		
		b.setOrder_id(id);
		
		this.orderrepo.save(b);
	}
	
	
	
	// ********************************************************************************************************
	
	
	// 1. get all feedbacks
	public List<Feedback> getAllFeedback(){
		
		return this.feedbackrepo.findAll();
	}
	
	
	// 2. get specific id product 
	public Feedback getFeedbackById(int id) {
		
		Feedback product = null;
		try {
			
			product = this.feedbackrepo.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add product
	public Feedback addFeedback(Feedback b) {
		
		Feedback result = this.feedbackrepo.save(b);
		return result;
	}
	
	// 4. delete  company
	public void deleteFeedback(int id) {
		
		this.feedbackrepo.deleteById(id);
	}
	
	
	// 5. update Company
	public void updatFeedback(Feedback b,int id) {
//		
		b.setFeedback_id(id);
		
		this.feedbackrepo.save(b);
	}
	
	
	
	
	// ********************************************************************************************************
	
	// Reviews
	// 1. get all Reviews
	public List<Reviews> getAllReviews(){
		
		return this.reviewsrepo.findAll();
	}
	
	
	// 2. get specific id product 
	public Reviews getReviewsById(int id) {
		
		Reviews product = null;
		try {
			
			product = this.reviewsrepo.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add product
	public Reviews addReviews(Reviews b) {
		
		Reviews result = this.reviewsrepo.save(b);
		return result;
	}
	
	// 4. delete  company
	public void deleteReviews(int id) {
		
		this.reviewsrepo.deleteById(id);
	}
	
	
	// 5. update Company
	public void updateReviews(Reviews b,int id) {
//		
		b.setReview_id(id);
		
		this.reviewsrepo.save(b);
	}
	
	
	
	// ********************************************************************************************************
	
	// Wishlist
	// 1. get all Wishlist
	public List<Wishlist> getAllWishlist(){
		
		return this.wishlistsrepo.findAll();
	}
	
	
	// 2. get specific id product 
	public Wishlist getWishlistById(int id) {
		
		Wishlist product = null;
		try {
			
			product = this.wishlistsrepo.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add Wishlist
	public Wishlist addWishlist(Wishlist b) {
		
		Wishlist result = this.wishlistsrepo.save(b);
		return result;
	}
	
	// 4. delete  Wishlist
	public void deleteWishlist(int id) {
		
		this.wishlistsrepo.deleteById(id);
	}
	
	
	// 5. update Wishlist
	public void updateWishlist(Wishlist b,int id) {
//		
		b.setWishlist_id(id);
		
		this.wishlistsrepo.save(b);
	}
	
	
	
	
	
	
	// ********************************************************************************************************
	
	// Cart
	// 1. get all Wishlist
	public List<Cart> getAllCart(){
		
		return this.cartrepo.findAll();
	}
	
	
	// 2. get specific id product 
	public Cart getCartById(int id) {
		
		Cart product = null;
		try {
			
			product = this.cartrepo.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	// 3. add Wishlist
	public Cart addCart(Cart b) {
		
		Cart result = this.cartrepo.save(b);
		return result;
	}
	
	// 4. delete  Wishlist
	public void deleteCart(int id) {
		
		this.cartrepo.deleteById(id);
	}
	
	
	// 5. update Wishlist
	public void updateCart(Cart b,int id) {
//		
		b.setCart_id(id);
		
		this.cartrepo.save(b);
	}
	
}
