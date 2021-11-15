package com.example.apiPropia.controller;

import com.example.apiPropia.domain.dto.ResponseMovies;
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
    public ResponseMovies metodoPedido(){//devuelve la lista pero en JSON
        return new ResponseMovies(movieRepository.findAll());//mete los objetos en la lista
        //y lo devuelve en json. Sino te devuelve [{onjeto}]>MAL
        //{result:[{objeto}]}

    }
    //aqui tenemos que pedir los datos de la consulta

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie){//requestBody es que quieres que te envie toda la info
     return movieRepository.save(movie);//guarda la cosa que recibe
    }
}

