package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {

        //crear un medico 
        Medico m1 = new Medico(1, "Camila", "Escobar", TipoDocumento.CC , 8524965L, 88881L, Especialidad.DERMATOLOGIA);
    
        System.out.println("id medico:" + m1.getId() + "|"+ m1.getNombres() + " " + m1.getApllidos()  + "|" + m1.getEspecialidad());

    //crear un enfermero 
     Enfermero enfermero1 = new Enfermero(1, "Jack", "Ross", TipoDocumento.CC, 963741789L);    

     //añadir procedimientos
     enfermero1.addProcedure("Inyecciones");
     enfermero1.addProcedure("Sacar sangre");

     //recorrer los procedimeintos de enfermero1
    for(String p: enfermero1.getProcedimientos()){
        System.out.println("Procedimiento:" + p);

    //Crear 


    }

     
   








    }
}