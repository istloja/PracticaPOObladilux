/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ist loja
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar();// para llamra un metodo estatico
        
        // Si quiero llamar despedir debo crear un objeto
        EstaticosyDinamicos objeto=new  EstaticosyDinamicos();// crear objeto
        objeto.despedir();
        
    }
    public static void saludar(){// Este es un metodo Estatico
        System.out.println("Hola");
    }
     
    public void despedir(){ // Este es un metodo No Estatico
        System.out.println("Chao");
        
    }
    
}
