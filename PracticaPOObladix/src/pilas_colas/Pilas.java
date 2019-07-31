/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_colas;

import java.util.Stack;

/**
 *
 * @author ist loja
 */
public class Pilas {
     public static void main(String[] args) {
        //FILO first-in, lasta-out
        Stack pilas=new Stack();//
        pilas.push(4);    //indice de 0
        pilas.push(3);
        pilas.push(2);// indice de 1
        pilas.push(1);
        pilas.push(0);
        //solo se puede obtener el ultimo valor con peek y sirve para ver el ultimo valor
        System.out.println("el ultimo elemento en la pila es: "+pilas.peek());
        while (pilas.empty()== false )//mientras que la pila no estwe vacia(mientras tenga datos adentro)
        {
            System.out.println(pilas.pop());//pop sirve para obtener el ultimo valor pero ala vez lo va eliminar
       //vaciar la pila
        }
        
    }
    
    
    
}
