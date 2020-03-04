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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author SOFT06
 */
public class main  extends JFrame{
    

    
     JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel nombre = new JLabel("nombre");
    JLabel apellido = new JLabel("apellido");
    JLabel fecha = new JLabel("fechaNacimiento");
    JLabel correo = new JLabel("correo");
    JLabel telefono = new JLabel("telefono");
    
    
    JTextField tnombre = new JTextField(10);

    JTextField tapellido = new JTextField(10);
     JTextField tfecha = new JTextField(10);
      JTextField tcorreo = new JTextField(10);
       JTextField ttelefono = new JTextField(10);
    JButton aceptar = new JButton("Guardar");
    JButton mostrar = new JButton("mostrar");
    JTextArea area=new JTextArea("ggg");

    public main() {
        
        super("Estudiantes");
        setSize(600, 500);
        setLocation(100, 100);
        componentes();
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    
     public static void agregarEstudiante(ObjectContainer ob, Estudiante estudiante) {
        ob.store(estudiante);
        System.out.println("EstudianteAlmacenado" + estudiante);
    }
     public static void traerEstudiante(ObjectContainer ob) {
        Estudiante estudiante = new Estudiante(null, null,null,null,null);
        ObjectSet objectSet = ob.queryByExample(estudiante);
        traerEstudiantes(objectSet);
        ob.close();
    }
      public static void traerEstudiantes(ObjectSet result) {
        System.out.println("Número de Items" + result.size());
        while (result.hasNext()) {
            System.out.println(result.next());
            System.out.println("\n_____________\n");

        }
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
        b.insets = new Insets(5, 5, 5, 5);
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
        
        
        
        
        
         
        a.gridx = 0;
        a.gridy = 7;
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
        c.gridx = 0;
        c.gridy = 2;
        panel2.add(area, c);

        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
               
             
               
                    
                      ConeccionBD bs = new ConeccionBD();
          ObjectContainer ob = bs.coneccionBD(
                "C:\\Users\\USUARIO\\Desktop\\estudiante.yap");
        agregarEstudiante(ob, new Estudiante(tnombre.getText(), tapellido.getText(),tfecha.getText(),tcorreo.getText(),ttelefono.getText()));
       
     
            }
        });
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
               
             
               
                    
                      ConeccionBD bs = new ConeccionBD();
          ObjectContainer ob = bs.coneccionBD(
                "C:\\Users\\USUARIO\\Desktop\\estudiante.yap");
        
       traerEstudiante(ob);
       
       
       
       
      
                      
                 
      
                   
                    
                
            }
        });

    }
    

    public static void main(String[] args) {
        main y=new main();
         
         
         
       
    }

//    public static void agregarEstudiante(ObjectContainer ob, Estudiante estudiante) {
//        ob.store(estudiante);
//        System.out.println("EstudianteAlmacenado" + estudiante);
//    }

//    public static void traerEstudiantes(ObjectSet result) {
//        System.out.println("Número de Items" + result.size());
//        while (result.hasNext()) {
//            System.out.println(result.next());
//            System.out.println("\n_____________\n");
//
//        }
//    }

//    public static void traerEstudiante(ObjectContainer ob) {
//        Estudiante estudiante = new Estudiante(null, null);
//        ObjectSet objectSet = ob.queryByExample(estudiante);
//        traerEstudiantes(objectSet);
//        ob.close();
//    }
}
