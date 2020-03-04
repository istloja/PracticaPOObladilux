/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.sun.jmx.snmp.BerDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SOFT06
 */
public class main extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel dni = new JLabel("dni");
    JLabel edad = new JLabel("edad");
    JLabel nombre = new JLabel("nombre");
    JLabel apellido = new JLabel("apellido");
    JLabel fecha = new JLabel("fechaNacimiento");
    JLabel correo = new JLabel("correo");
    JLabel telefono = new JLabel("telefono");

    JTextField tnombre = new JTextField(10);
    JTextField tedad = new JTextField(10);
    JTextField tdni = new JTextField(10);

    JTextField tapellido = new JTextField(10);
    JTextField tfecha = new JTextField(10);
    JTextField tcorreo = new JTextField(10);
    JTextField ttelefono = new JTextField(10);
    JButton aceptar = new JButton("Guardar");
    JButton mostrar = new JButton("mostrar");
    JButton eliminar = new JButton("eliminar");
    JTextArea area = new JTextArea("area");

    public main() {

        super("Estudiantes");
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

        a.gridx = 0;
        a.gridy = 0;
        panel.add(panel1, a);
        panel1.setLayout(new GridBagLayout());

        GridBagConstraints b = new GridBagConstraints();

        b.gridx = 0;
        b.gridy = 0;

        panel1.add(nombre, b);

        b.gridx = 2;
        b.gridy = 0;
        panel.add(tnombre, b);
        b.gridx = 0;
        b.gridy = 1;
        panel.add(apellido, b);
        b.gridx = 2;
        b.gridy = 1;
        panel.add(tapellido, b);

        b.gridx = 0;
        b.gridy = 3;
        panel.add(fecha, b);
        b.gridx = 2;
        b.gridy = 3;
        panel.add(tfecha, b);

        b.gridx = 0;
        b.gridy = 4;
        panel.add(correo, b);
        b.gridx = 2;
        b.gridy = 4;
        panel.add(tcorreo, b);

        b.gridx = 0;
        b.gridy = 5;
        panel.add(telefono, b);
        b.gridx = 2;
        b.gridy = 5;
        panel.add(ttelefono, b);
        b.gridx = 0;
        b.gridy = 6;
        panel.add(edad, b);

        b.gridx = 2;
        b.gridy = 6;
        panel.add(tedad, b);
        b.gridx = 0;
        b.gridy = 7;
        panel.add(dni, b);
        b.gridx = 2;
        b.gridy = 7;
        panel.add(tdni, b);

        a.gridx = 2;
        a.gridy = 8;
        panel.add(panel2, a);
        panel2.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;

        panel2.add(aceptar, c);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        panel2.add(mostrar, c);
        c.gridx = 2;
        c.gridy = 0;

        panel2.add(eliminar, c);
        c.gridx = 0;
        c.gridy = 2;
        panel2.add(area, c);

        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Estudiante es = new Estudiante();

                ConeccionBD bs = new ConeccionBD(
                        "C:\\Users\\ISTLOJA_03\\Desktop\\estudiante.yap");
                ;
                
                
                 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "07/06/2013";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
              
                String da = tfecha.getText();
                es.setDni(tdni.getText());
                es.setNombre(tnombre.getText());
                es.setApellido(tapellido.getText());
                es.setEdad(Integer.valueOf(tedad.getText()));
                es.setF_nacimiento(new Date(da));
                es.setCorreo(tcorreo.getText());
                es.setTelefono(ttelefono.getText());
                bs.agregarEstudiante(es);

//                     
//         
//     
            }
        });
        eliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ConeccionBD bs = new ConeccionBD(
                        "C:\\Users\\ISTLOJA_03\\Desktop\\estudiante.yap");
                bs.eliminarEstudiantes(null);

//     
            }
        });
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ConeccionBD bs = new ConeccionBD(
                        "C:\\Users\\ISTLOJA_03\\Desktop\\estudiante.yap");
                bs.traerEstudiantes(null, null);

//     
            }
        });
//                
//                
    }

    public static void main(String[] args) {
        main an = new main();

       

    }

}
