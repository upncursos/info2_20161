/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_arreglos;

import java.util.ArrayList;
import proyecto_geometria.Punto;


/**
 *
 * @author user
 */
public class Proyecto_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[] = new int[10];
        /*
        Punto puntos[] = new Punto[10];
        
        for(int i=0;i<=9;i++){
        puntos[i] = new Punto();
        puntos[i].x = Math.random()*10;
        puntos[i].y = Math.random()*10;
        }
        for(int i=0;i<=9;i++){
            System.out.println(puntos[i]);
        }
        */
        
        ArrayList<Punto> puntos;
        puntos = new ArrayList<Punto>();
        
        Punto p;
        for(int i=0;i<=9;i++)
        {    
         p = new Punto();    
         p.x = i;
         p.y = i;
         puntos.add(p);
        }
        System.out.println(puntos);
        puntos.remove(0);
        System.out.println(puntos);
        
        for(int i=0;i<puntos.size();i++)
        {
            System.out.println(puntos.get(i));
        }    
        for(Punto w:puntos)
        {
            System.out.println(w);
        }
        
        
    }
    
}
