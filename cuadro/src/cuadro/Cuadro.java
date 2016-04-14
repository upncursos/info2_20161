/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadro;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Cuadro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aqui va mi codigo
        int num1,cont2,cont,total=1;
        String nombre;
        nombre="";
        Scanner Tecladito= new Scanner (System.in);
         System.out.print("digite el tamaño del cuadro : ");
       num1= Tecladito.nextInt();
        System.out.print("digite el nombre : ");
       nombre=Tecladito.next();
       System.out.println(" el nombre diogitado : "+nombre);
       //el for tiene 3 segmentos
        for ( cont2=0;cont2<num1 ;cont2++)
           {
                System.out.print("x");
           }
        System.out.println("");
        
        System.out.print("x");
           for ( cont2=1;cont2<=num1 ;cont2++)
           {
                System.out.print(" ");
           }
           System.out.println("x");
        System.out.println("x "+nombre+ " x");
           
          
       for ( cont=1;cont<=num1-4 ;cont++)
       {
           System.out.print("x");
           for ( cont2=1;cont2<=num1 ;cont2++)
           {
                System.out.print(" ");
           }
           System.out.println("x");
           
           
       }
       for ( cont2=1;cont2<=num1 ;cont2++)
           {
                System.out.print("x");
           }
       
       
      System.out.println("");
       
       
    }
    
}
