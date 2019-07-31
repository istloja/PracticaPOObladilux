/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author ist loja
 */
public class Persona {
    //atributos
    String nombre;
    int edad;
    //metodos constructor
    public Persona(String _nombre,int _edad){
    nombre =_nombre;
    edad =_edad;
            }
    public void mostrarDatos(){
        System.out.println("el nombre es :"+nombre);
        System.out.println("La edad es : "+edad);
    }
    
}
