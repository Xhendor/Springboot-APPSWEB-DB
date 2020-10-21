package com.example.demo.component;

import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class Test implements CommandLineRunner {

    //Injeccion de codigo/dependencias
    @Autowired
    PersonaRepository repo;

    @Override
    public void run(String... args) throws Exception {

    Persona persona=new Persona(
            "Rosendo",
            "Sosa",
            "Canales",
            new Date());

    repo.save(persona);
        Persona personaA=new Persona(
                "Jaimico",
                "Ramos",
                "Salazar",
                new Date());
    repo.save(personaA);

        //Convertir Iterador a Lista
        Iterable<Persona> ite=repo.findAll();
        Iterator<Persona> it=ite.iterator();
        List<Persona> actualList = new ArrayList<Persona>();
        while (it.hasNext()) {
            actualList.add(it.next());
        }

        for(Persona p:actualList){

            System.err.println("Nombre: "+p.getNombre());
            System.err.println("Apellido Paterno: "+p.getAppaterno());
            System.err.println("Apellido Materno: "+p.getApmaterno());

        }
    }
}
