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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static jdk.nashorn.tools.ShellFunctions.input;

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
    JTextField text = new JTextField(10);
    JFormattedTextField text1 = new JFormattedTextField(new Integer(3));
    JFormattedTextField text2 = new JFormattedTextField();

    JTextArea area = new JTextArea();
    JButton B = new JButton(">");

    JTextArea ar = new JTextArea();
    JList lista1 = new JList();

    public Random() {
        super("Aleratorio");
        setSize(600, 500);
        setLocation(100, 100);
        componentes();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void componentes() {
        text2.setValue(new Integer(2));
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
        c.gridy = 2;

        panel2.add(B, c);

        c.gridx = 0;
        c.gridy = 0;
        panel2.add(text2, c);
        c.gridx = 0;
        c.gridy = 4;
        panel2.add(ar, c);

        a.gridx = 4;
        a.gridy = 0;
        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());

        GridBagConstraints d = new GridBagConstraints();
        d.insets = new Insets(15, 10, 15, 10);

        d.gridx = 0;
        d.gridy = 0;
        panel3.add(lista1, d);
        B.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int z = lista1(lista.getSelectedIndex());

            }

            public int lista1(int z) {

                aleatorio();
                  
            
                return 0;
            }
        });

    }

    public void aleatorio() {
        String nombres[] = {"Pedro", "Angel", "Manuel", "Vicente"};
       // String nombres2[] = { nombres[a]};
         lista = new JList(nombres);

       

        Integer valor;
        valor = (Integer) text2.getValue();

        int i = 1;
        int al = valor;
        while (i <= al) {
            int a;
            a = ThreadLocalRandom.current().nextInt(0, nombres.length);
            
            
            
            
            String nombres2[] = { nombres[a]};
            if(i==al){
                   lista1.setListData(nombres2);
            }

           
            
            
         
            
                     
          
           
          // lista1.setListData(nombres2);
         

         
                
            //System.out.println(nombres.length);
                //  lista = new JList(nombres);
            i++;

        }

//                
    }

    public static void main(String[] args) {

        Random z = new Random();
    }
}
