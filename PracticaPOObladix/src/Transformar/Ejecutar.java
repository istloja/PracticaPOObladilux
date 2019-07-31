/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transformar;

import PracticaHerencia.Circulo;
import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Ejecutar {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   
        System.out.println(" 1 de kilometros a metros 2 metros kilometros 3 millas a metros 4 metros a millas 5 pies a metros 6 metros a pies");
        int valor1= entrada.nextInt();
        switch (valor1){//es como un if pero diferente es universal
            case 1:// opcion
                System.out.println("kILOMETROS A METROS");
                
                double valor=entrada.nextDouble();// creo un objet
                
                Kilometros_a_metros objeto=new Kilometros_a_metros();//
                
                double kiloametro=objeto.KiloaMetro(valor);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son los metros"+kiloametro);
                break;// siempre para detener despues de cada case
            case 2:
                System.out.println(" METROS a kilometros");
                double valor2=entrada.nextDouble();// creo un objeto
                  Kilometros_a_metros objeto1= new  Kilometros_a_metros();               
                
                double  metroKilometro=objeto1.MetroKilometro(valor2);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son los metros"+metroKilometro);
                break;// siempre para detener despues de cada case
            case 3:
                 System.out.println(" kilometros a millas");
                double valor3=entrada.nextDouble();// creo un objeto
                  Kilometros_a_metros objeto3=new Kilometros_a_metros();//              
                
                double  millametro=objeto3.Millametro(valor3);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son los metros "+millametro);
                break;// siempre para detener despues de cada case
            case 4: 
                System.out.println(" millas a metros");
                double valor4=entrada.nextDouble();// creo un objeto
                  Kilometros_a_metros objeto4=new Kilometros_a_metros();//              
                
                double  metrosmillas=objeto4.Metrosmillas(valor4);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son las millas "+ metrosmillas);
                break;// siempre para detener desp
            case 5:
                 System.out.println(" pies metros");
                double valor5=entrada.nextDouble();// creo un objeto
                  Kilometros_a_metros objeto5=new Kilometros_a_metros();//              
                
                double  piesmetros=objeto5.Piesmetros(valor5);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son los metros "+ piesmetros);
                break;// siempre para detener desp
            case 6:
                 System.out.println(" pies metros");
                double valor6=entrada.nextDouble();// creo un objeto
                  Kilometros_a_metros objeto6=new Kilometros_a_metros();//              
                
                double  metrospies=objeto6.Metrospies(valor6);// llamo alas variables de la clase cierculo  area
                
               
                
                System.out.println("estos son los pies  "+ metrospies);
                break;// siempre para detener desp
    
    
}
      }
}

    

