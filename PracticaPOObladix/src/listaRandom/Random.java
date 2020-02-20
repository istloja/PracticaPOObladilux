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
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author USUARIO
 */
public class Random extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JList lista = new JList();

    JTextArea area = new JTextArea();
    JButton B = new JButton(">");

    public Random() {
        super("Aleratorio");
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

        String nombres[] = {"Pedro", "Angel", "Manuel", "Vicente"};

        lista = new JList(nombres);

        panel1.add(lista, b);
        a.gridx = 2;
        a.gridy = 0;
        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.BLACK);
        GridBagConstraints c = new GridBagConstraints();
        b.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;

        panel2.add(B, c);

        a.gridx = 4;
        a.gridy = 0;
        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());

        GridBagConstraints d = new GridBagConstraints();
        d.insets = new Insets(15, 10, 15, 10);

        d.gridx = 0;
        d.gridy = 0;
        panel3.add(area, d);
         B.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int z = lista1(lista.getSelectedIndex());

            }
             private int lista1(int z) {
               
         int a;
        a = ThreadLocalRandom.current().nextInt(0, 4);
                 
                 
 area.setText(nombres[a]);
			
                
                

                 return 0;
             }
         });
             
             }


    
    public static void main(String[] args) {

        Random z = new Random();
    }
}

