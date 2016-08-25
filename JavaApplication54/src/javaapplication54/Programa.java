/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import ejemplo1.Ejemplo1;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1;
        Punto p1;
        p1 = new Punto();
        p1.x=3;
        p1.y=5;
        c1 = new Circulo();
        c1.radio=4;
        c1.centro=p1;
        System.out.println(c1);
        p1.x=7;
        p1.y=2;
        System.out.println(c1);
        
    }
    
}
