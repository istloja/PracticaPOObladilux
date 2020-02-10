/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

/**
 *
 * @author ISTLOJA_03
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class PruebaInternalFrame {
    
//    Un JInternalFrame es una ventana que va metida dentro de un panel y no puede salirse de él.
//    En java el panel adecuado y especializado en el manejo de JInternalFrame es el JDesktopPane.

    public PruebaInternalFrame() {
        JLabel n = new JLabel("nota");
         JLabel n1 = new JLabel("nota");
        JPanel p = new JPanel();
        JTextField t=new JTextField(10);
        JTextField t2=new JTextField(10);
        
        JFrame v = new JFrame("JInternalFrame");

        JDesktopPane exterior = new JDesktopPane();

        v.getContentPane().add(exterior);

        // Se construye el panel que ira dentro del JInternalFrame
        p.setLayout(new GridBagLayout());
        GridBagConstraints a = new GridBagConstraints();
        a.gridx = 0;
        a.gridy = 0;
        p.add(n,a);
         a.gridx = 1;
        a.gridy = 0;
        p.add(t,a);
         a.gridx = 0;
        a.gridy = 1;
        p.add(n1,a);
          a.gridx = 1;
        a.gridy = 1;
        p.add(t2,a);
        
        p.setBackground(Color.magenta);
        exterior.setBackground(Color.yellow);

        // Se construye el JInternalFrame
        JInternalFrame internal = new JInternalFrame("Uso de notas");
        internal.add(p);

        // Es importante darle tamaño -pack()- al JInternalFrame,
        // porque si no, tendrá tamaño 0,0 y no lo veremos.
        internal.setSize(200, 150);

        // Por defecto el JInternalFrame no es redimensionable ni
        // tiene el botón de cerrar, así que se lo ponemos.
        internal.setResizable(true);
        internal.setClosable(true);

        // Se mete el internal en el JDesktopPane
        exterior.add(internal);
      

        // Se visualiza todo.
        v.setSize(500, 500);
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        internal.setVisible(true);
    }

    public static void main(String[] args) {
        PruebaInternalFrame osw = new PruebaInternalFrame();

    }
}
