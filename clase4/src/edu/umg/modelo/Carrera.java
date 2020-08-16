package edu.umg.modelo;

import edu.umg.utils.ErrorCode;
import edu.umg.utils.MyCustomException;

public class Carrera {
    private int codigo;
    private String nombre;

    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Carrera(int codigo) {
        this.codigo = codigo;
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Carrera() {
        this.codigo = 0;
        this.nombre = "sin-nombre";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) throws MyCustomException {
        if( validaNombre(nombre) ) {
            this.nombre = nombre;
        }

    }

    private boolean validaNombre(String nombre) throws MyCustomException{
        if( nombre.length() < 5 ){
            //lanzar una exception throw
            throw new MyCustomException("El nombre debe ser mayor a 5 caracteres", ErrorCode.TAMANIO_MINIMO);
        }
        return true;
    }



    public void setNombre() {
        this.nombre = "sin-nombre";
    }


    @Override
    public String toString() {
        return "Carrera{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
