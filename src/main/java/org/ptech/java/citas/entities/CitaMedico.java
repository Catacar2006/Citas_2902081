package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{

    private String motivo;
    Medico medico;
    EstadoCita estado;


    

    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, String motivo, Medico medico,
            EstadoCita estado) {
        super(id, fecha, consultorio);
        this.motivo = motivo;
        this.medico = medico;
        this.estado = estado;
    }


    
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }



    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);
        return true;
    }

    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoC) {
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoC);
        return true;
    }

    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
        return true;
    }



    
    
}
