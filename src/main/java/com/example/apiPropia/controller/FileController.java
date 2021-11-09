package com.example.apiPropia.controller;

import com.example.apiPropia.domain.model.FileTable;
import com.example.apiPropia.repository.FileRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/files")
public class FileController {
    private final FileRepository fileRepository;

    public FileController(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @GetMapping("/{id}")
    public byte[] getId(@PathVariable UUID id){
        FileTable file=fileRepository.getById(id);//sacas el file con esa ID pedida en la base de datos
        return file.data;//le devuelves la imagen
    }

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile uploadedFile) {
        //multipart es cuando envias muchas cosas
        try {
            System.out.println(uploadedFile.getOriginalFilename() + ", " + uploadedFile.getContentType());
            FileTable file = new FileTable();
            file.contenttype = uploadedFile.getContentType();
            file.data = uploadedFile.getBytes();

            return fileRepository.save(file).fileid.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/")
    public FileTable createMovie(@RequestBody FileTable file){//requestBody es que quieres que te envie toda la info
     return fileRepository.save(file);//guarda la cosa que recibe
    }
}

