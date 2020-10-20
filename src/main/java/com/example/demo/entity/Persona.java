package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    private int idPersona;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    //fecha_nacimiento = fechaNacimiento
    private Date fechaNacimiento;

    public Persona(String nombre, String appaterno, String apmaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.fechaNacimiento = fechaNacimiento;
    }


    public Persona() {

    }
}
