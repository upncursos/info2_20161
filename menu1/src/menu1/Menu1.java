/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Menu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,resul,opc;
        
        num1=0;
        num2=0;
        num3=0;
        resul=0;
        opc=0;
        Scanner captura= new Scanner (System.in);
        
       do
        {
             System.out.println("1 suma 3 #");
              System.out.println("2 resta");
               System.out.println("3 salir");
               opc= captura.nextInt();
               
               if (opc==1)
               {
                   System.out.println("ingrese el 1 numero");
                   num1= captura.nextInt();
                   System.out.println("ingrese el 2 numero");
                   num2= captura.nextInt();
                   System.out.println("ingrese el 3 numero");
                   num3= captura.nextInt();
                   resul=num1+num2+num3;
                   System.out.println("el resultado es"+resul);
               }
               if (opc==2)
               {
                   System.out.print("ingrese el 1 numero");
                   num1= captura.nextInt();
                   System.out.print("ingrese el 2 numero");
                   num2= captura.nextInt();
                   resul=num1-num2;
                   System.out.print("el resultado es"+resul);
               }
            
        }
        while(opc!=3);
                
        
        
    }
    
}
