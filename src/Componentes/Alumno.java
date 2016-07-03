package Componentes;

import EstructurasDeDatosGenericas.LGCDE;

public class Alumno extends Usuario {

    protected PlanDeEstudio plan_estudio;
    protected Matricula matricula;
    protected float promPonderado;
    protected Pair cursosAprobados;
    protected LGCDE<Alumno> listAlum = new LGCDE<Alumno>();
    
    //public Alumno(){}

    public Alumno(String Nom, String AP, String AM, String DNI, 
            int codigo,PlanDeEstudio plan_estudio, 
            Matricula matricula, float promPonderado, 
            Pair cursosAprobados) {
        super(Nom, AP, AM, DNI, codigo);
        this.plan_estudio = plan_estudio;
        this.matricula = matricula;
        this.promPonderado = promPonderado;
        this.cursosAprobados = cursosAprobados;
    }

    public PlanDeEstudio getPlan_estudio() {
        return plan_estudio;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public float getPromPonderado() {
        return promPonderado;
    }

    public Pair getCursosAprobados() {
        return cursosAprobados;
    }

    public LGCDE<Alumno> getListAlum() {
        return listAlum;
    }

    public void setPromPonderado(float promPonderado) {
        this.promPonderado = promPonderado;
    }
    
    
    
    
    

    

    public String toString() {
        return super.toString() + " ";
    }

}
