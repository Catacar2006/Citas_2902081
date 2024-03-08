package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {

    //Proponer un metodo para agendar una cita
    public boolean agendarCita(LocalDateTime fecha, Consultorio c);
    
    //Proponer un metodo para reagendar una cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoC);

    //Cancelar una cita
    public boolean cancelarCita();
}
