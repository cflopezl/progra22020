package edu.umg;

public class Promedio {

    public static void operacion(int valor1, int valor2){
        double resultado;
        resultado = (valor1 + valor2) / 2;
        System.out.println("Promedio: " +resultado);
    }

    public static void main(String args[]){

        operacion(90,75);
        operacion(75,40);
        operacion(100,80);

    }
}
