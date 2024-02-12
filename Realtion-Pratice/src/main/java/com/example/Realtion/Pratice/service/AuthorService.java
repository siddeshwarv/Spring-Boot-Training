package com.example.Realtion.Pratice.service;

import java.util.List;

import com.example.Realtion.Pratice.model.Author;

public interface AuthorService {
	List<Author> getAuthors();
	Author addAuthor(Author author);
	Author authorGetById(Integer id);
}
