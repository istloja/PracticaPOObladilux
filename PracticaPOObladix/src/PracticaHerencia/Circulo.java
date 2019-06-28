/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia;



/**
 *
 * @author ist loja
 */
public class Circulo extends FiguraBidimensional{//
    public double calcularArea(double radio){
        return 2 *Math.PI*radio;
    }
    public double calcularPerimetro(double radio){
        return Math.PI* Math.pow (radio,2);
        //
    }

 
    
}

