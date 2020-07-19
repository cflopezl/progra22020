package edu.umg;

public class Main {

    /**
     * Calcula el promedio de dos valores proporcionados por parámetro
     * @param valor1 primer valor
     * @param valor2 segundo valor
     */
    public  static void promedio(int valor1, int valor2){
        double resultado = (valor1 + valor2)/2;
        System.out.println(resultado);
    }

    /**
     * Método principal del programa
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        promedio(90,75);
        promedio(75,50);


    }


}
