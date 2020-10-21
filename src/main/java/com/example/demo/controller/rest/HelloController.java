package com.example.demo.controller.rest;


import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    PersonaService service;

    @RequestMapping("/")
   public  @ResponseBody List<Persona> helloWorld() {

        return service.todasLasPersonas();
    }

    @RequestMapping("/saludo")
    public String saludo() {
        return "<h2>Holis!!!</h2>";
    }

    @GetMapping("/saludo/{nombre}/{edad}")
    public String saludo(@PathVariable String nombre, @PathVariable int edad){

        return "Hola, "+nombre+" naciste el año: "+ (new Date().getYear()-edad) ;
    }



}
