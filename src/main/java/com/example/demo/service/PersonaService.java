package com.example.demo.service;


import com.example.demo.entity.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service //Capa de logica de negocio
public class PersonaService {

    @Autowired
    PersonaRepository repo;

    /**
     * Este metodo convierte de Iterador a Lista el conjunto de personas
     * @return List<Persona> Regresa la lista de personas
    */
    public List<Persona> todasLasPersonas(){

        Iterable<Persona> ite=repo.findAll();
        Iterator<Persona> it=ite.iterator();
        List<Persona> actualList = new ArrayList<Persona>();
        while (it.hasNext()) {
            actualList.add(it.next());
        }

        return  actualList;
    }

}
