/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2;

/**
 *
 * @author USUARIO
 */
public class Matematicas {

    public double suma(double numero, double numero1) {

        return (numero + numero1);

    }
     public double resta(double resta, double resta1) {

        return (resta - resta1);
}
     public double multiplicacion(double mul, double mul1) {

        return (mul * mul1);
}
      public double division(double d, double d1) {

        return (d /d1);
}
       public double potencia(double p, double p2) {
 double resultado = 1;

        for (double i = 1; i <= p2; i++) {

            resultado = resultado * p;

        }

        return resultado;
}
}
