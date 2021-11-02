package com.example.apiPropia.domain.model;

import javax.persistence.*;
import java.util.UUID;

@Entity//le dices que es una tabla
@Table(name="movie")//con cual tabla de la base dd datos se corresponde
public class Movie {
    @Id//le dices que la clave primaria es la de debajo
    @GeneratedValue(strategy = GenerationType.AUTO)//ahora el movieid o genera solo
    public UUID movieid;//id incremental

    public String title;
    public String imageurl;
    //el nombre ha de ser el mismo EXACTO
}
