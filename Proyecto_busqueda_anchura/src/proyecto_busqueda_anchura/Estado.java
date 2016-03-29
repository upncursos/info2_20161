/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_busqueda_anchura;

/**
 *
 * @author user
 */
public class Estado {
    
    String nombre; 
    
    
    public Estado(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estado{" + "nombre=" + nombre + '}';
    }
            
}
