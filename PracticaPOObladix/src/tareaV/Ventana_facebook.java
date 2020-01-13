/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaV;
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
import javax.swing.SwingConstants;
public class Ventana_facebook {

 JFrame v= new JFrame();// forma creando un objeto 
    JPanel p= new JPanel();
    
    JButton b= new JButton("ACEPTAR");
    JLabel l= new  JLabel("Facebook");
    JLabel la = new JLabel("contraseña", SwingConstants.CENTER);
     JLabel q= new  JLabel("correo");
    JTextField t= new JTextField(10);
    JTextField t1= new JTextField(20);
    
    public Ventana_facebook(){ //craer un metodo
      
        v.setLocation(200, 200); 
        v.setSize(400, 400);
        agregarComponentes();
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //accio para cerrar la ventana
        v.setVisible(true);
    }
    public void agregarComponentes(){
        v.getContentPane().add(p);
        p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        p.setBackground(Color.white);//color al fondo de la ventana
        l.setForeground(Color.BLUE);//color al texto
        
        t1.setEditable(false);
       p.add(q);  p.add(la);
        p.add(l);
        p.add(t);
        p.add(b);
        p.add(t1);
        p.add(la);
        
    }
     public static void main(String[] args) {
        Ventana_facebook v=new Ventana_facebook(); // llamar el metodo
        
    }
}



    

