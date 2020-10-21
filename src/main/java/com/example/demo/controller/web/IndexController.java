package com.example.demo.controller.web;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

//    @GetMapping("/app")
//    public String index(Model model){
//
//        model.addAttribute("message","buen dia!!!");
//
//        ArrayList<String> lista=new ArrayList<>();
//        lista.add("Rigoberto");
//        lista.add("Jaime");
//        lista.add("Antonio");
//        lista.add("Marcela");
//
//        model.addAttribute("lista",lista);
//
//        return "index";
//    }

    @Autowired
    PersonaService service;

    @GetMapping("/app")
    public String index(Model model){

        model.addAttribute("message","buen dia!!!");
        List<Persona> lista=service.todasLasPersonas();
        model.addAttribute("lista",lista);

        return "index";
    }
}
