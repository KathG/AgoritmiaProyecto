/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import EstructurasDeDatosGenericas.LGDE;

/**
 *
 * @author solangebarreda
 */
public class Matricula {
    
    protected int Semestre;
    protected int creditos;
    protected LGDE<Curso> cursos = new LGDE<Curso>();
    
    
}
