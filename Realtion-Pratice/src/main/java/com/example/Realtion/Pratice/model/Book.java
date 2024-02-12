package com.example.Realtion.Pratice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="author")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("books")
	private  Author author;
	private float price;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "book_genre", joinColumns = @JoinColumn(name="bookId"), inverseJoinColumns = @JoinColumn(name="genreId"))
	@JsonIgnoreProperties("books")
	private List<Genre> genres;
}
