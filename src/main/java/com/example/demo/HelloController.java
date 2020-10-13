package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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


}
