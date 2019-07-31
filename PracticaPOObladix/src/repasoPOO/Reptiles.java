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
public class Reptiles extends Animales{
    private boolean escamas;
    private String comida;

    public Reptiles() {
    }

    public Reptiles(boolean escamas, String comida) {
        this.escamas = escamas;
        this.comida = comida;
    }

    public Reptiles(boolean escamas, String comida, String nombre, double edad, double peso, String color, double altutra) {
        super(nombre, edad, peso, color, altutra);
        this.escamas = escamas;
        this.comida = comida;
    }
    

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

   
            
    
}
