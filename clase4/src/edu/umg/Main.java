package edu.umg;

public class Main {

    public static void main(String[] args) {
        Universidad u1 = new Universidad("Universidad Mariano Galvez");
        u1.setSiglas("UMG");

        u1.addCarrera(new Carrera(7691, "Ingenieria en Sistemas de Informacion"));
        u1.addCarrera(new Carrera(7681, "Psicologia"));
        u1.addCarrera(new Carrera(7689, "Administracion de Empresas"));

        System.out.println(u1.toString());

    }
}
