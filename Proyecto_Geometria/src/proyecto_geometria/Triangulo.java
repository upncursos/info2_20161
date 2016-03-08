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
public class Triangulo {
    Punto vertice1;
    Punto vertice2;
    Punto vertice3;

    @Override
    public String toString() {
        return "Triangulo{" + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", vertice3=" + vertice3 + '}';
    }
    
    public double hallarPermitro()
    {
        double perimetro=0;
        double lado1,lado2,lado3;
        lado1 = vertice1.hallarDistancia(vertice2);
        lado2 = vertice2.hallarDistancia(vertice3);
        lado3 = vertice3.hallarDistancia(vertice1);
        perimetro= lado1+lado2+lado3;
        return perimetro;
    }
    public double hallarArea()
    {
        double s = this.hallarPermitro()/2;
        double a = this.vertice1.hallarDistancia(this.vertice2);
        double b = this.vertice2.hallarDistancia(this.vertice3);
        double c = this.vertice3.hallarDistancia(this.vertice1);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }        

    
}
