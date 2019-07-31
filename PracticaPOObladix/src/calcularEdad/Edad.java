/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularEdad;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.GregorianCalendar;



/**
 *
 * @author ist loja
 */
public class Edad {

    public static void main(String[] args) {

        Date fechaActual = new Date();// fecha actual
        System.out.println(fechaActual);// imprime fecha
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");// PARA TRANSFORMAR UN STRING A UNA FECHA   declaro en donde 
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese fecha en el formato dd/MM/yyyy");
        String fecha = entrada.nextLine();
        Date fechaNacimiento=null;
        try {
             fechaNacimiento = formato.parse(fecha);//pasando del string a fecha pongo fecha
            System.out.println(fechaNacimiento);
            System.out.println(fechaActual.after(fechaActual));
            
          //  System.out.println(fechaNacimiento.before(fechaActual));
        } catch (Exception e) {
            System.out.println(e);
        }
        GregorianCalendar calendario = new GregorianCalendar();// PERMITE MANEJAR FECHAS para trabajar con enteros
        calendario.setTime(fechaActual);
        int añoactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH)+1;
        int diaactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        GregorianCalendar calendario1=new GregorianCalendar();
        calendario1.setTime(fechaNacimiento);
        int añoactua = calendario1.get(GregorianCalendar.YEAR);
        int mesactua = calendario1.get(GregorianCalendar.MONTH)+1;
        int diaactua = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        
        try{
            int A=añoactual-añoactua;
            int m=mesactual-mesactua;
            int d=diaactual-diaactua;
            System.out.println("tu edfad es "+" años "+A+" meses "+m+" dias "+d);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    

    }
}
