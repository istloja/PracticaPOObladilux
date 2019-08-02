/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercioo_7_deber_previo;

/**
 *
 * @author ISTLOJA12
 */
public class ejecutar {

    public static void main(String[] args){

        Comercial c1=new Comercial(2000,"Jonnathan", 10,10);
        Repartidor R1=new Repartidor(3,"Jacson",80,00);
         Repartidor R2=new Repartidor(3,"Maria",10,200);
        
        c1.Plus();
        R1.Plus();
        R2.Plus();
        c1.mostrarDatos();
        R1.mostrarDatos();
        R2.mostrarDatos();
        System.out.println(c1.getSalario());
         }
    
}
