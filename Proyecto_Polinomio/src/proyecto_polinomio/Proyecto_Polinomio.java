/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_polinomio;

/**
 *
 * @author user
 */
public class Proyecto_Polinomio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polinomio p, p2, y;
        double z;
        double w=3;
        p = new Polinomio();
        p2 = new Polinomio();
        p.a = 2;
        p.b = 3;
        p.c = 5;
        p2.a = 1;
        p2.b=2;
        p2.c =2;
        
        y = p.sumar(p2);
        System.out.println(y);
        
   
        
        
       
    }
    
}
