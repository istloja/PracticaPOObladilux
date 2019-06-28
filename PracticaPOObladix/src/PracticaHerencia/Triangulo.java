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
public class Triangulo extends FiguraBidimensional{//
    public double calcularPerimetro(double lado1,double lado2, double lado3){
        return lado1+lado2+lado3;
    }
    public double calcularArea(double base, double altura){
        return (base*altura);
        //
    }

    
    }
    

