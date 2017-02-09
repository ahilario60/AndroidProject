package com.example.dam2.practica5_angelpablo;

/**
 * Created by dam2 on 03/02/2017.
 */

public class Enfermedad {

    private String nombre="";
    private String sintomas="";


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Enfermedad(String nombre, String sintomas) {
        this.nombre = nombre;
        this.sintomas = sintomas;
    }


}

