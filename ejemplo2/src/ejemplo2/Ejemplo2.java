/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Ejemplo2 {
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner capturar = new Scanner (System.in);
       String usuario="";
       String clave="";
       System.out.println("Ingrese su usuario : ");
       usuario = capturar.next();
       if (usuario.contains("pepe"))
       {
           System.out.println("Ingrese su clave : " );
           clave = capturar.next();
           if (clave.contains("246" ))
           {
               System.out.println("Ingreso correcto" );
           }
           else
           {
               System.out.println("error de validación" );
           }
           
       }
       else
       {
           System.out.println("el usuario  "+usuario+ " no existe...." );
       }
       
        
    }
    
}
