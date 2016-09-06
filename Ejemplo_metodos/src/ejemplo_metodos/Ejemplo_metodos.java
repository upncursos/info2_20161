/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_metodos;

/**
 *
 * @author user
 */
public class Ejemplo_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Robot r1 = new Robot();
        r1.nombre = "Wally";
        r1.posicion.x=2;
        r1.posicion.y=3;
        System.out.println(r1);
        r1.moverseAlaIzquierda(2);
        
        r1.moverseAabjo(3);
        System.out.println(r1);
        
    }
    
}
