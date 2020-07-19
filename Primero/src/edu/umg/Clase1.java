package edu.umg;

public class Clase1 {
    public static void main(String []args){
        //Calcular el promedio de las notas del primero y segundo parcial
        //crear variables
        int primero, segundo;
        double promedio;

        //asignación de valores
        primero=90;
        segundo=75;

        //realizar el cálculo
        promedio = (primero + segundo) / 2;

        //desplegar el resultado
        System.out.println("Promedio: " + promedio);

        //asignación de valores
        primero=75;
        segundo=40;

        //realizar el cálculo
        promedio = (primero + segundo) / 2;

        //desplegar el resultado
        System.out.println("Promedio: " + promedio);

    }
}
