/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercico_6_deber_previo;

import Deber_Previo.ejercico_6_deber_previo.Operario;

/**
 *
 * @author ISTLOJA12
 */
public class Tecnico extends Operario {
    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Tecnico");
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}

