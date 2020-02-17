/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

/**
 *
 * @author ISTLOJA_03
 */
public class Panel extends JFrame {

    JLabel precio = new JLabel("precio: ");
    JLabel total = new JLabel("total: ");

    JTextField p = new JTextField(15);
    JTextField t = new JTextField(15);

    JButton salir = new JButton("salir");
    JButton calcular = new JButton("calcular");

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    JCheckBox estudiante = new JCheckBox("estudiante");
    JCheckBox menor = new JCheckBox("menor");
    JCheckBox fumador = new JCheckBox("fumador");

    public Panel() {
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
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
//primer
      
        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);

        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.pink);
        GridBagConstraints b = new GridBagConstraints();

        b.gridx = 0;
        b.gridy = 0;
        panel1.add(precio, b);

        b.gridx = 1;
        b.gridy = 0;
        panel1.add(p, b);
        b.insets = new Insets(15, 10, 15, 10);

        b.gridx = 0;
        b.gridy = 1;
        panel1.add(total, b);

        b.gridx = 1;
        b.gridy = 1;
        panel1.add(t, b);

        // segundo
        a.gridx = 0;
        a.gridy = 1;

        panel.add(panel2, a);

        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.GREEN);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(15, 10, 15, 10);

        c.gridx = 0;

        panel2.add(estudiante, c);
        c.gridx = 1;

        panel2.add(menor, c);
        c.gridx = 2;

        panel2.add(fumador, c);

        // panel3
        a.gridx = 0;
        a.gridy = 2;

        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(Color.ORANGE);
        GridBagConstraints d = new GridBagConstraints();
        d.insets = new Insets(15, 10, 15, 10);
        d.gridy = 3;
        panel3.add(salir, d);
        d.gridx = 1;
        d.gridy = 3;
        panel3.add(calcular, d);
        calcular.addActionListener(new Oyente());
         salir.addActionListener(new Oyente());

    }

    public class Oyente implements ActionListener {
        
       

        Boleto b = new Boleto();
        
       

 
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == calcular) {
                    b.setPrecio(Double.parseDouble(p.getText()));
                    double a = b.getPrecio();
                    if (estudiante.isSelected() == true) {
                        a = b.descuento("estudiante");

                    } else if (menor.isSelected() == true) {
                        a = b.descuento("menor");

                    } else if (fumador.isSelected() == true) {
                        a = b.descuento("fumador");

                    }
                    t.setText(""+a);
                }
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "no inserto ningun valor");
                
                
            
            }
            if(e.getSource()==salir){
               System.exit(0);
            }

        }

    }

   
    

}
