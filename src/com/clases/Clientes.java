package com.clases;

import java.util.ArrayList;


public class Clientes {

    private  String nombre;
    private  int cedula;

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    private  ArrayList<BeneficiosCovid19> beneficiosclientes;


    public ArrayList<BeneficiosCovid19> getBeneficiosclientes() {
        return beneficiosclientes;
    }

    public void setBeneficiosclientes(ArrayList<BeneficiosCovid19> beneficiosclientes) {
        this.beneficiosclientes = beneficiosclientes;
    }

    public Clientes(String nombre, int cedula, ArrayList<BeneficiosCovid19> beneficiosclientes) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.beneficiosclientes = beneficiosclientes;
    }
}
