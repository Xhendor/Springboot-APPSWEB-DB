package com.example.demo.entity;

import lombok.Data;

//JPA - Java Persistence API
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
//JAVA BEAN
@Entity  //Le decimos que es un representacion de una tabla-procedimeinto almacenado-vista
@Data
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    private int idPersona;//id_persona -> id persona > idPersona
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
