/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaRandom;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRISTINA CALLE
 */
public class Alumnos extends JFrame{
    
    JLabel nom = new JLabel("Nombres ");
    JLabel apell = new JLabel("Apellidos: ");
    JLabel ced = new JLabel("Cedula: ");
    JLabel dire = new JLabel("Direccion ");
    JLabel telf = new JLabel("Telefono ");

    JTextField p = new JTextField(15);
    JTextField t = new JTextField(15);
    JTextField ce = new JTextField(15);
    JTextField dir = new JTextField(15);
    JTextField tel = new JTextField(15);

    JButton aceptar = new JButton("Aceptar");
    JButton cancelar = new JButton("Cancelar");

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    


    public Alumnos() {
        super("agencia");
        setSize(400, 400);
        setLocation(300, 300);
        setVisible(true);
        componentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void componentes() {
        // panel
        getContentPane().add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
//primer
        a.insets = new Insets(15, 10, 15, 10);
        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);

        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.MAGENTA);
        GridBagConstraints b = new GridBagConstraints();

        b.gridx = 0;
        b.gridy = 0;
        panel1.add(nom, b);

        b.gridx = 1;
        b.gridy = 0;
        panel1.add(p, b);
        b.insets = new Insets(15, 10, 15, 10);

        b.gridx = 0;
        b.gridy = 1;
        panel1.add(apell, b);

        b.gridx = 1;
        b.gridy = 1;
        panel1.add(t, b);
        
         b.gridx =1;
        b.gridy = 3;
        panel1.add(ce, b);
        
        b.gridx = 0;
        b.gridy = 2;
        panel1.add(ced, b);
        
        
         b.gridx = 0;
        b.gridy = 3;
        panel1.add(dire, b);
         b.gridx =1;
        b.gridy = 2;
        panel1.add(tel, b);
        
         b.gridx =1;
        b.gridy = 2;
        panel1.add(tel, b);
        
         b.gridx = 1;
        b.gridy = 3;
        panel1.add(ce, b);
        

        // segundo
        a.gridx = 0;
        a.gridy = 1;


        // panel3
        a.gridx = 0;
        a.gridy = 2;

        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.cyan);
        GridBagConstraints d = new GridBagConstraints();
        d.insets = new Insets(15, 10, 15, 10);
        d.gridy = 3;
        panel2.add(aceptar, d);
        d.gridx = 1;
        d.gridy = 3;
        panel2.add(cancelar, d);
        

    }

    
    public static void main(String[] args) {
        Alumnos n=new Alumnos();
    }

   
    

}
    
