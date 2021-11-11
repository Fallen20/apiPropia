package com.example.apiPropia.controller;

import com.example.apiPropia.domain.model.Movie;
import com.example.apiPropia.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//se conecta a la base de datos/web

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public List<Movie> metodoPedido(){return movieRepository.findAll();}
    //aqui tenemos que pedir los datos de la consulta

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie){//requestBody es que quieres que te envie toda la info
     return movieRepository.save(movie);//guarda la cosa que recibe
    }
}

