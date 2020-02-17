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
import java.util.ArrayList;
import static java.util.Arrays.equals;
import static java.util.Arrays.equals;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicListUI;

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


    //JLabel imagen = new JLabel();
    ImageIcon imagen1 = new ImageIcon("C:\\Users\\USUARIO\\Pictures\\jenny.jpg");
    ImageIcon imagen2 = new ImageIcon("C:\\Carpeta Img\\imagen2.jpg");
    ImageIcon imagen3 = new ImageIcon("C:\\Carpeta Img\\imagen1.jpg");

    JButton B;

    public Lista() {
        super("Artistas");
        setSize(600, 500);
        setLocation(100, 100);
        componentes();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //imagen.setIcon(new ImageIcon("C:\\Users\\ISTLOJA_02\\Pictures\\i.jpg"));
    }

    public void componentes() {
        getContentPane().add(panel);
        panel.setBackground(Color.white);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(Color.white);
        GridBagConstraints b = new GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;

        //String artist
        String artist[] = {"marc anthony", "ricky martin", "shakira"};

        //create list 
        lista = new JList(artist);

        //set a selected index 
        //add list to panel 
        
        
        panel1.add(lista, b);
        
       
        

        a.gridx = 2;
        a.gridy = 0;

        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;

        // panel2.add(imagen, c);
        a.gridx = 5;
        a.gridy = 5;

        panel.add(panel3, a);
        panel3.setLayout(new GridBagLayout());
        panel3.setBackground(Color.red);
        GridBagConstraints d = new GridBagConstraints();
        panel3.setBackground(Color.BLUE);

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
                    area.setText("cantante de salsa  ");

                    System.out.println(imagen1);


                }
                if (z== 1) {

                    area.setText("cantante de musica urbana  ");
                    System.out.println(imagen2);


                }
                if (z == 2) {
                    area.setText("es una mujer talentosa");
                    System.out.println(imagen3);

                }

                return 0;
            }

        });
   
    }
    public static void main(String[] args) {
         
        Lista o = new Lista();
    }
}
