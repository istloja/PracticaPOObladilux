/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ISTLOJA_02
 */
public class principal extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel pr = new JLabel("precio");
    JLabel to = new JLabel("total");
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JCheckBox E = new JCheckBox("Estudiante");
    JCheckBox F = new JCheckBox("Fumador");
    JCheckBox M = new JCheckBox("Menor de Edad");
    public JButton C = new JButton("Calcular");
    public JButton S = new JButton("Salir");

    public principal() {
        super("agencia");
        setSize(500, 450);
        setLocation(100, 100);
        viajar();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void viajar() {
        getContentPane().add(panel);
        panel.setBackground(Color.white);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;

        b.anchor = GridBagConstraints.WEST;
        b.insets = new Insets(10, 50, 20, 10);

        panel1.add(pr, b);
        b.gridx = 1;
        b.gridy = 0;
        panel1.add(t1, b);

        b.gridx = 0;
        b.gridy = 1;
        panel1.add(to, b);

        b.gridx = 1;
        b.gridy = 1;
        panel1.add(t2, b);

        a.gridx = 0;
        a.gridy = 1;

        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.green);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        panel2.add(E, c);

        c.gridx = 1;
        panel2.add(F, c);

        c.gridx = 2;
        panel2.add(M, c);

        a.gridx = 0;
        a.gridy = 2;

        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(Color.red);
        GridBagConstraints d = new GridBagConstraints();

        d.gridy = 3;
        panel3.add(C, d);

        d.gridx = 1;
        d.gridy = 3;
        panel3.add(S, d);

        C.addActionListener(new OyenteViaje());
        S.addActionListener(new OyenteViaje());
    }

    public class OyenteViaje implements ActionListener {

        Boleto z = new Boleto();

        public void actionPerformed(ActionEvent e) {
            try {
                //CAPTURO LA ACCION DEL BOTTON CALCULAR
                if (e.getSource() == C) {

                    //OBTENGO EL PRECIO Y FIJO
                    z.setPrecio(Double.parseDouble(t1.getText()));

                    //crear variable para fiajr los calculos y la inicializo con el precio del objeto
                    double a = z.getPrecio();
                    if (E.isSelected() == true && F.isSelected() == true && M.isSelected() == true) {
                        a = z.getPrecio() - (z.descuento("Estudiante") + z.descuento("Fumador") + z.descuento("Menor de Edad"));
                    } else if (E.isSelected() == true && F.isSelected() == true) {
                        a = z.getPrecio() - (z.descuento("Estudiante") + z.descuento("Fumador"));
                    } else if (E.isSelected() == true && M.isSelected() == true) {
                        a = z.getPrecio() - (z.descuento("Estudiante") + z.descuento("Menor de Edad"));
                    } else if (F.isSelected() == true && M.isSelected() == true) {
                        a = z.getPrecio() - (z.descuento("Fumador") + z.descuento("Menor de Edad"));
                    } else if (E.isSelected() == true) {
                        a = z.descuento("Estudiante");

                    } else if (F.isSelected() == true) {
                        a = z.descuento("Fumador");

                    } else if (M.isSelected() == true) {
                        a = z.descuento("Menor de Edad");

                    }
                    t2.setText("" + a);

                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "no inserto ningun valor");
            }
            if (e.getSource() == S) {
                System.exit(0);

            }

        }
    }

  

}
