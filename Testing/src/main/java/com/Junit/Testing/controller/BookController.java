package com.Junit.Testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Junit.Testing.entity.Book;
import com.Junit.Testing.repository.BookRepository;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping(value = "{bookId}")
	public Book getBookById(@PathVariable(value="bookId") Long bookId) {
		return bookRepository.findById(bookId).get();
}
	@PostMapping
	public Book createBookRecord(@RequestBody  Book bookRecord) {
		return bookRepository.save(bookRecord);
	}
	

}
