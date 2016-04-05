/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_geometria;

/**
 *
 * @author user
 */
public class Proyecto_Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto a, b,c;
        
        a = new Punto();
        b = new Punto();
        c = new Punto();
        a.x=3;
        a.y=4;
        b = a;
        b.x = b.x +2;
        c = b;
        c.x = c.x +1;
        c.y = c.y -1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        /*
        p1.x = -5;
        p1.y = 1;
        p2.x = 5;
        p2.y = 1;
        distancia = p1.hallarDistancia(p2);
        System.out.println("La distancia de "+p1+ " a "+p2+" es "+distancia);
        
        Circulo c;
        c = new Circulo();
        c.radio = 5;
        c.centro = p1;
      
        System.out.println(c);
        
        Triangulo t = new Triangulo();
        t.vertice1 = new Punto();
        t.vertice2 = new Punto();
        t.vertice3 = new Punto();
        
        t.vertice1.x = -5;
        t.vertice1.y = 0;
        t.vertice2.x = 5;
        t.vertice2.y = 0;
        t.vertice3.x = 0;
        t.vertice3.y = 2;
        
        t.hallarPermitro();
        System.out.println(t);
        
        String s = "AS";
        int x;
        x = Integer.parseInt(s);
        System.out.println(x);
        */
        
        
    }
    
}
