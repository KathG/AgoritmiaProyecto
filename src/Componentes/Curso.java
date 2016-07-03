package Componentes;

import EstructurasDeDatosGenericas.LGDE;

public class Curso {

    protected String codigo;
    protected String nombre;
    protected int nroCreditos;
    protected LGDE<Curso> cursosPrerequisitos = new LGDE<Curso>();
    protected int semestre;
    protected static LGDE<Curso> cursosEquivalentes = new LGDE<Curso>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public LGDE<Curso> getCursosPrerequisitos() {
        return cursosPrerequisitos;
    }

    public static LGDE<Curso> getCursosEquivalentes() {
        return cursosEquivalentes;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String toString() {
        return getCodigo() + " " + getNombre() + " " + getSemestre() + " " + getNroCreditos();
    }

}
