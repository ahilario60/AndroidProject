package com.example.dam2.practica5_angelpablo;

/**
 * Created by dam2 on 03/02/2017.
 */

public class Tratamiento {

    private int id_enfermedad=0;
    private int id_medicamento=0;

    public int getId_enfermedad() {
        return id_enfermedad;
    }

    public void setId_enfermedad(int id_enfermedad) {
        this.id_enfermedad = id_enfermedad;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public Tratamiento(int id_medicamento, int id_enfermedad) {
        this.id_medicamento = id_medicamento;
        this.id_enfermedad = id_enfermedad;
    }
}
