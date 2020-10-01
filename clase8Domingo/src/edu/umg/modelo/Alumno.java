package edu.umg.modelo;

public class Alumno {
    /*Atributos de la clase*/
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;

    public Alumno(int carnet, String nombre, String direccion, String telefono, String edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    /*Metodp de imprimir Datos del Alumno*/
    public void  imprimirDatos() {
        String temp="";
        temp+="Alumno [carnet=" + carnet + ", nombre=" + nombre + ", "
                + "direccion=" + direccion + ", telefono=" + telefono
                + ", edad=" + edad + "]";
        System.out.println(temp);
    }
}
