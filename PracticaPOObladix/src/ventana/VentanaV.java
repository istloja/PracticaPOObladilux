/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJAV
 */


public class VentanaV {
    JFrame v= new JFrame();// forma creando un objeto 
    JPanel p= new JPanel();
    JButton b= new JButton("ACEPTAR");
    JLabel l= new  JLabel("Agregar Texto");
    JTextField t= new JTextField(20);
    JTextField t1= new JTextField(20);
    
    public VentanaV(){ //craer un metodo
        v.setTitle("MI PRIMERA VENTANA");
        v.setLocation(200, 200); 
        v.setSize(400, 400);
        agregarComponentes();
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accio para cerrar la ventana
        v.setVisible(true);
    }
    public void agregarComponentes(){
        v.getContentPane().add(p);
        p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        p.setBackground(Color.yellow);//color al fondo de la ventana
        l.setForeground(Color.red);//color al texto
        t1.setEditable(false);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String texto=t.getText();
                if(!texto.isEmpty()){
                    t.setText(" ");
                    t1.setText(texto);
                }else{
                    JOptionPane.showMessageDialog(null, "Escribe en la barra");
                }
                
            }
        });
        p.add(l);
        p.add(t);
        p.add(b);
        p.add(t1);
    }
    
}


    

