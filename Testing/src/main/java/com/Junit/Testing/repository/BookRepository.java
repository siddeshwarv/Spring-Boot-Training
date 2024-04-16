package com.Junit.Testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Junit.Testing.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
