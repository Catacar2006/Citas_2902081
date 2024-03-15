package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;

public class Cita {
    //Atributos
     int id;
     LocalDateTime fecha;
     Consultorio consultorio;
     

   

    

    public Cita(int id, LocalDateTime fecha, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
    }


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


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }


    
    
    
    
}
