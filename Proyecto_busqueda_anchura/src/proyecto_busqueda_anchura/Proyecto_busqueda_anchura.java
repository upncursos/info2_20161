/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_busqueda_anchura;

/**
 *
 * @author user
 */
public class Proyecto_busqueda_anchura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estado a = new Estado("A");
        Estado b = new Estado("B");
        Estado c = new Estado("C");
        
        Cola cola = new Cola();
        
        cola.agregar(a);
        cola.agregar(b);
        cola.agregar(c);
        
        System.out.println(cola);
        System.out.println("se toma");
        Estado e = cola.tomar();
        System.out.println(e);
        System.out.println("cola");
        System.out.println(cola);
        
        
    }
    
}
