package com.example.apiPropia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")//con quien lo unes>ahora se accede aqui con http://IP_SERVER/hello
public class HelloController {//endpoint, es la cosa a pedir
    //esto recibe las peticiones de la app
    //como se hace una peticion HTTP> http://IP_SERVER/movie (cosa a pedir)

    @GetMapping("/")//cuando hagan http://IP_SERVER/hello/ haz este metodo
    public String metodoPedido(){return "Hello World";}

    @GetMapping("/mars")//cuando hagan http://IP_SERVER/hello/mars haz este metodo
    public String metodoPedido2(){return "Hello Mars";}

    @GetMapping("/jupiter")//cuando hagan http://IP_SERVER/hello/mars haz este metodo
    public String metodoPedido3(){return "Hello jupiter";}

    @GetMapping("/uranus")//cuando hagan http://IP_SERVER/hello/mars haz este metodo
    public String metodoPedido4(){return "uranos";}
}

//ahora es otra web
@RestController
@RequestMapping("/adios")//con quien lo unes>ahora se accede aqui con http://IP_SERVER/adios
class ByeController {//endpoint, es la cosa a pedir
    //esto recibe las peticiones de la app
    //como se hace una peticion HTTP> http://IP_SERVER/movie (cosa a pedir)

    @GetMapping("/")//cuando hagan http://IP_SERVER/adios/ haz este metodo
    public String metodoPedido(){return "Adios World";}

    @GetMapping("/mars")//cuando hagan http://IP_SERVER/adios/mars haz este metodo
    public String metodoPedido2(){return "Adios Mars";}

    @GetMapping("/jupiter")//cuando hagan http://IP_SERVER/adios/mars haz este metodo
    public String metodoPedido3(){return "Adios jupiter";}

    @GetMapping("/uranus")//cuando hagan http://IP_SERVER/adios/mars haz este metodo
    public String metodoPedido4(){return "Adios uranos";}
}

//ahora es otra web
@RestController
@RequestMapping("/nombre")//con quien lo unes>ahora se accede aqui con http://IP_SERVER/nombre
class nameController {//endpoint, es la cosa a pedir
    //esto recibe las peticiones de la app
    //como se hace una peticion HTTP> http://IP_SERVER/movie (cosa a pedir)

    @GetMapping("/")//cuando hagan http://IP_SERVER/nombre/ haz este metodo
    public String metodoPedido0(){return "no sale nada";}

    @GetMapping("/montse")//cuando hagan http://IP_SERVER/nombre/montse haz este metodo
    public String metodoPedido(){return "Montse coco";}

    @GetMapping("/bryan")//cuando hagan http://IP_SERVER/nombre/bryan haz este metodo
    public String metodoPedido2(){return "Bryan.com";}

    @GetMapping("/raul")//cuando hagan http://IP_SERVER/nombre/raul haz este metodo
    public String metodoPedido3(){return "Raul ola que ase";}

    @GetMapping("/oihane")//cuando hagan http://IP_SERVER/nombre/oihane haz este metodo
    public String metodoPedido4(){return "Oihane hoal que tal";}

    @GetMapping("/oihane/a")//cuando hagan http://IP_SERVER/nombre/oihane/a haz este metodo
    public String metodoPedido4_1(){return "Oihane Aaaaaaaaaaaaaaaaaaaaaaaaa";}
}
