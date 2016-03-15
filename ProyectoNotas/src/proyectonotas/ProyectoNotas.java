/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

/**
 *
 * @author user
 */
public class ProyectoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = (int)(Math.random()*12);
        System.out.println(x);
        
    Estudiante e1,e2,e3;
    e1=new Estudiante();
    e2=new Estudiante();
    e3=new Estudiante();
    Curso mate1,info1;
    mate1=new Curso();
    info1=new Curso();
    e1.nombre = "Juan Perez";
    e2.nombre = "Catalina Rodriguez";
    e3.nombre = "Carlos Torres";
    mate1.nombre= " Matemàticas I";
    info1.nombre=" Informática I";
    
    mate1.agregar(e1);
    mate1.agregar(e3);
    info1.agregar(e1);
    info1.agregar(e2);
    
        System.out.println(mate1);
        System.out.println(info1);
    
 
    }
  
}
