/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_geometria;

/**
 *
 * @author user
 */
public class Proyecto_Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1, p2;
        double distancia;
        p1 = new Punto();
        p2 = new Punto();
        p1.x = -5;
        p1.y = 1;
        p2.x = 5;
        p2.y = 1;
        distancia = p1.hallarDistancia(p2);
        System.out.println("La distancia de "+p1+ " a "+p2+" es "+distancia);
        
        
    }
    
}
