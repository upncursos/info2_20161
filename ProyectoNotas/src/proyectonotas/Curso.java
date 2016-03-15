/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Curso {
    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    String nombre;
    void agregar(Estudiante nuevo)
    {
        this.estudiantes.add(nuevo);
    }     

    @Override
    public String toString() {
        return "Curso{" + "estudiantes=" + estudiantes + '}';
    }
    
    
    
}
