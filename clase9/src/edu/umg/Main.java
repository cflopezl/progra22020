package edu.umg;

import edu.umg.modelo.Carrera;
import edu.umg.modelo.Universidad;
import edu.umg.utils.Alertar;
import edu.umg.utils.MyLogger;

public class Main {

    public static void main(String[] args) {
        Universidad u1 = null;
        try{
            u1 = new Universidad("Universidad Mariano Galvez");
            u1.setSiglas("UMG");
            u1.addCarrera(new Carrera("Ingenieria en Sistemas de Informacion"));
            u1.addCarrera(new Carrera("Psi"));
            u1.addCarrera(new Carrera("Administracion de Empresas"));

        }catch (Exception ex){
            ex.printStackTrace();
        }



        System.out.println(u1.toString());

    }
}
