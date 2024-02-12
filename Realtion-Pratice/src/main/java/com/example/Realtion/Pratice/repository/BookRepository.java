package com.example.Realtion.Pratice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Realtion.Pratice.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
