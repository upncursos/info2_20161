/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cartas;

/**
 *
 * @author user
 */
public class Carta {
    
    String valor;
    String palo;

    @Override
    public String toString() {
        return valor+" de "+palo;
    }
    int obtenerValor()
    {
        return 0;
    }        
    
    
    
    
}
