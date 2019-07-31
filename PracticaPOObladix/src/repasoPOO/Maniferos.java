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
public class Maniferos extends Animales{
    private  int tiempodegestacion;
    private boolean pelaje;
    
   // geter and setter

    public int getTiempodegestacion() {
        return tiempodegestacion;
    }

    public void setTiempodegestacion(int tiempodegestacion) {
        this.tiempodegestacion = tiempodegestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    // constructor
    

    public Maniferos() {
    }

    public Maniferos(int tiempodegestacion, boolean pelaje) {
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }

    public Maniferos(int tiempodegestacion, boolean pelaje, String nombre, double edad, double peso, String color, double altutra) {
        super(nombre, edad, peso, color, altutra);
        this.tiempodegestacion = tiempodegestacion;
        this.pelaje = pelaje;
    }
    
            
    
}
