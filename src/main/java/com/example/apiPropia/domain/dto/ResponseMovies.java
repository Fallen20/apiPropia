package com.example.apiPropia.domain.dto;

import com.example.apiPropia.domain.model.Movie;

import java.util.List;

public class ResponseMovies {
    public List<Movie> result;//esto es una lista de los objetos
    //result es el nombre este
//{
//    "result": [{
    public ResponseMovies(List<Movie> result) {
        this.result = result;
    }
}
