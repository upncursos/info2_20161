/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

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
        
        String x=entrada.next();
        
        if(x=="casa"){
            System.out.println("verdadero");     
        }
        else{
            System.out.println("falso");
        }
        

        
    }
    
}
