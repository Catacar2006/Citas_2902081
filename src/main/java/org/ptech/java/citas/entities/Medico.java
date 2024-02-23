package org.ptech.java.citas.entities;

public class Medico {
    //ATRIBUTOS
    //POR REGLA GENERAL:
    //Los atributos de una clase deben ser private
    private int id;
    private String nombres;
    private String apllidos;
    private TipoDocumento tipoIdentificacion;
    private Long numeroDocumento;
    private Long registroMedico;
    private Especialidad especialidad;
    

    //Constructor defecto
    //siempre tiene el modificador de acceso public
    public Medico() {
    }

    //constructor con parametro
    public Medico(int id, String nombres, String apllidos, TipoDocumento tipoIdentificacion, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apllidos = apllidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroDocumento = numeroDocumento;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    //getter and setter
    //deben ser public los getter and setter
    //firma de un getter 
    // 1. tipo de dato de retorno= es el t.d del atributo
    //2. nombre del metodo = get seguido del nombre del atributo 
    //3.Parametros del metodo = no tiene nada 
    //4. retorna: retorna el valor del atributo
    public String getNombres() {
        //return sirve para retornar el valor al invocante
        return this.nombres;
    }


    //setter sirve para asiganr un valor a un atributo privado
    //firma de un setter
    //1. tipo de dato de setter obligatorio de retorno debe ser VOID(vacio)
    //2. nombre: set(asignar) seguido del nombre del atributo
    //3. parametros: si tiene parametros y solo tiene 1 y va ingresar el valor asiganr el atributo 
    //4. retorna: no retorna nd
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
