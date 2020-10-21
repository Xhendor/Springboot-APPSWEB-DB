package com.example.demo.repository;

import com.example.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository
                              //Tabla y //ID (Long/Integer)
        extends CrudRepository<Persona, Integer> {
    //OBJETOS (Integer, Float, Double,Boolean) y
    // PRIMITIVOS (int, float, double, ...hex,boolean)
}
