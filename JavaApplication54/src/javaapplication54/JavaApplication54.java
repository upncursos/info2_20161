/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1;
        c1 = new Circulo();
        c1.radio=5;
        
        c1.centro.x=3;
        c1.centro.y=4;
        System.out.println(c1);
        
    }
    
}
