package com.Demo.RelationMapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.RelationMapping.model.Book;
import com.Demo.RelationMapping.repository.BookRepository;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> getBook(){
		return bookRepository.findAll();
	}
}
