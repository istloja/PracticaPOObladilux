/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

/**
 *
 * @author ISTLOJA_03
 */
public class Inicio extends JFrame {

    JFrame f = new JFrame();
    JPanel p = new JPanel();
    JMenuBar bara = new JMenuBar();//es la barra
    JMenu menu1;
    JMenu menu2;
    JMenuItem descuento, misalir,internal;

    public Inicio() {
        f.setTitle("INICIO");
        f.setSize(400, 400);
        f.setLocation(300, 300);
        f.setVisible(true);
        componentes1();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void componentes1() {
        f.setJMenuBar(bara);
        menu1 = new JMenu("Programas");
        bara.add(menu1);

        descuento = new JMenuItem("calculo de descuentos");
        descuento.addActionListener(new OyenteInicio());
        menu1.add(descuento);

        misalir = new JMenuItem("salir");
        misalir.addActionListener(new OyenteInicio());
        menu1.add(misalir);
        
        internal= new JMenuItem("internal");
            internal.addActionListener(new OyenteInicio());
        menu1.add(internal);

    }

    public class OyenteInicio implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == misalir) {
                System.exit(0);
            }
            if (e.getSource() == descuento) {
                new Panel();
            }
            if (e.getSource() == internal) {
                new  PruebaInternalFrame();
            }


        }

    }

}
