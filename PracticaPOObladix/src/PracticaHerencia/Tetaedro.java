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
public class Tetaedro extends FiguraTridimensional{
   public double calcularAREA(double ladotetra) {
        return Math.pow(Math.sqrt(2) * ladotetra, 2);

    }

    public double calcularVOLUMEN(double aristas) {
        return Math.pow(Math.sqrt(2) / 12 * aristas, 3);
    }
}
