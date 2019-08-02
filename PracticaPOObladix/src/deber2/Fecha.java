/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Fecha {
     public static void main(String[] args) {
        int nacimiento;
        int añoactual;
        int edad;
        
        String nac;
        Calendar c= Calendar.getInstance();
        añoactual=c.get(Calendar.YEAR);
        
        nac=JOptionPane.showInputDialog(null, "en que año naciste");
        nacimiento=Integer.parseInt(nac);
    
        
        edad=añoactual-nacimiento;
       
        
        if(edad>18){
            JOptionPane.showMessageDialog(null, "tu edad es "+edad+" años");
            
        }else {
            JOptionPane.showMessageDialog(null, "tu edad es "+edad+" años");
        }
        
        
    }
    
}
