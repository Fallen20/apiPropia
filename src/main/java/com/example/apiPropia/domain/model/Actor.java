package com.example.apiPropia.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

//esto es como la fila de cada tabla

@Entity//le dices que es una tabla
@Table(name="actor")//con cual tabla de la base dd datos se corresponde
public class Actor {
    @Id//le dices que la clave primaria es la de debajo
    public UUID actorid;//id incremental

    public String name;
    public String imageurl;
}