package edu.umg.modelo;

import edu.umg.modelo.Carrera;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String siglas;
    private List<Carrera> carreras;


    /*constructor*/

    public Universidad(String nombre) {
        this.nombre = nombre;
        carreras = new ArrayList();
    }


    public void addCarrera(Carrera c){
        carreras.add(c);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    @Override
    public String toString() {
        String temp = "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'';

        //recorrer el arreglo carreras
        int i= 1;
        for(Carrera tempCarrera : carreras){
            temp += "\n    CARRERA" + i++ + " " + tempCarrera.toString();
        }

        temp +=        '}';
        return temp;
    }
}
