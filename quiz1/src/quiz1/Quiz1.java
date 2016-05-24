/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num1,cont2,cont,total=1,opc=0;
         float num3=0,res3=0;
        String nombre;
        nombre="";
        do
        {
            
        Scanner Tecladito= new Scanner (System.in);
        System.out.println("* que programa quiere correr * "); 
        System.out.println("1. Cuadro "); 
        System.out.println("2. multiplos "); 
        System.out.println("3. tabla de divisiones "); 
        System.out.println("4. salir "); 
        System.out.print("Digite su opcion : "); 
       opc= Tecladito.nextInt();
       
       if (opc==1)
       {
           System.out.println("programa 2");
                System.out.print("digite el tamaño del cuadro : ");
              num1= Tecladito.nextInt();
               System.out.print("digite el caracter : ");
              nombre=Tecladito.next();
              System.out.println(" el nombre diogitado : "+nombre);
              //el for tiene 3 segmentos
               for ( cont2=0;cont2<num1 ;cont2++)
                  {
                       System.out.print(nombre);
                  }
               System.out.println("");
                for ( cont=1;cont<=num1-2 ;cont++)
              {
                  System.out.print(nombre);
                  for ( cont2=1;cont2<=num1 ;cont2++)
                  {
                       System.out.print(".");
                  }
                  System.out.println(nombre);


              }
              for ( cont2=1;cont2<=num1 ;cont2++)
                  {
                       System.out.print(nombre);
                  }


             System.out.println("");


        }
       if (opc==2)
           {
               System.out.println("programa 1");
                 System.out.print("digite el numero : ");
              num1= Tecladito.nextInt();
              cont2=1;
              System.out.println(cont2);
              for ( cont2=0;cont2<num1 -1;)
                  {
                      cont2=cont2+3;
                       System.out.println(cont2);
                        
                       
                  }
               
           }
     if (opc==3)
           {
               System.out.println("programa 3");
                 System.out.print("digite el numero de la tabla para verla : ");
              num3= Tecladito.nextFloat();
               
               for ( cont2=1;cont2<=10 ;cont2++)
                  {
                      res3=num3/cont2;
                       System.out.println(num3+" / "+cont2+ " = "+res3);
                  }
           }
     
        }
        while (opc!=4);
     
    }
    
}
