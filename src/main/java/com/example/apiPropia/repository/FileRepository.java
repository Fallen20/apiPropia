package com.example.apiPropia.repository;

import com.example.apiPropia.domain.model.FileTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;
//consulta=select a from
public interface FileRepository extends JpaRepository<FileTable, UUID> {//quien le da la informacion de la tabla. Es quien hace las consultas
    //la tabla y el tipo de dato de la clave primaria
    //con interface genera la clase por cada consulta

    @Query("select fileid from FileTable")
    List<String> getFileIds();

}
