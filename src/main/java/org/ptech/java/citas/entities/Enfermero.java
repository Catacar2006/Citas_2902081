package org.ptech.java.citas.entities;
import java.util.ArrayList;
import java.util.List;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {
    private List<String> procedimientos;

    public Enfermero(int id, String nombres, String apllidos, TipoDocumento tipoIdentificacion, Long numeroDocumento) {
        //1.llamar al constructor de la super clase
        super(id, nombres, apllidos, tipoIdentificacion, numeroDocumento);
        //2,inicializar atributos intrinsecos del objeto
        this.procedimientos = new ArrayList<String>(); // se crea la lista de procedimeintos
    }
    
    // esto es un medoto
    public void addProcedure(String procedure){
        //añadir al string procedimiento a la lista de procedimiento
        this.procedimientos.add(procedure);
    }

    //getter and setter
    public List<String> getProcedimientos() {
        return procedimientos;
    }

   

}
