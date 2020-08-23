package edu.umg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //1. menu
        //2. requerir valores teclado
        //3. crear objetos
                Empleado objSeguridad2 = new Empleado();
        Empleado objSeguridad = new Empleado(1, "Raul Padilla", 5000);
        Empleado objDecano = new Decano(2, "Florinda Meza", 20000);

        //4. crear nomina
        ArrayList<Empleado> nominaUMG = new ArrayList<Empleado>();
        //5. agregar empleados a la nomina
        nominaUMG.add(objSeguridad);
        nominaUMG.add(objDecano);
        nominaUMG.add( new Catedratico(3,"Ruben Aguirre", 1000, 3) );
        nominaUMG.add( new Catedratico(4,"Ramon Valdez", 1500, 6));

        System.out.println("ROL\t\t\t\t\t\t\tID\t\tNOMBRE\t\t\tSALARIO");
        System.out.println("----------------------------------------------------------------------------");
        for(Empleado empleado : nominaUMG){
            System.out.format("%25s %5d %15s %,10.2f\n", empleado.getClass().toString(), empleado.getIdEmpleado(),
                    empleado.getNombre(), empleado.calculoSalario());
        }

    }
}
