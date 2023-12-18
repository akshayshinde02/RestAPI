//package com.apidevlop.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.apidevlop.entities.Book;
//import com.apidevlop.services.BookServices;
//
//@RestController
//public class BookController {
//	
//	@Autowired
//	private BookServices bookservices;
//	
//	/* @RequestMapping(value="/books",method=RequestMethod.GET) */
//	
//	// 1. Get Mapping
//	@CrossOrigin
//	@GetMapping("/books")
//	public ResponseEntity<List<Book>> getBooks() {
//		
//		
//		List<Book> list = this.bookservices.getAllBooks();
//		
//		if(list.size()<=0) {
//			
//			return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//			
//		}
//		
//		return ResponseEntity.status(HttpStatus.CREATED).body(list);
//		}
//	
//	// 1.1 Get Mapping using id
//	@CrossOrigin
//	@GetMapping("/books/{id}")
//	public ResponseEntity<Book> getBookByid(@PathVariable("id") int id) {
//		
//		Book book = this.bookservices.getBookById(id);
//		
//		if(book==null) {
//			
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		
//		return ResponseEntity.of(Optional.of(book));
//	}
//	
//	
//	// 2. Post Mapping
//	@PostMapping("/addbooks")
//	public ResponseEntity<Book> addBook(@RequestBody Book book) {
//		
//		Book b = null;
//		try {
//		  b = this.bookservices.addBook(book);
//		  
//		  return ResponseEntity.of(Optional.of(b));
//		  
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//		
//	}
//	
//	
//	// 3. Delete Book
//	@DeleteMapping("/books/{id}")
//	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id) {
//		
//		try {
//			/* List<Book> b = this.bookservices.deleteBook(id); */
//		 this.bookservices.deleteBook(id);
//		
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//	}
//	
//	// 4. Update Book
//	@PutMapping("/books/{id}")
//	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("id")int id){
//		
//		try {
//		 this.bookservices.updateBook(book, id);
//		 
//		 return ResponseEntity.ok().body(book);
//		 
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//	}
//
//}
