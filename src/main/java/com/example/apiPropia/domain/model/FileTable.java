package com.example.apiPropia.domain.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="file")
public class FileTable {
    @Id//le dices que la clave primaria es la de debajo
    @GeneratedValue(strategy = GenerationType.AUTO)//ahora el movieid o genera solo
    public UUID fileid;//id incremental

    public String contenttype;

    @Lob //large object
    @Type(type="org.hibernate.type.BinaryType")
    public byte[] data; //necesita anotaciones extra

}
