/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JButton boton;
    public MiVentana()
    {
        
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.texto = new JLabel("Digite su nombre");
        this.caja = new JTextField();
        this.boton = new JButton("Aceptar");
        this.texto.setBounds(0, 0, 200, 50);
        this.caja.setBounds(0,100,200,50);
        this.boton.setBounds(0, 150, 200, 50);
        this.add(this.caja);
        this.add(this.boton);
        this.add(this.texto);
        this.boton.addActionListener(this);
        this.setVisible(true);
        
        
    }        

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Botòn presionado");  
        
    }
    
    
    
}
