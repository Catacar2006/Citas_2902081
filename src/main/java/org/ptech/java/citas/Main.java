package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.EstadoCita;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {

    //crear un objeto medico = instanciar medico
    //una manera de dar valor a atributos privados en una clase es a travéz del constructor parametrizado
        Medico m = new Medico(1,"Hector Jose", "Cardona", TipoDocumento.CC, 1031650358L,208181L, Especialidad.DERMATOLOGIA );   
        
         //instanciar otro medico
        Medico m2 = new Medico();
    //se debe utilzar 1 el setter del atributo asigando 
         m2.setNombres("Sofia");
         m2.setApllidos("Castillo");
         m2.setNumeroDocumento(73823934L);
         System.out.println(m2.getNombres());



         //Crear pacientes
         Paciente p = new Paciente(1, "Monica", "Galindo", TipoDocumento.CC, 923389238L, 
         "Monicag@gmail.com", 5146164946L, LocalDate.of(1994,Month.FEBRUARY,12),1.57, 58.3, TipoSangre.O, '+');

         Consultorio c1 = new Consultorio();
         c1.setNumero(528);
         c1.setDireccion(" cr 160");

         Consultorio c2 = new Consultorio();
         c2.setNumero(963);
         c2.setDireccion(" cl 45");

         Cita cm1 = new Cita();
         cm1.setEstado(EstadoCita.AGENDADA);

         System.out.println(p.getNombres() +"|"+ "Consultorio:" + c1.getNumero() + "|" + cm1.getEstado());
         
          
         
         
         
         
         
         
         
         
         
         
    }

   








}