package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
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

    //    //crear un medico 
    //    Medico m1 = new Medico(1, "Camila", "Escobar", TipoDocumento.CC , 8524965L, 88881L, Especialidad.DERMATOLOGIA);
    //
    //    System.out.println("id medico:" + m1.getId() + "|"+ m1.getNombres() + " " + m1.getApllidos()  + "|" + m1.getEspecialidad());
//
    ////crear un enfermero 
    // Enfermero enfermero1 = new Enfermero(1, "Jack", "Ross", TipoDocumento.CC, 963741789L);    
//
    // //añadir procedimientos
    // enfermero1.addProcedure("Inyecciones");
    // enfermero1.addProcedure("Sacar sangre");
//
    // //recorrer los procedimeintos de enfermero1
    //for(String p: enfermero1.getProcedimientos()){
    //    System.out.println("Procedimiento:" + p);

//-------------------------------------------------------------------------------------------------------------------------------------------------------

    //Crear Medicos
        Medico med1 = new Medico(1, "Carlos", "Perez", TipoDocumento.CC, 456963L, 258L, Especialidad.CARDIOLOGIA);
        Medico med2 = new Medico(2, "Sofia", "Cardona", TipoDocumento.CC, 72594L, 369L, Especialidad.MEDICINA_GENERAL);

    //Crear Pacientes 
        Paciente pa1 = new Paciente(1, "Jorge", "Mendez", TipoDocumento.CE, 85296L, "jorgeMendez@gmail.com", 
        852741L, LocalDate.now(), 1.76, 60.3, TipoSangre.A, '+');

        Paciente pa2 = new Paciente(2, "Lucia", "Parra", TipoDocumento.CM, 654741L, "luciaparra@gmail.com", 
        12396L, LocalDate.now(), 1.60, 57.2, TipoSangre.AB, '-');

        Paciente pa3 = new Paciente(3, "Mariana", "Cufiño", TipoDocumento.RC, 357418L, "marianacufiño@gmail.com", 
        159863L, LocalDate.now(), 1.63, 60.3, TipoSangre.A, '-');

        Paciente pa4 = new Paciente(4, "Samuel", "Cardenas", TipoDocumento.TI, 650358L, "samuelcardenas@gmail.com", 
        2380410L, LocalDate.now(), 1.57, 61.0, TipoSangre.O, '+');

        Paciente pa5 = new Paciente(5, "Deivid", "Castañeda", TipoDocumento.CC, 8593L, "deividcastañeda@gmail.com", 
        2357480L, LocalDate.now(), 1.87, 70.4, TipoSangre.O, '+');

    //Crear enfermeros

        Enfermero enfe1 = new Enfermero(1, "Camila","Rodriguez", TipoDocumento.CC, 852456L);

        Enfermero enfe2 = new Enfermero(2, "Andrea", "Dangom", TipoDocumento.CC, 8524697L);

        Enfermero enfe3 = new Enfermero(3, "Santiago", "Buitrago", TipoDocumento.CC, 852741L);

    //Crear consultorio

        Consultorio consul1 = new Consultorio(1, "Cr 160", 258);

        Consultorio consul2 = new Consultorio(2, "Cll 34", 635);

    //Registrar citas medicos
        CitaMedico citam1 = new CitaMedico(1, LocalDateTime.now(), consul2, "Gripe", med2, EstadoCita.AGENDADA);
        CitaMedico citam2 = new CitaMedico(2, LocalDateTime.now(), consul1, "Escopolamina",med1, EstadoCita.AGENDADA);

    System.out.println(" " + citam2.getFecha().toString()+ ", " + citam2.getConsultorio() + ", " + "Medico:" +med2.getNombres() + " " + 
        med2.getApllidos() + ", " + "Paciente: " + pa1.getNombres() + " " + pa1.getApllidos());

    //Registro citas enfermeros
    CitaEnfermero citaen1 = new CitaEnfermero(1, LocalDateTime.now(), consul2, "Vacuna", enfe1, EstadoCita.AGENDADA, pa5);
    CitaEnfermero citaen2 = new CitaEnfermero(2, LocalDateTime.now(), consul1, "Lavado de oidos", enfe2, EstadoCita.AGENDADA, pa4);

    System.out.println(" " + citaen1.getFecha().toString()+ ", " + citaen1.getConsultorio() + ", " + "Enfermera:" +enfe1.getNombres() + " " + 
        enfe1.getApllidos() + ", " + "Paciente: " + pa4.getNombres() + " " + pa4.getApllidos());
     
    citam1.cancelarCita();
    System.out.println("El estado de su cita es:" + citaen1.getEstado().CANCELADA);





    }
}
