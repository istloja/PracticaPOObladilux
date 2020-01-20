/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
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
public class VentanaPrincipal extends JFrame {

    JLabel l = new JLabel("que numero de semana estamos?");
    JTextField t = new JTextField(15);
    JButton b = new JButton("chequear");
    JPanel p = new JPanel();
    VentanaResulatdo r ;

    public VentanaPrincipal() {
        super("ventana principal");
          setSize(300, 200);
        setLocation(300, 300);
         setVisible(true);

        agregarComnponentes();
      
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarComnponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);

        p.add(l, c);
        c.gridy = 1;

        p.add(t, c);
        c.gridy = 2;

        p.add(b, c);
        
        
      
            
      
        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (!t.getText().isEmpty()) {
                    comprobar();
                } else {
                    JOptionPane.showMessageDialog(null, "agrega" + "el numero");
                }

            }

        });
                
     }

     public void comprobar() {
        try {
            int num = Integer.parseInt(t.getText());
            Calendar cal = Calendar.getInstance();
            int c = cal.get(Calendar.WEEK_OF_YEAR);
            if (num == c) {
                b.setEnabled(false);
                r = new VentanaResulatdo();
                r.lr.setText("CORRECTO, GANASTE");
                 r.lr.setForeground(Color.green);
                r.br.setText("terminar");
            } else {
                  b.setEnabled(false);
                  r=new VentanaResulatdo();
                 r.lr.setText("INCORRECTO, VUELVE A INTENTAR");
                 r.lr.setForeground(Color.red);
                r.br.setText("TRATA DE NUEVO");
               
               

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "solo numeros");

        }

    }
}
