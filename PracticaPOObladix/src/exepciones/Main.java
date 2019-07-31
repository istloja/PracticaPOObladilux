/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO"); 
        int h=0;
        try {
       h=entrada.nextInt();
       
        }catch(Exception e){
            System.out.println("se genero un error"+e);
            System.out.println("por favor ingrese elo numero correcto");
       
       // try {  
            //Aqui pongo el codigo a proteger
            
           // }catch(Exception e){  lo que va pasar cuando se produce el error
            //Aqui el mensaje
        }
         System.out.println("el numero ingresado es "+h);
         try {
         int resultado=h /0;
         System.out.println(resultado);
         }catch(Exception e){
             System.out.println("no se puede dividir para 0");
         }
         }
            
            
            
    
    

}
