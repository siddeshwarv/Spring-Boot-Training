package com.example.Realtion.Pratice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Realtion.Pratice.model.Author;
import com.example.Realtion.Pratice.model.Book;
import com.example.Realtion.Pratice.repository.AuthorRepository;
import com.example.Realtion.Pratice.repository.BookRepository;
import com.example.Realtion.Pratice.repository.GenreRepository;
import com.example.Realtion.Pratice.service.AuthorService;

public class AuthorServiceImp implements AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Override
	public List<Author> getAuthors() {
		return authorRepository.findAll();
	}

	
	@Override
	public Author authorGetById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Author>author= authorRepository.findById(id);
		if(author.isPresent()) {
			return author.get();
		}
		return null;
	}

	@Override
	public Author addAuthor(Author author) {
		List<Book> books = author.getBooks();
		
		return  null;
	}
	
}
