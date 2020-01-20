/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ISTLOJAV
 */
public class VentanaResulatdo extends JFrame {

    JLabel lr = new JLabel("texto");
    JButton br = new JButton("texto");
    JPanel pr = new JPanel();

    public VentanaResulatdo() {
        super("ventana resultado");
        setSize(300, 300);
        setLocation(700, 300);

        setVisible(true);
        agregarComponentes();
        // cierra la ventana

    }

    public void agregarComponentes() {
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridy = 1;
        pr.add(lr, c);
        pr.add(br);
        br.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (br.getText() == "terminar") {
                    System.exit(0);
                } else {
                    dispose();
                   
                }
            }

        });
    }
}
