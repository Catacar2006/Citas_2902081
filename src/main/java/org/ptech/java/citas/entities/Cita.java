package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

public class Cita {
    //Atributos
    private int id;
    private LocalDateTime fecha;
    private Medico meico;
    private Paciente paciente;
    private Consultorio consultorio;
    private EstadoCita estado;
    

    //Constructor defecto
    public Cita() {
    }

    //Constructor con parametros
    public Cita(int id, LocalDateTime fecha, Medico meico, Paciente paciente, Consultorio consultorio,
            EstadoCita estado) {
        this.id = id;
        this.fecha = fecha;
        this.meico = meico;
        this.paciente = paciente;
        this.consultorio = consultorio;
        this.estado = estado;
    }


    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Medico getMeico() {
        return meico;
    }

    public void setMeico(Medico meico) {
        this.meico = meico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    
    
    
}
