/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPOO;

/**
 *
 * @author ist loja
 */
public class Aves extends Animales{
    // de la clase animales private String nombre; objeto.getnombre para llamr a un privado
    //  de la clase animales public String nombre; objeto.setnombre para llamar a un publico
    private int huevos;
    private boolean vuela;
    //constructor
    // primero el constructor vacio despues maracas todos

    public Aves(int huevos, boolean vuela) {
        this.huevos = huevos;
        this.vuela = vuela;
    }

    public Aves(int huevos, boolean vuela, String nombre, double edad, double peso, String color, double altutra) {
        super(nombre, edad, peso, color, altutra);
        this.huevos = huevos;
        this.vuela = vuela;
    }
    
     public Aves() {
    }

    // getter and setter

   
    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
    
    
}
