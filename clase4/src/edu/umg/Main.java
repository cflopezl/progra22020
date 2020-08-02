package edu.umg;

public class Main {

    public static void main(String[] args) {
        Universidad u1 = new Universidad("Universidad Mariano Galvez");
        u1.setSiglas("UMG");

        u1.setCarrera1(new Carrera(7691, "Ingenieria en Sistemas de Informacion"));

        u1.setCarrera2(new Carrera(7681, "Psicologia"));



        System.out.println(u1.toString());

    }
}
