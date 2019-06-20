/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ist loja
 * // muestra la diferencia entre los metodos void y los que devuelven datos tipo objeto
 * // o tipos primitivos
 */
public class VoidyDatos {
    public void sumar(int numero1, int numero2){// recibe 2 numeros de tipo entero
        System.out.println("la suma es"+(numero1+numero2));//presenta el resultado
        // no guarad el resultado no se alamcena en una variable
    }
    // los metodos que devuelven datos pueden ser de diferentes ti`pos como
    //int double String char boolean y tambien pueden ser objetos
  public int sumar1 (int numero1,int numero2){
      return numero1+numero2;
  }
  public String UnirCadenas(String cadena1 , String cadena2){
    return cadena1+cadena2;
}
  public boolean iniciaSecion(String usuario, String pasword){
      boolean valor =false;
      String user,pas;
       
      if (usuario.equals("admin")&& pasword.equals("1234")){
          valor=true;
      }
      return valor;
  }
        
        
    
    public static void main(String[] args) {//llamo al metodo de arriba para ahorrar tiempo metodo void recibe datos 
        //y la presenta en pantalla nada mas
        VoidyDatos objeto = new VoidyDatos();// creamos objeto
        objeto.sumar(10,8);// llamamos al metodo sumar y enviamos 2 numeros
        objeto.sumar(11,23);
        int resultado=objeto.sumar1(40,10);// guarado lo que devuelve el metodo sumar1
        System.out.println("la suma es"+ resultado);
        // se guarda en una variable para poder jutiliozar laas veces que quiera resultado
        int resultado1=objeto.sumar1(50,20);
        System.out.println(resultado1+resultado);
        String cadena=objeto.UnirCadenas("hola","mundo");
        System.out.println("la cadena unida es  "+cadena);
        
        boolean inicio=objeto.iniciaSecion("admin","123");
        System.out.println(inicio);
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese usuario");
      String user = entrada.nextLine();
        System.out.println("ingrse contraceña");
      
       String pas = entrada.nextLine();
       boolean iniciaSecion=objeto.iniciaSecion(user, pas);
       if (iniciaSecion){
           System.out.println("bienvenidom al sistema");
       }
       else
       {
           System.out.println("credencial incorrecta");
       }
       
       
        
        
    }
    
}
