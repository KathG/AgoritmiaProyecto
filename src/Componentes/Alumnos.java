package Componentes;

import EstructurasDeDatosGenericas.LGCDE;

public class Alumnos extends Usuario {

    private String plan_estudio;
    protected LGCDE<Alumnos> listAlum = new LGCDE<Alumnos>();

    public Alumnos(String plan_estudio, String Nom, String AP, String AM, String DNIcontra) {
        super(Nom, AP, AM, DNIcontra);
        this.plan_estudio = plan_estudio;
    }

    public Alumnos() {
    }

    public String getPlan_estudio() {
        return plan_estudio;
    }

    public void setPlan_estudio(String plan_estudio) {
        this.plan_estudio = plan_estudio;
    }

    public String toString() {
        return super.toString() + " " + getPlan_estudio();
    }

}
