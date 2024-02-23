package org.ptech.java.citas.entities;

public class Consultorio {
    //Atributos
    private int id;
    private String direccion;
    private int numero;

    //Constructor defecto
    public Consultorio() {
    }

    //constructor con parametro
    public Consultorio(int id, String direccion, int numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }


    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
