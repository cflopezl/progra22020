package edu.umg;

public class Catedratico extends Empleado{
    private int noCursos;

    public Catedratico(int idEmpleado, String nombre, double salario, int noCursos) {
        super(idEmpleado, nombre, salario);
        this.noCursos = noCursos;
    }

    public int getNoCursos() {
        return noCursos;
    }

    public void setNoCursos(int noCursos) {
        this.noCursos = noCursos;
    }

    @Override
    public double calculoSalario() {
        double salarioCursos = super.calculoSalario() * noCursos;
        // salario * noCursos + bono
        return salarioCursos +  ( salarioCursos * ( noCursos <= 3 ? 0.1 : 0.25) );
    }
}
