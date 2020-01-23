/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoTexto;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 *
 * @author ISTLOJA12
 */
public class Ventana1 extends JFrame {

    private JTextField campoTexto;
    private JCheckBox negritaCheckBox;
    private JCheckBox cursivaCheckBox;

    public Ventana1() {
        super("texto");
        setLayout(new FlowLayout());
//        setSize(350, 100);
//        setLocation(300, 300);
//        setVisible(true);

//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        campoTexto = new JTextField("OBSERVE", 27);
        campoTexto.setFont(new Font("SERIF", Font.PLAIN, 14));
        add(campoTexto);
        negritaCheckBox = new JCheckBox("negrita");
        cursivaCheckBox = new JCheckBox("cursiva");
        add(negritaCheckBox);
        add(cursivaCheckBox);
        manejadorCheckBox manejador = new manejadorCheckBox();
        negritaCheckBox.addItemListener(manejador);
        cursivaCheckBox.addItemListener(manejador);
    }

    private class manejadorCheckBox implements ItemListener {

        public void itemStateChanged(ItemEvent evento) {
            Font tipoletra = null;
            if (negritaCheckBox.isSelected() && cursivaCheckBox.isSelected()) {
                tipoletra = new Font("serif", Font.BOLD + Font.ITALIC, 14);
            } else if (negritaCheckBox.isSelected()) {
                tipoletra = new Font("Serif", Font.BOLD, 14);

            } else if (cursivaCheckBox.isSelected()) {
                tipoletra = new Font("serif", Font.ITALIC, 14);
                } else
                tipoletra=new Font("seri",Font.PLAIN,14);
                campoTexto.setFont(tipoletra);
            }

        }
       public static void main(String[] args) {
        Ventana1 v=new Ventana1();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setSize(350, 100);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }

    }
