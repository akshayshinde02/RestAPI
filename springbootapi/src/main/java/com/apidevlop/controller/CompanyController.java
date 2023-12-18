package com.apidevlop.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.apidevlop.entities.*;
import com.apidevlop.services.CompanyServices;

@RestController
public class CompanyController {

	@Autowired
	private CompanyServices companyservices;
	
	// 1. Companies
	// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/company")
		public ResponseEntity<List<Company>> getAllComapanies() {
			
			
			List<Company> list = this.companyservices.getAllComapanies();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
			}
	
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/company/{id}")
		public ResponseEntity<Company> getCompanyById(@PathVariable("id") int id) {
			
			Company company = this.companyservices.getCompanyById(id);
			
			if(company==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(company));
		}
	//	
	//	
//		// 2. Post Mapping
		@PostMapping("/addcompany")
		public ResponseEntity<Company> addCompany(@RequestBody Company company) {
			
			Company b = null;
			try {
			  b = this.companyservices.addCompany(company);
			  
			  return ResponseEntity.of(Optional.of(b));
			  
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
	
		
		// 3. Delete Company
		@DeleteMapping("/company/{id}")
		public ResponseEntity<Void> deleteCompany(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
			 this.companyservices.deleteCompany(id);
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	//	
		// 4. Update Company
		@PutMapping("/company/{id}")
		public ResponseEntity<Company> updateCompany(@RequestBody Company company, @PathVariable("id")int id){
			
			try {
			 this.companyservices.updateCompany(company, id);
			 
			 return ResponseEntity.ok().body(company);
			 
			}catch(Exception e) {
				e.printStackTrace();
			}
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		//**********************************************************************************************************************
		
		// 2. Products
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/products")
		public ResponseEntity<List<Product>> getAllProducts() {
			
			
			List<Product> list = this.companyservices.getAllProducts();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/product/{id}")
		public ResponseEntity<Product> getProductByid(@PathVariable("id") int id) {
			
			Product product = this.companyservices.getProductById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/addproduct")
		public ResponseEntity<Product> addBook(@RequestBody Product company) {
			
			Product b = null;
			try {
				b = this.companyservices.addProduct(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/product/{id}")
		public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteProduct(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/product/{id}")
		public ResponseEntity<Product> updateBook(@RequestBody Product company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updateProduct(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		
		
		//**********************************************************************************************************************
		
		// Orders
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/orders")
		public ResponseEntity<List<Orders>> getAllOrders() {
			
			
			List<Orders> list = this.companyservices.getAllOrders();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/orders/{id}")
		public ResponseEntity<Orders> getOrdersByid(@PathVariable("id") int id) {
			
			Orders product = this.companyservices.getOrdersById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/addorders")
		public ResponseEntity<Orders> addBook(@RequestBody Orders company) {
			
			Orders b = null;
			try {
				b = this.companyservices.addOrders(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/orders/{id}")
		public ResponseEntity<Void> deleteOrders(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteOrders(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/orders/{id}")
		public ResponseEntity<Orders> updateOrders(@RequestBody Orders company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updateOrders(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		//**********************************************************************************************************************
		
		// feedbacks
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/feedbacks")
		public ResponseEntity<List<Feedback>> getAllFeedback() {
			
			
			List<Feedback> list = this.companyservices.getAllFeedback();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/feedbacks/{id}")
		public ResponseEntity<Feedback> getFeedbackByid(@PathVariable("id") int id) {
			
			Feedback product = this.companyservices.getFeedbackById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/addfeedback")
		public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback company) {
			
			Feedback b = null;
			try {
				b = this.companyservices.addFeedback(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/feedbacks/{id}")
		public ResponseEntity<Void> deleteFeedback(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteFeedback(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/feedbacks/{id}")
		public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updatFeedback(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		
		
		
		//**********************************************************************************************************************
		
		// Reviews
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/reviews")
		public ResponseEntity<List<Reviews>> getAllReviews() {
			
			
			List<Reviews> list = this.companyservices.getAllReviews();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/reviews/{id}")
		public ResponseEntity<Reviews> getReviewsByid(@PathVariable("id") int id) {
			
			Reviews product = this.companyservices.getReviewsById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/addreviews")
		public ResponseEntity<Reviews> addReviews(@RequestBody Reviews company) {
			
			Reviews b = null;
			try {
				b = this.companyservices.addReviews(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/reviews/{id}")
		public ResponseEntity<Void> deleteReviews(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteReviews(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/reviews/{id}")
		public ResponseEntity<Reviews> updateReviews(@RequestBody Reviews company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updateReviews(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		
		
		
		
		//**********************************************************************************************************************
		
		// wishlist
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/wishlists")
		public ResponseEntity<List<Wishlist>> getAllWishlist() {
			
			
			List<Wishlist> list = this.companyservices.getAllWishlist();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/wishlists/{id}")
		public ResponseEntity<Wishlist> getWishlistByid(@PathVariable("id") int id) {
			
			Wishlist product = this.companyservices.getWishlistById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/wishlists")
		public ResponseEntity<Wishlist> addWishlist(@RequestBody Wishlist company) {
			
			Wishlist b = null;
			try {
				b = this.companyservices.addWishlist(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/wishlists/{id}")
		public ResponseEntity<Void> deleteWishlist(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteReviews(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/wishlists/{id}")
		public ResponseEntity<Wishlist> updateWishlist(@RequestBody Wishlist company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updateWishlist(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
		
		
		
		
		//**********************************************************************************************************************
		
		// Cart
		// 1. Get Mapping
		@CrossOrigin
		@GetMapping("/carts")
		public ResponseEntity<List<Cart>> getAllCart() {
			
			
			List<Cart> list = this.companyservices.getAllCart();
			
			if(list.size()<=0) {
				
				return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			
			return ResponseEntity.status(HttpStatus.CREATED).body(list);
		}
		
		
//		// 1.1 Get Mapping using id
		@CrossOrigin
		@GetMapping("/carts/{id}")
		public ResponseEntity<Cart> getCartByid(@PathVariable("id") int id) {
			
			Cart product = this.companyservices.getCartById(id);
			
			if(product==null) {
				
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(product));
		}
		//	
		//	
//		// 2. Post Mapping
		@PostMapping("/carts")
		public ResponseEntity<Cart> addCart(@RequestBody Cart company) {
			
			Cart b = null;
			try {
				b = this.companyservices.addCart(company);
				
				return ResponseEntity.of(Optional.of(b));
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			
		}
		
		
		// 3. Delete Product
		@DeleteMapping("/carts/{id}")
		public ResponseEntity<Void> deleteCart(@PathVariable("id") int id) {
			
			try {
				/* List<Book> b = this.bookservices.deleteBook(id); */
				this.companyservices.deleteCart(id);
				
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//	
		// 4. Update Product
		@PutMapping("/carts/{id}")
		public ResponseEntity<Cart> updateCart(@RequestBody Cart company, @PathVariable("id")int id){
			
			try {
				this.companyservices.updateCart(company, id);
				
				return ResponseEntity.ok().body(company);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
		
}
