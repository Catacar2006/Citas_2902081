package org.ptech.java.citas.entities;

import java.time.LocalDate;

public class Paciente {
    //Atributos
    private int id;
    private String nombres;
    private String apllidos;
    private TipoDocumento tipoIdentificacion;
    private Long numeroDocumento;
    private String email;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    //Constructor defecto
    public Paciente() {
    }

    
    //constructor con parametro
    public Paciente(int id, String nombres, String apllidos, TipoDocumento tipoIdentificacion, Long numeroDocumento,
            String email, Long celular, LocalDate fechaNacimiento, Double altura, Double peso, TipoSangre tipoSangre,
            char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apllidos = apllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

//getter and setter
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApllidos() {
        return apllidos;
    }


    public void setApllidos(String apllidos) {
        this.apllidos = apllidos;
    }


    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public Long getNumeroDocumento() {
        return numeroDocumento;
    }


    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Long getCelular() {
        return celular;
    }


    public void setCelular(Long celular) {
        this.celular = celular;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    

}
