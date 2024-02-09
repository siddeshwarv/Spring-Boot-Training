package com.Demo.RelationMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo.RelationMapping.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
