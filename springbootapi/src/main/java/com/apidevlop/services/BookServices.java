package com.apidevlop.services;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.apidevlop.dao.BookRepository;

import com.apidevlop.entities.Book;

@Component
public class BookServices {
	
	// 1. Using Database Connection
	@Autowired
	private BookRepository bookrepository;
	
	public List<Book> getAllBooks(){
		
		return this.bookrepository.findAll();
	}
	
	public Book getBookById(int id) {
		
		Book book = null;
		try {
			
			book = this.bookrepository.findById(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}
	
	public Book addBook(Book b) {
		
		Book result = this.bookrepository.save(b);
		return result;
	}
	
	public void deleteBook(int id) {
		
		this.bookrepository.deleteById(id);
	}
	
	public void updateBook(Book b,int id) {
		
		b.setId(id);
		
		this.bookrepository.save(b);
	}
	

	  
/*	   2. Using Simple ArrayList
 //create fake service
private  List<Book> list = new ArrayList<>();
	  
	 public BookServices(){
	  list.add(new Book(12,"Java","xyz"));
	  list.add(new Book(13,"Python","abc"));
	 list.add(new Book(15,"React","Ram")); 
	 }
	
	
	 // Return All the Books
	public List<Book> getAllBooks(){
		return list;
	}
	
	
	//  Return Book by Id
	public Book getBookById(int id) {
		
		try {
		for(Book book : list) {
			
			if(book.getId()==id)
				return book;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	return null;
	}
	
	// Adding the Book
	public Book addBook(Book book) {
		try {
		list.add(book);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	// Deleting the Book
	public List<Book> deleteBook(int id) {
		
		List<Book> l = new ArrayList<>();
		for(Book b : list) {
			
			if(b.getId()!=id) {
				l.add(b);
			}
		}
		
		return l;
	}
	
	// Update Book
	public List<Book> updateBook(Book book,int id){
		
		for(Book b :list) {
			
			if(b.getId()==id) {
				
				b.setId(book.getId());
				b.setAuthor(book.getAuthor());
				b.setTitle(book.getTitle());
			}
		}
		
		return list;
	}
	*/
}

