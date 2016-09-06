package ejemplo_metodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Robot {
    String nombre;
    Punto posicion = new Punto();

    @Override
    public String toString() {
        return "Robot{" + "nombre=" + nombre + ", posicion=" + posicion + '}';
    }
    public void moverseAlaDerecha(int pasos){

        this.posicion.x = this.posicion.x + pasos;   
    }
    public void moverseAlaIzquierda(int pasos){
        this.posicion.x = this.posicion.x - pasos;   
    }
    public void moverseAarriba(int pasos){
        this.posicion.y = this.posicion.y + pasos;   
    }
    public void moverseAabjo(int pasos){
        this.posicion.y = this.posicion.y - pasos;   
    }
    public void moverseDiagonal(int pasosx, int pasosy){
        this.posicion.x = this.posicion.x + pasosx;
        this.posicion.y = this.posicion.y + pasosy;
        
    }
    
}
