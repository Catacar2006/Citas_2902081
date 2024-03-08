package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        //Instanciar un usuario
        Usuario u = new Usuario(1, "Carolina", "Garzon", TipoDocumento.CC, 748389839L);
        System.out.println(u.toString());

        Medico m = new Medico(1, "Sara", "Sanchez", TipoDocumento.TI, 6464515646465L, 258L,Especialidad.CARDIOLOGIA);
        System.out.println(m.toString());

        Paciente p = new Paciente(2, "Gabriel", "Lopez", TipoDocumento.CC, 2186465189L, "gabilopez@gmail.com", 
            548641745643L, LocalDate.now(), 1.58,56.8,  TipoSangre.A, '+');
        System.out.println(p.toString());

        Enfermero e = new Enfermero(5, "Diego", "Palacios", TipoDocumento.CC , 59648561685489L );
        System.out.println(e.toString());
    
    }
}
