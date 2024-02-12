package com.example.Realtion.Pratice.service;

import java.util.List;

import com.example.Realtion.Pratice.model.Book;

public interface BookService {
	List<Book> getBooks();
	Book  saveBook(Book book);
	Book getBookById(Integer id);
	
}
