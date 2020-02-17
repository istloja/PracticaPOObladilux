/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author ISTLOJA_02
 */
public class V_Inicio extends JFrame{
    JFrame f=new JFrame();
    JPanel p=new JPanel();
    JMenuBar jmb =new JMenuBar();
    JMenu menu1;
    JMenu menu2;
    JMenuItem princi,salir,calcular_Iva;
    public V_Inicio(){
        f.setTitle("ventana inicio");
        f.setSize(500, 450);
        iniciar_componentes();
        f.setLocation(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iniciar_componentes(){
        
        f.setJMenuBar(jmb);
        menu1=new JMenu("PROGRAMAS");
        jmb.add(menu1);
        
        princi=new JMenuItem("Cálculo de Descuentos");
        princi.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(princi);
        
        salir=new JMenuItem("Salir");
        salir.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(salir);
        
        calcular_Iva= new JMenuItem("Cálculo con iva");
        calcular_Iva.addActionListener(new OyenteVentanaPrincipal());
        menu1.add(calcular_Iva);
        
        
        
    }
    public class OyenteVentanaPrincipal implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            if (e.getSource()==salir) {
                System.exit(0);
            }
            if(e.getSource()==princi){
                new principal();
            }
            if(e.getSource()==calcular_Iva){
                new Calcular_iva();
            }
            
        }
    }
    
}
