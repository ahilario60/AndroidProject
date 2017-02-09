package com.example.dam2.practica5_angelpablo;

/**
 * Created by dam2 on 03/02/2017.
 */

public class Medicamentos {

    private String nombre="";
    private int precio=0;
    private String fabricante="";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Medicamentos(String nombre, int precio, String fabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }
}
