/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Ejecutar_letras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese  el texto");
        String texto = entrada.nextLine();//  leo
        
        Letras objeto = new Letras();//creo un objeto

        String ar = objeto.mayusculaAminiscula(texto);// llamo al metodo
        
        Letras objeto1=new Letras();
        String er=objeto1.minuculaAmayuscula(texto);
        
      
        
        
        
        

    }
}
