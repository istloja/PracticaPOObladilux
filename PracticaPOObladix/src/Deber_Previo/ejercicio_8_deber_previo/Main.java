/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Previo.ejercicio_8_deber_previo;

import Deber_Previo.ejercicio_8_deber_previo.Producto;
import Deber_Previo.ejercicio_8_deber_previo.Perecedero;
import Deber_Previo.ejercicio_8_deber_previo.NoPerecedero;

/**
 *
 * @author ISTLOJA12
 */
public class Main {

    public static void main(String[] args) {

        Producto ListaProductos[] = new Producto[3];

        ListaProductos[0] = new Producto("JABON", 2);
        ListaProductos[1] = new Perecedero(1, "SHAMPOO", 1);
        ListaProductos[2] = new NoPerecedero("tipo 1", "CEPILLO", 1);

        double suma = 0;
        for (int i = 0; i < ListaProductos.length; i++) {
            suma = suma + ListaProductos[i].Calcular(5);
        }
        System.out.println("El precio tatal de productos es: " + suma);

    }

}
