/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String x;
        int num1,num2,suma;
        x= "hola";
        num1=0;
        num2=0;
        suma=0;
        System.out.print("por favor ingresar 1 numero :"); 
        num1 = entrada.nextInt();
        System.out.print("por favor ingresar 2 numero :"); 
        num2 = entrada.nextInt();
        suma= num1+num2;
        
          System.out.println("el resultado es : "+suma); 
        
        
        /*
         x=entrada.next();
        
        if(x.equals("casa")){
            System.out.println("verdadero");     
        }
        else{
            System.out.println("falso");
        }
        */

        
    }
    
}
