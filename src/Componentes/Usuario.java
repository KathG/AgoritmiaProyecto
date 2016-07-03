package Componentes;

public class Usuario {

    private int codigo;
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String DNI;

    public Usuario(String Nom, String AP, String AM, String DNI,int codigo) {
        this.nombre = Nom;
        this.ApellidoP = AP;
        this.ApellidoM = AM;
        this.DNI = DNI;
        this.codigo=codigo;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public String getDNI() {
        return DNI;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    

    public String toString() {
        return getCodigo() + " " + getNombre() + " "+" "+getApellidoP()+" "+getApellidoM()+" "+getDNI();
    }

}
