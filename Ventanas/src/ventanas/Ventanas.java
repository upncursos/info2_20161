/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Ventanas {
    public static void main(String[] args) {
        JFrame ventana;
        ventana = new JFrame("programa");
        ventana.setSize(300, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        JLabel jl = new JLabel("algo");
        JTextField jf = new JTextField("otra cosa");
        jl.setBounds(0, 0, 200, 50);
        jf.setBounds(0,100,200,50);
        ventana.add(jl);
        ventana.add(jf);
        
        
        
        
        ventana.setVisible(true);
        
    }
    
}
