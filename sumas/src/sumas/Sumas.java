/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumas;
//aqui van las librerias
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Sumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1,num2,suma;
        num1="";
        num2="";
        suma="";
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingrese el primer nombre : ");
       num1= captura.next();
       System.out.print("Ingrese el segundo apellido: ");
       num2= captura.next();
       suma= num1+" "+num2;
       System.out.print("el resultado de la suma es: "+num1+" "+num2);
      
        
    }
    
}
