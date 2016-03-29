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
public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public Punto(double x) {
        this.x = x;
        this.y = 0;
    }


    public Punto() {
        this.x=0;
        this.y=0;
    }
    
   
   
    
    double hallarDistancia(Punto otro)
    {
        double distancia;
        distancia = Math.sqrt(Math.pow(this.x-otro.x, 2)+Math.pow(this.y-otro.y,2));
        return distancia;
    }        

    @Override
    public String toString() {
        return "(" + x + " , " + y + ")";
    }
    
    
}
