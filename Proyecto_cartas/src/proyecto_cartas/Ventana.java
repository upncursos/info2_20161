/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cartas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Ventana extends JFrame{
    public Ventana()
    {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }   

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        InputStream is;
        is=Ventana.class.getResourceAsStream("cartas.png");
       
        BufferedImage img,img2;
        
        try {
            int ancho = 79;
            int alto = 123;
            int fila=1;
            int columna=4;
            img = ImageIO.read(is);
            img2 = img.getSubimage(0, 0, ancho, alto);
            g.drawImage(img2, 50, 50, null);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
}
