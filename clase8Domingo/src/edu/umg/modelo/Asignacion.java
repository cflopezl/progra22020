package edu.umg.modelo;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
    private Alumno alumno;
    private List<Curso> cursos;

    public Asignacion(Alumno alumno, List<Curso> cursos) {
        this.cursos = new ArrayList<Curso>();
        this.alumno = alumno;
        for (Curso c:cursos) {
            if(c.verificarEspacio())
                this.cursos.add(c);
            else
                System.out.println(alumno.getNombre() + ": No fue hecha la asignación, cupo lleno en el curso "
                        + c.getTitulo() + " (" + c.getNumMaxAlumnos() + ")" );
        }
    }


}
