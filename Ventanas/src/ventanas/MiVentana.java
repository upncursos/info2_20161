/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class MiVentana extends JFrame implements ActionListener{
    JLabel texto;
    JTextField caja;
    public MiVentana()
    {
        
        this.setSize(250, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.caja = new JTextField();
        this.caja.setBounds(0,0,200,50);
        this.add(caja);
        int x=50;
        int y=50;
        int ancho=50;
        int alto=50;
        String valores="741=8520963./*-+";
        int k = 0;
        for(int i = 0; i<=3;i++)
        {
            for(int j=0;j<=3;j++)
            {
                JButton boton = new JButton(""+valores.charAt(k));
                boton.setBounds(i*x, j*y+50, ancho, alto);
              
                boton.addActionListener(this);
                  this.add(boton);
                   k++;
            }    
        }    
        
        this.setVisible(true);
        
        
    }        

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
     
    }
    
    
    
}
