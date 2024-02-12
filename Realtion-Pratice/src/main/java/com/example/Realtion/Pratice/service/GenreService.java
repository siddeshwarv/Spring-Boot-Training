package com.example.Realtion.Pratice.service;

import java.util.List;

import com.example.Realtion.Pratice.model.Genre;

public interface GenreService {
	List<Genre> getGenre();
	Genre getGenreById();
	Genre saveGenre(Genre genre);
}
