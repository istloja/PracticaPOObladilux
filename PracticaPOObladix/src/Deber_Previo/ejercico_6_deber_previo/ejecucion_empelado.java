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
public class ejecucion_empelado {
    public static void main(String[] args) {
        Empleado emple = new Empleado("Jonnathan");
Directivo Direc = new Directivo("Vicente");
Operario opera = new Operario("Kevin");
Oficial off = new Oficial("Vanessa");
Tecnico tec = new Tecnico("Ramiro");
System.out.println(emple);
System.out.println(Direc);
System.out.println(opera);
System.out.println(off);
System.out.println(tec);
    }
}
