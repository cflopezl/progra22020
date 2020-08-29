package edu.umg.modelo;

import edu.umg.utils.ErrorCode;
import edu.umg.utils.MyCustomException;

public class Carrera {
    private static int correlativoCodigo = 7690;
    private int codigo;
    private String nombre;

    public Carrera(String nombre)throws MyCustomException {
        this.codigo = correlativoCodigo++;
        if(validaNombre(nombre))
            this.nombre = nombre;
    }

    public Carrera() {
        this.codigo = correlativoCodigo++;
        this.nombre = "sin-nombre";
    }

    public int getCodigo() {
        return codigo;
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
