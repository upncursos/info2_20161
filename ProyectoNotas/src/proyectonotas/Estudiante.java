/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectonotas;

/**
 *
 * @author user
 */
public class Estudiante {
    
    int codigo;
    String nombre;
    double Parcial1, Parcial2, Examen;
    
    public double calcularDefinitiva(){
        
        double x;
        x = (this.Parcial1+this.Parcial2+this.Examen)/3;
        return x;
    }
    public boolean aprueba(){
        boolean aprueba;
        
        if (this.calcularDefinitiva()>=3){
            aprueba = true;
            
        }
        else {
            aprueba = false;
            
        }
        return aprueba;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", Parcial1=" + Parcial1 + ", Parcial2=" + Parcial2 + ", Examen=" + Examen + '}';
    }
    
}
