/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_dinamicos;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Arreglos_dinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(2);
        nombres.add("Carlos");
        nombres.add("Jairo");
        nombres.add("Marìa");
        nombres.add("Juan");
        System.out.println(nombres);
        nombres.remove(1);
        System.out.println(nombres);
        System.out.println(nombres.get(2));
        nombres.set(2, "Enrique");
        System.out.println(nombres);
              */
        
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Estudiante temporal;
        
        temporal = new Estudiante();
        temporal.nombres="Juan";
        temporal.apellidos="Perez";
        
        estudiantes.add(temporal);
        
           temporal = new Estudiante();
        temporal.nombres="Carlos";
        temporal.apellidos="Torres";
        
        estudiantes.add(temporal);
        for(int i=0;i<estudiantes.size();i++){
            System.out.println(estudiantes.get(i));
        }
            
        
        
        
        
    }
    
}
