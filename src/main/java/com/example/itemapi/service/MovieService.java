package com.example.itemapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.itemapi.model.Movie;

@Service
public class MovieService {

    private List<Movie> movieList = new ArrayList<>();
    private Long idCounter = 1L;

    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);
        movieList.add(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return movieList;
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}