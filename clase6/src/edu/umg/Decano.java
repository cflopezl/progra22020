package edu.umg;

public class Decano extends Empleado {
    public Decano(int idEmpleado, String nombre, double salario) {
        super(idEmpleado, nombre, salario);
    }

    @Override
    public double calculoSalario() {
        //2. solución 2 para decano
        return super.calculoSalario() + 5000;
    }
}
