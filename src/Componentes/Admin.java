package Componentes;

import java.util.*;
import javax.swing.JOptionPane;

public class Admin extends Usuario implements Persona {
    
    //Scanner EntradaEscaner=new Scanner(System.in);

    public Admin(String Nom, String AP, String AM, String DNIcontra,int codigo) {
        super(Nom, AP, AM, DNIcontra,codigo);
    }
    
    
    @Override
    public void RegistrarDatos() {
        String h;
        h=JOptionPane.showInputDialog("Ingrese Codigo Docente");
        h=JOptionPane.showInputDialog("Ingrese Nombres de Docente");
        h=JOptionPane.showInputDialog("Ingrese Apellido Paterno");
        h=JOptionPane.showInputDialog("Ingrese Apellido Materno");
        h=JOptionPane.showInputDialog("Ingrese DNI de Docente");
        int i=Integer.parseInt(h);
    }
    
    @Override 
    public void ModificarCursos(){
        
    }

    @Override
    public void MostrarDatos() {
        System.out.println("\t---------Datos---------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellido Paterno: " + ApellidoP);
        System.out.println("Apellido Materno: " + ApellidoM);
        System.out.println("DNI: " + DNIcontra);
        
    }
    
    public String toString(){
        return getCodigo()+" "+getNombre()+" "+getApellidoP()+" "+getApellidoM()+
                " "+getDNIcontra()+" ";
    }

    @Override
    public void BuscarD() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
