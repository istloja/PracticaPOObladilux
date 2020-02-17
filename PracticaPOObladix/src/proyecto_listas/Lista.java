/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_listas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.JButton;

/**
 *
 * @author ISTLOJA_02
 */
public class Lista extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    JList lista = new JList();

    JTextArea area = new JTextArea();

    JLabel imagen = new JLabel();

    JButton B;

    public Lista() {
        super("Frutas");
        setSize(600, 500);
        setLocation(100, 100);
        componentes();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void componentes() {
        getContentPane().add(panel);
        panel.setBackground(Color.pink);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.insets = new Insets(15, 10, 15, 10);
        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);
        panel1.setLayout(new GridBagLayout());
    
        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;
        b.insets = new Insets(5, 5, 5, 5);
     
        String artist[] = {"melon", "naranja", "uva"};

     
    
        lista = new JList(artist);

       
        panel1.add(lista, b);
        panel1.setBackground(Color.BLACK);

        a.gridx = 5;
        a.gridy = 0;

        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.BLACK);
        GridBagConstraints c = new GridBagConstraints();
        b.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;

        panel2.add(imagen, c);
        a.gridx = 5;
        a.gridy = 5;
        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());

        GridBagConstraints d = new GridBagConstraints();
        d.insets = new Insets(15, 10, 15, 10);

        d.gridx = 0;
        d.gridy = 0;
        B = new JButton(" Seleccionar");

        panel3.add(area, d);

        d.gridx = 0;
        d.gridy = 5;
        panel3.add(B, d);
        d.insets = new Insets(30, 15, 30, 15);

        B.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int z = lista1(lista.getSelectedIndex());

            }

            private int lista1(int z) {
                if (z == 0) {
                    area.setText("el melon es sabroso ");

                    imagen.setIcon(new ImageIcon("C:\\Users\\ISTLOJA_03\\Pictures\\melon.jpg"));

                }
                if (z == 1) {

                    area.setText("la naranja es buena  en vitamina c  ");
                    imagen.setIcon(new ImageIcon("C:\\Users\\ISTLOJA_03\\Pictures\\naranja.jpg"));

                }
                if (z == 2) {
                    area.setText("la uva es buena para hacer vino");
                    imagen.setIcon(new ImageIcon("C:\\Users\\ISTLOJA_03\\Pictures\\uva.jpg"));

                }

                return 0;
            }

        });

    }

    public static void main(String[] args) {

        Lista z = new Lista();
    }
}
