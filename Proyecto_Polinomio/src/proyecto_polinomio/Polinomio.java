/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_polinomio;

/**
 *
 * @author user
 */
public class Polinomio {
    double a;
    double b;
    double c;

    @Override
    public String toString() {
        
        return  a + "x^2 + " + b + "x +" + c;
    }
    public double evaluarEn (double x)
    {
        double resultado;
        resultado = this.a*Math.pow(x,2) + this.b*Math.pow(x, 1) + this.c;
        return resultado;
    }
    public Polinomio sumar(Polinomio otro)
    {
       Polinomio resultante;
       resultante = new Polinomio();
       resultante.a = this.a + otro.a;
       resultante.b = this.b + otro.b;
       resultante.c = this.c + otro.c;
       return resultante;        
    }        
           
    
    
    
}
