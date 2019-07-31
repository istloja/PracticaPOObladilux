/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercico_6_deber_previo;

import Deber_Previo.ejercico_6_deber_previo.Empleado;

/**
 *
 * @author ISTLOJA12
 */
public class Operario extends Empleado {

    //constructor con un parámetro
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Operario");
    }

    //constructor por defecto
    public Operario() {
    }

    //modificación del método toString() para mostrar el mensaje adecuado
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
   
}

