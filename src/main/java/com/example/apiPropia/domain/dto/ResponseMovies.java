package com.example.apiPropia.domain.dto;

import com.example.apiPropia.domain.model.Movie;

import java.util.List;

public class ResponseMovies {
    List<Movie> result;

    public ResponseMovies(List<Movie> result) {
        this.result = result;
    }
}
