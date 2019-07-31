/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscar;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Buscar {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" 1 archivos documentos 2 imagenes 3 musica 4 videos 5 archivos de netbeans");
        int valor = 0;
        try {
            valor = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("ingrese un numero correcto");
        }
        switch (valor) {
            case 1:
                File carpeta=new File("C:\\Users\\ist loja\\Documents");
                 String [] arregloarchivos=carpeta.list();// cuando [] es un arreglo  String [] arregloarchivos
                for (int i = 0; i < arregloarchivos.length; i++) {
                  System.out.println(arregloarchivos[i]);
                  }
            case 2:
                File carpeta1=new File("C:\\Users\\ist loja\\Pictures");
                 String [] arregloarchivo=carpeta1.list();// cuando [] es un arreglo  String [] arregloarchivos
                for (int i = 0; i < arregloarchivo.length; i++) {
                  System.out.println(arregloarchivo[i]);
                  }
            case 3:
                 File carpeta2=new File("C:\\Users\\ist loja\\Music");
                 String [] arregloarchiv=carpeta2.list();// cuando [] es un arreglo  String [] arregloarchivos
                for (int i = 0; i < arregloarchiv.length; i++) {
                  System.out.println(arregloarchiv[i]);
                  }
            case 4:
                File carpeta3=new File("C:\\Users\\ist loja\\Videos");
                String [] arregloarchiv1=carpeta3.list();// cuando [] es un arreglo  String [] arregloarchivos
                for (int i = 0; i < arregloarchiv1.length; i++) {
                  System.out.println(arregloarchiv1[i]);
                }
            case 5:
                File carpeta4=new File("C:\\Users\\ist loja\\Documents\\NetBeansProjects");
                String [] arregloarchiv2=carpeta4.list();// cuando [] es un arreglo  String [] arregloarchivos
                for (int i = 0; i < arregloarchiv2.length; i++) {
                  System.out.println(arregloarchiv2[i]);
                }
            
                
            default:
                System.out.println("ingrse numero del 1 al 5");
                
                
                  
                
                
                
                
                        
                
        }
    
}

}

