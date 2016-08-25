/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Programa_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog("Menu\n a) Crear Estudiante\n b) Listar Estudiantes\n d)salir");
        
        
        Persona gente[] = new Persona [5];
        for(int i=0;i<=4;i++){
           gente[i] = new Persona();
           gente[i].nombres = JOptionPane.showInputDialog("Nombres:");
           gente[i].apellidos = JOptionPane.showInputDialog("Apellidos:");
           int x = Integer.parseInt(JOptionPane.showInputDialog("x:"));
           double z = Double.parseDouble(JOptionPane.showInputDialog("x:"));
        }
     
        for(int i=0;i<=2;i++){
            System.out.println(gente[i]);
        }
            
        
    }
    
}
