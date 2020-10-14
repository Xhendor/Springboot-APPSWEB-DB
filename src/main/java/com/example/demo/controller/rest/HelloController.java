package com.example.demo.controller.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/")
   public String helloWorld() {
        return "<h2>Hello World!</h2>";
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
