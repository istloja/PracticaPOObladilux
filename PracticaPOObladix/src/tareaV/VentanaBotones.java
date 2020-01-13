/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaV;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class VentanaBotones {
    

/**
 *
 * @author USUARIO
 */

    public static void main(String[] args) {
        JFrame f=new JFrame("hola");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(2,4));
        JLabel label=new JLabel("hola");
        JLabel label1=new JLabel("hola");
        JLabel label2=new JLabel("hola");
        JLabel label3=new JLabel("hola");
    
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
                panel.add(label);
                 panel.add(label1);
                 panel.add(label2);
                  panel.add(label3);
                  
                   f.add(panel);
    }

}

    

