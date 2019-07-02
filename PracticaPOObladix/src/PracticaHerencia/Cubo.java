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
public class Cubo extends FiguraTridimensional{
     public double calcularlongitudcubo(double cubo){
        return Math.pow (cubo,cubo);
    }
    public double calcularvolumencubo(double volumen){
        return volumen*volumen*volumen;
    }
}
    

