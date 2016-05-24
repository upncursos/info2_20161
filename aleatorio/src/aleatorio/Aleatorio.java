/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0;
        int cont=0;
        
        
        Scanner Teclado= new Scanner(System.in);
        num1= (int)(Math.random()*100 + 10);
        while (cont!=num1)
        {
        
        
            System.out.print("digite el numero : ");
            cont= Teclado.nextInt();
            if (cont>num1)
            {
                System.out.println("Su numero es mayor "); 
            }
            if (cont<num1)
            {
                System.out.println("Su numero es menor "); 
            }
            if (cont==num1)
            {
                System.out.println("Genial lo adivino  "); 
            }
 
        }
    }
    
}
