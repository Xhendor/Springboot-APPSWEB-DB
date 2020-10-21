package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Direccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDireccion;

    private String calle;
    private String colonia;
    private String cp;
    private String numext;
    private String numint;
    private String ciudad;
    private String estado;
    private String pais;
    private String referencias;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Persona> personas= new ArrayList<Persona>();


    public Direccion(String calle, String colonia, String cp, String numext,
                     String numint, String ciudad, String estado, String pais,
                     String referencias, List<Persona> personas) {
        this.calle = calle;
        this.colonia = colonia;
        this.cp = cp;
        this.numext = numext;
        this.numint = numint;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.referencias = referencias;
        this.personas = personas;
    }

    public Direccion() {

    }
}
