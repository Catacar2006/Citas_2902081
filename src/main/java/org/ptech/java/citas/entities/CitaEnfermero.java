package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable {

    private String procedimiento;
    Enfermero enfermero;
    EstadoCita estado;
    Paciente paciente;

    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, String procedimiento,
            Enfermero enfermero, EstadoCita estado, Paciente paciente) {
        super(id, fecha, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
        this.estado = estado;
        this.paciente = paciente;
    }

    //getter and setter 
    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
