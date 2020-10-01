package edu.umg.modelo;

public class Curso {
    /*Atributos de la clase*/
    private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private String catedratico;
    private int alumnosAsignados;

    public Curso(int id, String titulo, int numMaxAlumnos, int creditos) {
        this.id = id;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public int getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(int alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }

    public boolean verificarEspacio() {
        if (alumnosAsignados < numMaxAlumnos) {
            alumnosAsignados++;
            return true;

        }
        return false;
    }

}
