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

    @GetMapping("/{id}")//si es get a /files/NUMERO, NUMERO se llama ID
    public byte[] getId(@PathVariable UUID id){
        FileTable file=fileRepository.getById(id);//sacas el file con esa ID pedida en la base de datos
        return file.data;//le devuelves la imagen
    }

    @PostMapping//subir
    //post es el tipo de envio: POST o GET
    public String upload(@RequestParam("file") MultipartFile uploadedFile) {
        //multipart es cuando envias muchas cosas
        try {
            System.out.println(uploadedFile.getOriginalFilename() + ", " + uploadedFile.getContentType());
            FileTable file = new FileTable();
            file.contenttype = uploadedFile.getContentType();
            file.data = uploadedFile.getBytes();

            return fileRepository.save(file).fileid.toString();//guarda el archivo subido a la base de datos
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/")//si es post, le ponemos la direccion y seguido /, te lleva aqui
    public FileTable createMFile(@RequestBody FileTable file){//requestBody es que quieres que te envie toda la info
     return fileRepository.save(file);//guarda la cosa que recibe
    }

    @GetMapping
    public String hack() {
        List<String> files = fileRepository.getFileIds();

        String filesStr = "";
        for (String file : files) {
            filesStr += "<img src='/files/"+file+"' style='width:15em'>";
        }

        return "<form method=\"POST\" enctype=\"multipart/form-data\" style=\"display:flex;\">\n" +
                "    <input id=\"file\" type=\"file\" name=\"file\" style=\"display:none\" onchange=\"document.getElementById('preview').src=window.URL.createObjectURL(event.target.files[0])\">\n" +
                "    <label for=\"file\" style=\"border: 1px dashed #999\">\n" +
                "        <img id=\"preview\" src=\"\" style=\"width:64px;\">\n" +
                "    </label>\n" +
                "    <input type=\"submit\" style=\"background:#0096f7;color: white;border: 0;border-radius: 3px;padding: 8px;\" value=\"Upload\">\n" +
                "</form>\n <div style='display:flex;flex-wrap:wrap;gap:1em;'>" + filesStr + "</div>";
    }
}

