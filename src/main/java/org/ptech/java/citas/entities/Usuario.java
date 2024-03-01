package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

//clase padre
    //super clase
    //clase maestra 
    


public abstract class Usuario {

        // atributos  protegidos
        //deben ser protegido
    protected int id;
    protected String nombres;
    protected String apllidos;
    protected TipoDocumento tipoIdentificacion;
    protected Long numeroDocumento;

    //Constructor parametrizado
    public Usuario(int id, String nombres, String apllidos, TipoDocumento tipoIdentificacion, Long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apllidos = apllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApllidos() {
        return apllidos;
    }

    public void setApllidos(String apllidos) {
        this.apllidos = apllidos;
    }

    public TipoDocumento getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoDocumento tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    

    
}
