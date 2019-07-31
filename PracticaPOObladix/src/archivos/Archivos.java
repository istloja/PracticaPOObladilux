/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ist loja
 */
public class Archivos {
//    public static void main(String[] args) { //1 metodo para archivos y carpetas
//        File archivo=new File("C:\\Users\\ist loja\\Desktop/ejemplo.txt");//Creo un objewto de la clase archivo
//         // entre las comillas va el nombre del archivo
//       
//        System.out.println(archivo.exists());// saber si existe el archivo con boolean
//        System.out.println(archivo.isDirectory());// saber si es una carpeta
//        System.out.println(archivo.isFile());// saber si es archivo
//        System.out.println(archivo.isHidden());// saber si esta oculto
//        System.out.println(archivo.lastModified());//saber ultima fecha de modificacion
//        System.out.println(archivo.lastModified());
//        archivo.delete();
//        File carpeta=new File("C:\\Users\\ist loja\\Desktop/");//para sdaber que archivos hay en una carpeta
//        // que es un arreglo una estructura collecion archivos del mismo tipo 
//        //carpeta.list(); devuelve un arreglo con los archivods de una carpeta y guarad en el arreglo
//        String [] arregloarchivos=carpeta.list();// cuando [] es un arreglo  String [] arregloarchivos
//        for (int i = 0; i < arregloarchivos.length; i++) {
//            System.out.println(arregloarchivos[i]);
//                
//            }
//        
//    }
    public static void main(String[] args) {
        /// aqui llamo los metodos desde el main
        Archivos objeto=new Archivos();
         Scanner entrada = new Scanner(System.in);
         System.out.println("ingrese lo que desea ingresar");
         String hola=entrada.nextLine();
        objeto.leerArchivo("C:\\Users\\ist loja\\Desktop/ejemplo.txt");
        objeto.escribirArchivo("C:\\Users\\ist loja\\Desktop/ejemplo.txt",hola);
        
    }
    public void leerArchivo(String direccion){
        
        // vamos a escribir dentro de un archivo
        // leer archivo
        
        File archivo=new File(direccion);
        try{
        FileReader reader =new FileReader(archivo);// nos convierte el archivo en un objeto
        BufferedReader recorrido =new BufferedReader(reader);// recorro el archivo
        String linea;
        while((linea=recorrido.readLine())!=null){
            System.out.println(linea);
        }
    }catch (IOException e){
            System.out.println(e);
    }
    
    
}// escribir en el earchivo
    public void escribirArchivo(String direccion ,String texto){
        try{
        FileWriter archivo =new FileWriter(direccion);// direccion
            PrintWriter escribir=new PrintWriter(archivo);// seleciono archivo
            
            escribir.println(texto);//escribir texto
             
            archivo.close();// cieero el archivo para q se guarde
    }catch(Exception e){
            System.out.println(e);
    }
        
    }
}
