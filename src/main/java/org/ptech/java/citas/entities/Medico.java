package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

//clase que heredan
// -clase hijas
// -subclase
// - clase detalle
// -clase epsecificas

public class Medico extends Usuario{
   
    private Long registroMedico;
    private Especialidad especialidad;

    

    @Override
    public String toString() {
        return "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + ", nombre:" + super.nombres + super.apllidos + super.id + "]";
    }

    // constructor defecto
    public Medico(int id, String nombres, String apllidos, TipoDocumento tipoIdentificacion, Long numeroDocumento, Long registroMedico, Especialidad especialidad) {
        //si quieres instanciar un medico 
        //tambien deben instanciar el usuario
        //super en el constructor invoca (llama, ejecuta)
        //el constructor de la clase padre (super clase)
        //super() llamada al constructor de la superclase
        //debe ser lo primero que aparezca en el 
        //constructor de la clase hija 
        super(id, nombres, apllidos, tipoIdentificacion, numeroDocumento);
        //acontinuacion inicializamos 
        //atributos propios de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
   
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    
    

    
    
}
