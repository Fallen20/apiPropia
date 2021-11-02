package com.example.apiPropia.repository;

import com.example.apiPropia.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {//quien le da la informacion de la tabla. Es quien hace las consultas
    //la tabla y el tipo de dato de la clave primaria
    //con interface genera la clase por cada consulta


}
