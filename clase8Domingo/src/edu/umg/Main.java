package edu.umg;

import edu.umg.modelo.*;
import edu.umg.utils.Alertar;
import edu.umg.utils.MyLogger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Universidad u1 = null;
        try{
            u1 = new Universidad("Universidad Mariano Galvez");
            u1.setSiglas("UMG");
            u1.addCarrera(new Carrera("Ingenieria en Sistemas de Informacion"));
            u1.addCarrera(new Carrera("Psicologia"));
            u1.addCarrera(new Carrera("Administracion de Empresas"));

            //cursos
            Curso c1 = new Curso(17,"Programación II",2,5);
            Curso c2 = new Curso(6,"Precalculo",10,4);
            Curso c3 = new Curso(32,"Desarrollo Web",10,6);

            //alumnos
            Alumno a1 = new Alumno(17123,"Juan", "Boca", "12345678", "20");
            Alumno a2 = new Alumno(17124,"María se fue", "Boca", "12345679", "22");
            Alumno a3 = new Alumno(17125,"Pablo", "Boca", "12345677", "23");

            //Asignacion
            Asignacion asig1 = new Asignacion( a1,new ArrayList<Curso>( Arrays.asList(c1,c2,c3)) );
            Asignacion asig2 = new Asignacion( a2,new ArrayList<Curso>( Arrays.asList(c1,c2)) );
            Asignacion asig3 = new Asignacion( a3,new ArrayList<Curso>( Arrays.asList(c1,c3)) );

        }catch (Exception ex){
            ex.printStackTrace();
        }



    }
}
