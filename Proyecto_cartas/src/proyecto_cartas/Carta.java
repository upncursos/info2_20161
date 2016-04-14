/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cartas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author user
 */
public class Carta {
    
    final static int AS=1;
    final static int J=11;
    final static int Q=12;
    final static int K=13;
    
    int valor;
    int pinta;

    public Carta(int valor, int pinta) {
        this.valor = valor;
        this.pinta = pinta;
    }
    public void dibujar(Graphics g,BufferedImage imagen)
    {
        BufferedImage img2 = imagen.getSubimage(0, 0, 79, 123);
        g.drawImage(img2, 50, 50, null);
        
        
    }

    @Override
    public String toString() {
        return "Carta{" + "valor=" + valor + ", pinta=" + pinta + '}';
    }
    

   
 
    
}
