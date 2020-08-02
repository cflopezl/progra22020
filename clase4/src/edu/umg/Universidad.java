package edu.umg;

public class Universidad {
    private String nombre;
    private String siglas;
    private Carrera carrera1;
    private Carrera carrera2;

    /*constructor*/

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    /*Funcionalidad (set,get) = accesors*/


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

    public Carrera getCarrera1() {
        return carrera1;
    }

    public void setCarrera1(Carrera carrera1) {
        this.carrera1 = carrera1;
    }

    public Carrera getCarrera2() {
        return carrera2;
    }

    public void setCarrera2(Carrera carrera2) {
        this.carrera2 = carrera2;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'' +
                "\n  CARRERA1 " + carrera1.toString() +
                "\n  CARRERA2 " + carrera2.toString() +
                '}';
    }
}
