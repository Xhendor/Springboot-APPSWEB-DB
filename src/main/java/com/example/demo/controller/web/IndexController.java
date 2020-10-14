package com.example.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class IndexController {

    @GetMapping("/app")
    public String index(Model model){

        model.addAttribute("message","buen dia!!!");

        ArrayList<String> lista=new ArrayList<>();
        lista.add("Rigoberto");
        lista.add("Jaime");
        lista.add("Antonio");
        lista.add("Marcela");

        model.addAttribute("lista",lista);

        return "index";
    }


}
