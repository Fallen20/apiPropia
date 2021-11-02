package com.example.apiPropia.controller;

import com.example.apiPropia.domain.model.Actor;
import com.example.apiPropia.repository.ActorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    private final ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @GetMapping("/")
    public List<Actor> metodoPedido(){return actorRepository.findAll();}
    //aqui tenemos que pedir los datos de la consulta

}